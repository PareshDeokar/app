package com.cg.aps.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "guard_shift_aps")

public class GardShiftEntity extends BaseEntity {
	@Id
	private long userId;
	private String name;
	private String time;
	private Date date;
	
	
	
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	
	public GardShiftEntity() {
		super();
	}

	public GardShiftEntity(long userId, String name, String time, Date date) {
		super();
		this.userId = userId;
		this.name = name;
		this.time = time;
		this.date = date;
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
