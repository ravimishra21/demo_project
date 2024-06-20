package com.project.exception;

public class DataNotCreatedException extends RuntimeException  {

	private static final long serialVersionUID = 1L;

	public DataNotCreatedException(String msg) {
		super(msg);
	}
}
