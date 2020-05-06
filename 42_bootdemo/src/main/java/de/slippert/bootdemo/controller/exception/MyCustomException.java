package de.slippert.bootdemo.controller.exception;

public class MyCustomException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public MyCustomException(String errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}

	String errorCode;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getErrorCode() {
		return errorCode;
	}

}
