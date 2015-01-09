package com.example.cache;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

/**
 * Created by GuoLong on 14-7-8.
 */
public abstract class AbstractLoadCache<K, V> {

    public LoadingCache<K, V> cache = CacheBuilder.newBuilder()
            .softValues()
            .build(new CacheLoader<K, V>() {
                @Override
                public V load(K key) throws Exception {
                    return getData(key);
                }

            });

    public abstract V getData(K key);

    public LoadingCache<K, V> getCache() {
        return cache;
    }

    public void setCache(LoadingCache<K, V> cache) {
        this.cache = cache;
    }
}
