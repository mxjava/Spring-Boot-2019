
package mx.com.senorpago.gaspayment.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.support.AbstractPlatformTransactionManager;

import mx.com.senorpago.gaspayment.utils.Utils;

//@Configuration
//@EnableTransactionManagement
//@EnableAspectJAutoProxy
//@EnableJpaRepositories(
//        basePackages = { "mx.com.senorpago.gaspayment.repository" }, //Scan Repositories
//        entityManagerFactoryRef = "entityManagerFactoryMYSQL",
//        transactionManagerRef = "transactionManagerMYSQL")

//@ComponentScan(
/**
 * The Class RepositoryMYSQL.
 */
// basePackages = { "mx.com.senorpago.gaspayment"})
public class RepositoryMYSQL {

	// @Autowired
	// private Environment environment;
	//
	//
	//
	// @Bean
	// public DataSource dataSourceMYSQL() {
	// return Utils.dataSourceJNDI(EnvConfiguration.JNDI_MYSQL, environment);
	// }
	//
	// @Bean
	// public JpaVendorAdapter jpaVendorAdapter(){
	// HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
	// vendorAdapter.setGenerateDdl(false);
	// vendorAdapter.setShowSql(true);
	// vendorAdapter.setDatabase(Database.ORACLE);
	//
	//
	//
	// return vendorAdapter;
	// }
	//
	// @Bean
	// public EntityManagerFactory entityManagerFactoryMYSQL() {
	//
	// LocalContainerEntityManagerFactoryBean factory = new
	// LocalContainerEntityManagerFactoryBean();
	// factory.setJpaVendorAdapter(jpaVendorAdapter());
	// factory.setPackagesToScan(
	// new String[]{ "mx.com.senorpago.gaspayment.repository" }); //Scan JPA
	// factory.setDataSource(dataSourceMYSQL());
	//
	// factory.afterPropertiesSet();
	//
	// return factory.getObject();
	// }
	//
	// @Bean
	// public AbstractPlatformTransactionManager transactionManagerMYSQL() {
	// return new JpaTransactionManager(entityManagerFactoryMYSQL());
	// }
	//
}
