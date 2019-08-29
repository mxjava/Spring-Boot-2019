/*
 * 
 */
package mx.com.senorpago.gaspayment.model;

import java.io.Serializable;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class GasolineRequest.
 */
@Validated
public class GasolineRequest implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 2676768176099288855L;

	/** The email. */
	@JsonProperty("email")
	private String email;

	/** The name. */
	@JsonProperty("name")
	private String name = null;

	/** The last name. */
	@JsonProperty("lastName")
	private String lastName = null;

	/** The card number. */
	@JsonProperty("cardNumber")
	private String cardNumber = null;

	/** The expiration date year. */
	@JsonProperty("expirationDateYear")
	private Integer expirationDateYear = 0;

	/** The expiration date month. */
	@JsonProperty("expirationDateMonth")
	private String expirationDateMonth = null;

	/** The gas type. */
	@JsonProperty("gasType")
	private String gasType = null;

	/** The amount. */
	@JsonProperty("amount")
	private Double amount = (double) 0;

	/** The gas station. */
	@JsonProperty("gasStation")
	private String gasStation = null;

	/** The seller name. */
	@JsonProperty("sellerName")
	private String sellerName = null;

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email
	 *            the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name
	 *            the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name.
	 *
	 * @param lastName
	 *            the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets the card number.
	 *
	 * @return the card number
	 */
	public String getCardNumber() {
		return cardNumber;
	}

	/**
	 * Sets the card number.
	 *
	 * @param cardNumber
	 *            the new card number
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	/**
	 * Gets the expiration date year.
	 *
	 * @return the expiration date year
	 */
	public Integer getExpirationDateYear() {
		return expirationDateYear;
	}

	/**
	 * Sets the expiration date year.
	 *
	 * @param expirationDateYear
	 *            the new expiration date year
	 */
	public void setExpirationDateYear(Integer expirationDateYear) {
		this.expirationDateYear = expirationDateYear;
	}

	/**
	 * Gets the expiration date month.
	 *
	 * @return the expiration date month
	 */
	public String getExpirationDateMonth() {
		return expirationDateMonth;
	}

	/**
	 * Sets the expiration date month.
	 *
	 * @param expirationDateMonth
	 *            the new expiration date month
	 */
	public void setExpirationDateMonth(String expirationDateMonth) {
		this.expirationDateMonth = expirationDateMonth;
	}

	/**
	 * Gets the gas type.
	 *
	 * @return the gas type
	 */
	public String getGasType() {
		return gasType;
	}

	/**
	 * Sets the gas type.
	 *
	 * @param gasType
	 *            the new gas type
	 */
	public void setGasType(String gasType) {
		this.gasType = gasType;
	}

	/**
	 * Gets the amount.
	 *
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}

	/**
	 * Sets the amount.
	 *
	 * @param amount
	 *            the new amount
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	/**
	 * Gets the gas station.
	 *
	 * @return the gas station
	 */
	public String getGasStation() {
		return gasStation;
	}

	/**
	 * Sets the gas station.
	 *
	 * @param gasStation
	 *            the new gas station
	 */
	public void setGasStation(String gasStation) {
		this.gasStation = gasStation;
	}

	/**
	 * Gets the seller name.
	 *
	 * @return the seller name
	 */
	public String getSellerName() {
		return sellerName;
	}

	/**
	 * Sets the seller name.
	 *
	 * @param sellerName
	 *            the new seller name
	 */
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

}
