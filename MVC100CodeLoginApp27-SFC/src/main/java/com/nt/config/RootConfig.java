package com.nt.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
@ComponentScan(value={"com.nt.service","com.nt.dao"})
public class RootConfig {
	

	public  DataSource  createDataSource(){
		BasicDataSource basicDs=null;
		basicDs=new BasicDataSource();
		basicDs.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		basicDs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		basicDs.setUsername("system");
		basicDs.setPassword("manager");
		return basicDs;
	}
	
	@Bean
	public  JdbcTemplate createJdbcTemplate(){
		JdbcTemplate template=null;
		template=new JdbcTemplate(createDataSource());
		return template;
	}

	@Bean(name="txMgr")
	public DataSourceTransactionManager  createDataSoruceTransactionManager(){
		DataSourceTransactionManager TxMgr=null;
		TxMgr=new DataSourceTransactionManager(createDataSource());
		return TxMgr;
	}
	
}
