package com.driver;

public class KeyService {
    private KeyRepository keyRepository;

    public KeyService(KeyRepository keyRepository) {
        this.keyRepository = keyRepository;
    }

    public void addKey( String type, String description) {
    	//your code goes here
        Key key = new Key(0, type, description); // ID will be set by the repository
        keyRepository.addKey(key);
        System.out.println("Key saved with ID: " + key.getId());
    }

    public Key getKeyById(int id) {
    	//your code goes here
        return keyRepository.getKeyById(id);
    }
}
