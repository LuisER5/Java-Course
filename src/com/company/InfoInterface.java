package com.company;

public interface InfoInterface {

    default void message() {
        System.out.println("This is a message");
    }
}
