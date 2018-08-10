package com.taotao.rest.dao;

public interface JedisClient {

	String get(String key);
	String set(String key, String value);
	String hget(String hkey, String key);
	long hset(String hkey, String key, String value);
	long incr(String key);
	long expire(String key, int second);//设置key的 有效时间
	long ttl(String key);//查看key是否过期
	long del(String key);//删除成功返回 1 
	long hdel(String hkey, String key);//删除成功返回 1 
	
}
