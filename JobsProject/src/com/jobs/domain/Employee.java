package com.jobs.domain;

public abstract class Employee extends AbsStaffMember {

	protected double brutSalaryPerMonth;
	protected double totalPaid; 
	protected IPaymentRate paymentRate;
		
	
	public Employee(String name, String address, String phone, double brutSalaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone);		
		if(brutSalaryPerMonth<0) throw new Exception();
		if(paymentRate==null) throw new Exception();
				
		this.brutSalaryPerMonth=brutSalaryPerMonth;
		this.paymentRate=paymentRate;
		
		
	}


	

	@Override
	public void pay() {
		totalPaid=paymentRate.pay(brutSalaryPerMonth);
	}
	
	public void bonus() {
		totalPaid = totalPaid*1.1;
	}



		
}
