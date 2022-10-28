package com.mipresupuesto.personalbudget.crosscutting.exception;


import static com.mipresupuesto.personalbudget.crosscutting.utils.UtilObject.*;
import static com.mipresupuesto.personalbudget.crosscutting.utils.UtilText.*;

public class GeneralException extends RuntimeException {


	private static final long serialVersionUID = 4478202322101963570L;
	
	private String userMessage;
	private String technicalMessage;
	private Exception rootException;

	protected GeneralException(String userMessage, String technicalMessage, Exception rootException) {
		super();
		setUserMessage(userMessage);
		setTechnicalMessage(technicalMessage);
		setRootException(rootException);
	}

	public static GeneralException build(String technicalMessage) {
		return new GeneralException(null, technicalMessage, null);
	}

	public static GeneralException build(String technicalMessage, Exception rootException) {
		return new GeneralException(null, technicalMessage, rootException);
	}

	private void setUserMessage(String userMessage) {
		this.userMessage = trim(userMessage);
	}

	private void setTechnicalMessage(String technicalMessage) {
		this.technicalMessage = trim(technicalMessage);
	}

	private void setRootException(Exception rootException) {
		this.rootException = getUtilObject().getDefault(rootException, new Exception());
	}

	public String getUserMessage() {
		return userMessage;
	}

	public String getTechnicalMessage() {
		return technicalMessage;
	}

	public Exception getRootException() {
		return rootException;
	}

}