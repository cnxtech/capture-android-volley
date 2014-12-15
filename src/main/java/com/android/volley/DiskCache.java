package com.android.volley;

/**
 * User: paveldolgov
 * Date: 1/29/14
 */
public interface DiskCache {

    void put(String key, byte[] value);


    void putIfNotExists(String key, byte[] value);


    byte[] getBytes(String key);

}
