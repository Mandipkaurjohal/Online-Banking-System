package com.banking.Online.Banking.System.exception;
// create custom exception if data will not find in database. instead of returning null im returning meaning full message to client
public class ResourcesNotFoundException extends RuntimeException{

    public ResourcesNotFoundException(String message){
        super(message);
    }
}
