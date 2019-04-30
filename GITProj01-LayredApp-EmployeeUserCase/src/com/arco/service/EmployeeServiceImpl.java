package com.arco.service;

import com.arco.bo.EmployeeBO;
import com.arco.dao.EmployeeDAO;
import com.arco.dto.EmployeeDTO;

public class EmployeeServiceImpl {

	private EmployeeDAO dao;
	public EmployeeServiceImpl(EmployeeDAO dao) {
		this.dao=dao;
	}
	public double generateResult(EmployeeDTO dto) throws Exception {
		
		double basic=dto.getBasicpay();
		double gross=0.0d;
		double bonous=dto.getBonouspay();
		double netsal=0.0d;
		double overtime=dto.getOvertimepay();
		double tax=0.0d;
		int count=0;
		//String result=null;
		EmployeeBO bo=null;
		
		//write business logic
		gross=(basic*12)+overtime+bonous;
		
		if(gross<500000) {
			tax=0.0;
		}
			else if(gross>1000000) {
				tax=(gross*0.5);		//modify 0.3 to 0.5
		}
		else 
			tax=(gross*0.2);
		
		netsal=gross-tax;
		
		//prepare BO having Persistable Data
				bo=new EmployeeBO();
				bo.setName(dto.getName());
				bo.setPosition(dto.getPosition());
				bo.setBasic(basic);
				bo.setGross(gross);
				bo.setNetsal(netsal);
				count=dao.insert(bo);
				
				if(count==0)
					System.out.println("Sth went wrong: try again");
				else
					System.out.println("Employee data inserted and tax paid:");
	
			return tax;
		
	}//method
}
