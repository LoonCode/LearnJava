package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Service;

/**
 * Created by loon on 16/5/19.
 */
@Service
public class RedisService {

    @Autowired
    private RedisTemplate<String, Object> template;

    public Object getValue(final String key) {
        return template.opsForValue().get(key);
    }

    public void setValue(final String key, final String value) {
        template.opsForValue().set(key, value);

        // set a expire for a message
        // template.expire(key, 5, TimeUnit.SECONDS);
    }


    public void publish(final String message) {
        template.execute(
                new RedisCallback<Long>() {
                    @SuppressWarnings("unchecked")
                    public Long doInRedis(RedisConnection connection) throws DataAccessException {
                        return connection.publish(
                                ((RedisSerializer<String>) template.getKeySerializer()).serialize("queue"),
                                ((RedisSerializer<Object>) template.getValueSerializer()).serialize(message));
                    }
                }
        );
    }
}
