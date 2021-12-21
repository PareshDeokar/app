package com.cg.aps.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "security_alerts_aps")
public class SecurityEntity extends BaseEntity {
@Id
	private String message;
	private String alert;
	
	
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getAlert() {
		return alert;
	}

	public void setAlert(String alert) {
		this.alert = alert;
	}
	
	

	public SecurityEntity() {
		super();
	}

	public SecurityEntity(String message, String alert) {
		super();
		this.message = message;
		this.alert = alert;
	}

	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

}
