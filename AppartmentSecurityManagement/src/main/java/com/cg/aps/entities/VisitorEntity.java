package com.cg.aps.entities;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;


@Entity
@Table (name="Visitors_aps")

public class VisitorEntity extends BaseEntity {
	@Id
	private String flatNo;
	private String name;
	private String ownerName;
//	@Temporal(value = null)
	private Date date;
	private String arrivalTime;
	private String departureTime;
	
	
	public String getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	
	

	public VisitorEntity() {
		super();
	}

	public VisitorEntity(String flatNo, String name, Date date, String ownerName, String arrivalTime,
			String departureTime) {
		super();
		this.flatNo = flatNo;
		this.name = name;
		this.ownerName = ownerName;
		this.date = date;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
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