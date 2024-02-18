package com.app.custom_Exception;

public class ApiException extends RuntimeException{
public ApiException(String mesg) {
	super(mesg);
}
}
