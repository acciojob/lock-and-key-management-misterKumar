package com.driver;

import java.util.HashMap;
import java.util.Map;

public class KeyRepository {
    private Map<Integer, Key> keyMap;

    public KeyRepository() {
        this.keyMap = new HashMap<>();
    }

    public void addKey(Key key) {
    	//your code goes here
        keyMap.put(key.getId(), key);
    }

    public Key getKeyById(int id) {
    	//your code goes here
        return keyMap.get(id);
    }
}
