package com.octopus.service.domain;

public class SuccessResponse {
	
	
	public Integer code;
	public String message;
	
	public SuccessResponse(Integer code, String message) {
		this.code = code;
		this.message = message;
	}
	
	
	public Integer getCode() {
		return code;
	}
	public String getMessage() {
		return message;
	}

}
