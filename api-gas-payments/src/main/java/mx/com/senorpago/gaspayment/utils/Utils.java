package mx.com.senorpago.gaspayment.utils;

import javax.sql.DataSource;

import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.lookup.DataSourceLookupFailureException;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;

import mx.com.senorpago.gaspayment.config.EnvConfiguration;

/**
 * The Class Utils.
 */
public class Utils {

	/**
	 * Instantiates a new utils.
	 */
	private Utils() {

	}

	/** The Constant CURRENCY_FORMAT. */
	public static final String CURRENCY_FORMAT = "'$',###.##";

	/** The Constant NUMBER_FORMAT. */
	public static final String NUMBER_FORMAT = ",###";

	/** The Constant PATTERN. */
	public static final String PATTERN = "dd-MM-yyyy";

	/**
	 * Data source JNDI.
	 *
	 * @param envConfiguration
	 *            the env configuration
	 * @param environment
	 *            the environment
	 * @return the data source
	 */
	public static DataSource dataSourceJNDI(EnvConfiguration envConfiguration, Environment environment) {
		final JndiDataSourceLookup dsLookup = new JndiDataSourceLookup();
		dsLookup.setResourceRef(true);
		DataSource dataSource = null;
		try {
			dataSource = dsLookup.getDataSource(
					environment.getProperty(envConfiguration.propertyName, envConfiguration.defaultValue));
		} catch (DataSourceLookupFailureException ex) {
			System.err.print(ex);
		}
		return dataSource;
	}

	/**
	 * Exist value.
	 *
	 * @param valor
	 *            the valor
	 * @return true, if successful
	 */
	public static boolean existValue(String valor) {
		return (valor != null && !valor.equals(""));
	}
}
