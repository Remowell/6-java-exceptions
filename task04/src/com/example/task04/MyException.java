package com.example.task04;

public class MyException extends IllegalArgumentException{
    public MyException(String str) {
        super(str);
    }
}