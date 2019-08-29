/*
 * 
 */
package mx.com.senorpago.gaspayment.model;

import java.io.Serializable;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class GasolineResponse.
 */
@Validated
public class GasolineResponse implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -3718915138616230492L;

	/** The success. */
	@JsonProperty("success")
	private Boolean success = Boolean.FALSE;

	/** The error. */
	@JsonProperty("error")
	private String error = null;

	/** The message. */
	@JsonProperty("message")
	private String message = null;

	/**
	 * Gets the success.
	 *
	 * @return the success
	 */
	public Boolean getSuccess() {
		return success;
	}

	/**
	 * Sets the success.
	 *
	 * @param success
	 *            the new success
	 */
	public void setSuccess(Boolean success) {
		this.success = success;
	}

	/**
	 * Gets the error.
	 *
	 * @return the error
	 */
	public String getError() {
		return error;
	}

	/**
	 * Sets the error.
	 *
	 * @param error
	 *            the new error
	 */
	public void setError(String error) {
		this.error = error;
	}

	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the message.
	 *
	 * @param message
	 *            the new message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
