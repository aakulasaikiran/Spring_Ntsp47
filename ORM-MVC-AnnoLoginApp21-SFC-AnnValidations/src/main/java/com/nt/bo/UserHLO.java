package com.nt.bo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name="userlist")
@Entity
@NamedQuery(name="AUTH_QRY",query="SELECT COUNT(*) FROM UserHLO WHERE uname=:un and pwd=:pass")
public class UserHLO {
	@Id
	private String uname;
	private String pwd;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
