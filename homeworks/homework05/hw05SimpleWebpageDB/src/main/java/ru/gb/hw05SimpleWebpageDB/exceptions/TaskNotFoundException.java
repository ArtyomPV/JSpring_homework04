package ru.gb.hw05SimpleWebpageDB.exceptions;

public class TaskNotFoundException extends RuntimeException{

    public TaskNotFoundException(String message){
        super(message);
    }
}
