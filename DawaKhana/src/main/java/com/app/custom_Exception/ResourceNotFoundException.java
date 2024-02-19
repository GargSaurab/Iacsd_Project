package com.app.custom_Exception;

public class ResourceNotFoundException extends RuntimeException{
public ResourceNotFoundException(String mesg) {
	super(mesg);
}

}
