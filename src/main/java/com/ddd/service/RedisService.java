package com.ddd.service;

/**
 * @author zyb
 * @create 2021/1/3 17:49
 */
public interface RedisService {
    void set(String key, String value);

    String get(String key);

    boolean expire(String key,long expire);

    void remove(String key);

    Long increment(String key,long delta);
}
