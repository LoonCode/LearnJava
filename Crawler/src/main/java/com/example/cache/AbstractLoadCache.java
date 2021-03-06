package com.example.cache;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by GuoLong on 14-7-8.
 */
public abstract class AbstractLoadCache<K, V> {

    /**
     *
     */
    public LoadingCache<K, V> cache = CacheBuilder.newBuilder()
            .refreshAfterWrite(30, TimeUnit.DAYS)
            .maximumSize(500)
            .build(new CacheLoader<K, V>() {
                @Override
                public V load(K key) throws Exception {
                    return getData(key);
                }

            });

    public abstract V getData(K key) throws IOException;

    public LoadingCache<K, V> getCache() {
        return cache;
    }

}
