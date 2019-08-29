/*
 * 
 */
package mx.com.senorpago.gaspayment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class Gasoline.
 */
@Entity
@Table(name = "gasoline_payments")
public class Gasoline {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	/** The email. */
	@Column(name = "email", nullable = false)
	private String email;

	/** The name. */
	@Column(name = "name", nullable = false)
	private String name;

	/** The last name. */
	@Column(name = "last_name", nullable = false)
	private String lastName;

	/** The card number. */
	@Column(name = "card_number", nullable = false)
	private String cardNumber;

	/** The expiration date year. */
	@Column(name = "expiration_date_year", nullable = false)
	private Integer expirationDateYear;

	/** The expiration date month. */
	@Column(name = "expiration_date_month", nullable = false)
	private String expirationDateMonth;

	/** The gas type. */
	@Column(name = "gas_type", nullable = false)
	private String gasType;

	/** The amount. */
	@Column(name = "amount", nullable = false)
	private Double amount;

	/** The gas station. */
	@Column(name = "gas_station", nullable = false)
	private String gasStation;

	/** The seller name. */
	@Column(name = "seller_name", nullable = false)
	private String sellerName;

	/**
	 * Instantiates a new gasoline.
	 */
	public Gasoline() {

	}

	/**
	 * Instantiates a new gasoline.
	 *
	 * @param id
	 *            the id
	 * @param email
	 *            the email
	 * @param name
	 *            the name
	 * @param lastName
	 *            the last name
	 * @param cardNumber
	 *            the card number
	 * @param expirationDateYear
	 *            the expiration date year
	 * @param expirationDateMonth
	 *            the expiration date month
	 * @param gasType
	 *            the gas type
	 * @param amount
	 *            the amount
	 * @param gasStation
	 *            the gas station
	 * @param sellerName
	 *            the seller name
	 */
	public Gasoline(long id, String email, String name, String lastName, String cardNumber, Integer expirationDateYear,
			String expirationDateMonth, String gasType, Double amount, String gasStation, String sellerName) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.lastName = lastName;
		this.cardNumber = cardNumber;
		this.expirationDateYear = expirationDateYear;
		this.expirationDateMonth = expirationDateMonth;
		this.gasType = gasType;
		this.amount = amount;
		this.gasStation = gasStation;
		this.sellerName = sellerName;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 */
	public void setId(long id) {
		this.id = id;
	}

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Gasoline [id=" + id + ", email=" + email + ", name=" + name + ", lastName=" + lastName + ", cardNumber="
				+ cardNumber + ", expirationDateYear=" + expirationDateYear + ", expirationDateMonth="
				+ expirationDateMonth + ", gasType=" + gasType + ", amount=" + amount + ", gasStation=" + gasStation
				+ ", sellerName=" + sellerName + "]";
	}

}
