package com.hcl.order.api.config;
import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.google.common.base.Preconditions;

@Configuration
@EnableTransactionManagement
//@EnableAutoConfiguration
@PropertySource({ "classpath:application.properties" })
@ComponentScan({ "${app.components.scan.packages}"})
@EnableJpaRepositories(basePackages = "${app.components.scan.jpa}")
public class CodegenJPAConfig {

	@Autowired
	private Environment env;

	public CodegenJPAConfig() {
		super();
	}

	// beans

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		final LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(dataSource());
		em.setPackagesToScan(new String[] { "${jpaEntities}" });

		final HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);
		em.setJpaProperties(additionalProperties());

		return em;
	}
	

	@Bean
	public DataSource dataSource() {
		final DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(Preconditions.checkNotNull(env.getProperty("spring.datasource.driverClassName")));
		dataSource.setUrl(Preconditions.checkNotNull(env.getProperty("spring.datasource.url")));
		dataSource.setUsername(Preconditions.checkNotNull(env.getProperty("spring.datasource.username")));
		dataSource.setPassword(Preconditions.checkNotNull(env.getProperty("spring.datasource.password")));

		return dataSource;
	}

	@Bean
	public PlatformTransactionManager transactionManager(final EntityManagerFactory emf) {
		final JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(emf);
		return transactionManager;
	}

	@Bean
	public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
		return new PersistenceExceptionTranslationPostProcessor();
	}


	final Properties additionalProperties() {
		final Properties hibernateProperties = new Properties();
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", env.getProperty("spring.jpa.hibernate.ddl-auto"));
		hibernateProperties.setProperty("hibernate.dialect", env.getProperty("spring.jpa.database-platform"));
		hibernateProperties.setProperty("hibernate.cache.use_second_level_cache", "false");


		return hibernateProperties;
	}

}
