package com.sales.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sales")
public class SalesEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int salesmanid;
	private String salesmanname;
	private int commission;
	private String city;
	private int age;

	public int getSalesmanid() {
		return salesmanid;
	}

	public void setSalesmanid(int salesmanid) {
		this.salesmanid = salesmanid;
	}

	public String getSalesmanname() {
		return salesmanname;
	}

	public void setSalesmanname(String salesmanname) {
		this.salesmanname = salesmanname;
	}

	public int getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
