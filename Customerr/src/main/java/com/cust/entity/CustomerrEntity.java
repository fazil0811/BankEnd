package com.cust.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customerr")
public class CustomerrEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int salesmanid;
	private int customerid;
	private String customername;
	private int purchaseamount;
	public int getSalesmanid() {
		return salesmanid;
	}
	public void setSalesmanid(int salesmanid) {
		this.salesmanid = salesmanid;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public int getPurchaseamount() {
		return purchaseamount;
	}
	public void setPurchaseamount(int purchaseamount) {
		this.purchaseamount = purchaseamount;
	}
	
	
	
}
