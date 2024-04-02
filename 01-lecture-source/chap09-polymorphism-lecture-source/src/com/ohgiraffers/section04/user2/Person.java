package com.ohgiraffers.section04.user2;

public class Person {
    private SaveProvider saveProvider;

    public Person(SaveProvider saveProvider) {
        this.saveProvider = saveProvider;
    }

    public void doSomthing(){
        String data = "String data";

        saveProvider.save(data);
    }
}
