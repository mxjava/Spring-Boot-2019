/*
 * 
 */

package mx.com.senorpago.gaspayment.config;

// TODO: Auto-generated Javadoc
/**
 * The Enum EnvConfiguration.
 */
public enum EnvConfiguration {

	/** The jndi mysql. */
	JNDI_MYSQL("jndi.name.señorpago", "jdbc/PagoGasMYSQL");

	/** The property name. */
	public String propertyName;

	/** The default value. */
	public String defaultValue;

	/**
	 * Instantiates a new env configuration.
	 *
	 * @param propertyName
	 *            the property name
	 * @param deafultValue
	 *            the deafult value
	 */
	private EnvConfiguration(String propertyName, String deafultValue) {
		this.propertyName = propertyName;
		this.defaultValue = deafultValue;
	}

}
