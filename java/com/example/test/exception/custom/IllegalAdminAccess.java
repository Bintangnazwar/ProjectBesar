package com.example.test.exception.custom;

public class IllegalAdminAccess extends Exception {
    public IllegalAdminAccess(String message) {
        super(message);
    }
}