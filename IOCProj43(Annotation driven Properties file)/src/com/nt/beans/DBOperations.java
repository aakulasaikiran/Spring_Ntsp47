package com.nt.beans;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Named("dbo")
@Resource()
/*@Component("dbo")*/
	public class DBOperations{
	@Named()
	@Resource()
	   @Value("${jdbc.driver}")
	   private String driverClass;
	@Resource()
	@Value("${jdbc.url}")
	   private String url;
	@Resource()
	@Value("${jdbc.user}")
	  private String dbUser;
	@Value("${jdbc.pwd}")
	  private String dbPwd;
	//toString
	
	@Override
	public String toString() {
		return "DBOperations [driverClass=" + driverClass + ", url=" + url + ", dbUser=" + dbUser + ", dbPwd=" + dbPwd
				+ "]";
	}
	}
