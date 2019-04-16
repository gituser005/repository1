package com.arco.dto;

public class EmployeeDTO {

	private String name;
	private String position;
	private double basicpay;
	private double overtimepay;
	private double bonouspay;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public double getBasicpay() {
		return basicpay;
	}
	public void setBasicpay(double basicpay) {
		this.basicpay = basicpay;
	}
	public double getOvertimepay() {
		return overtimepay;
	}
	public void setOvertimepay(double overtimepay) {
		this.overtimepay = overtimepay;
	}
	public double getBonouspay() {
		return bonouspay;
	}
	public void setBonouspay(double bonouspay) {
		this.bonouspay = bonouspay;
	}
	
}
