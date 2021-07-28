package com.jobs.domain;

public class Boss extends Employee {
	
protected final double IRPF = 32;

	public Boss(String name, String address, String phone, double brutSalaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, brutSalaryPerMonth, paymentRate);
			
		
		//totalPaid= paymentRate.pay(brutSalaryPerMonth);
		if (brutSalaryPerMonth < 8000) throw new Exception("Error 101: El sueldo mensual de un jefe debe ser superior a 8000. Usuario no añadido: " + name);
		
	}
	
	public void pay() {
		totalPaid=paymentRate.pay(brutSalaryPerMonth);
	}
	public String toString() {
		return "Boss [name=" + name + ", address=" + address + ", phone=" +
	            phone + ", totalPaid=" + totalPaid + "][ TotalPaid Per Year=" + totalPaid * 14 + 
				", NetSalary Per Month=" + (totalPaid - totalPaid * IRPF / 100) +
				", NetSalary Per Year=" + ((totalPaid - totalPaid * IRPF / 100) * 14) + "]";
	}

}
