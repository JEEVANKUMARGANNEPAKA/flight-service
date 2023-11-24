package com.jeevankumar.demo.exception;

public class InsufficientAmountException extends RuntimeException{

    public InsufficientAmountException(String msg){
        super(msg);
    }
}
