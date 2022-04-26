package com.hcl.canceltrx.exceptionhandler;

import java.io.Serializable;

public class ErrorResponse implements Serializable{
	
	public ErrorResponse(String error) {
		super();
		this.error = error;
	}

	private String error;

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
	

}
