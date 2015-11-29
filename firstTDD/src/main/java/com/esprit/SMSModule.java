package com.esprit;
/**
 * cette interface decrit un sms module
 * @author Ahmado
 *
 */
public interface SMSModule {
	/**
	 * send an sms
	 * @param number
	 * <p>phone number
	 * @param message
	 * 
	 */
	void send(String number,String message);
    Boolean isReady();

}
