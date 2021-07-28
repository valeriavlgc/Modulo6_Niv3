package com.jobs.application;

import java.util.ArrayList;
import java.util.List;
import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Boss;
import com.jobs.domain.Employee;
import com.jobs.domain.Junior;
import com.jobs.domain.Manager;
import com.jobs.domain.Mid;
import com.jobs.domain.Senior;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;

public class JobsController {

	private EmployeeRepository repository = new EmployeeRepository();

	
	public JobsController(){
		
	}
	
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		try {
		Boss boss = new Boss(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);	
		} catch (Exception e) {
		    System.out.println(e.toString());
		}	
	}
	
	public void createEmployeeJunior(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		try {
		Junior juniorEmp= new Junior(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateJunior());
		repository.addMember(juniorEmp);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
		
	
	public void createEmployeeMid(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		try {
		Mid midEmp = new Mid(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateMid());
		repository.addMember(midEmp);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
	public void createEmployeeSenior(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		try {
		Senior seniorEmp = new Senior(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateSenior());
		repository.addMember(seniorEmp);
		} catch (Exception e) {
			System.out.println(e.toString());
		}	
	}

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
	    try {
		Manager manager = new Manager(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateManager());
		repository.addMember(manager);	
	    } catch (Exception e) {
	    	System.out.println(e.toString());
	    }
   }


	public void createVolunteer(String name, String address, String phone, String description, int schoolarship) throws Exception {
		try {
		Volunteer volunteer = new Volunteer(name, address, phone, description, schoolarship);
		repository.addMember(volunteer);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public void payAllEmployeers() {
	repository.payRepos();
	
	}
	
	
	public String getAllEmployees() {
		String lista="";
		List<AbsStaffMember> lista1 = new ArrayList<>();
		lista1 = repository.getAllMembers();
		
		for(AbsStaffMember e : lista1) {
			lista += e + "\n";
		}
		
		 return lista;
	}
	

//para pagar desde el jobs controller a todo el array de empleados.
	public void bonusAllEmp() {
		repository.bonus();
	}

	
	
	
	
	
}
