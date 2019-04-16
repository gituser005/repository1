package com.arco.bo;

public class EmployeeBO {

	private String name;
	private String position;
	private double basic;
	private double gross;
	private double netsal;
	
	
	public EmployeeBO() {
		System.out.println("EmployeeBO 0-param constructor");
	}
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
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public double getGross() {
		return gross;
	}
	public void setGross(double gross) {
		this.gross = gross;
	}
	public double getNetsal() {
		return netsal;
	}
	public void setNetsal(double netsal) {
		this.netsal = netsal;
	}
	
}
