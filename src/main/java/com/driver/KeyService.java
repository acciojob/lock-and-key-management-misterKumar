package com.driver;

public class KeyService {
    private KeyRepository keyRepository;

    public KeyService(KeyRepository keyRepository) {
        this.keyRepository = keyRepository;
    }

    public void addKey(int id, String type, String description) {
    	//your code goes here
    }

    public Key getKeyById(int id) {
    	//your code goes here
        return keyRepository.getKeyById(id);
    }
}
