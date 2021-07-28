package com.jobs.domain;

public class Manager extends Employee {
	
private final double IRPF = 26;	
	
	public Manager(String name, String address, String phone, double brutSalaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, brutSalaryPerMonth, paymentRate);
				
		//totalPaid= paymentRate.pay(brutSalaryPerMonth);
		if (brutSalaryPerMonth < 3000 || brutSalaryPerMonth > 5000) throw new Exception("Error 102: El sueldo mensual de un manager debe estar entre 3000 y 5000. Usuario no añadido: " + name);

	}
	

	public void pay() {
		totalPaid=paymentRate.pay(brutSalaryPerMonth);
	}
	public String toString() {
		return "Manager [name=" + name + ", address=" + address + ", phone=" + phone + 
				 ", totalPaid=" + totalPaid + "][ TotalPaid Per Year=" + totalPaid * 14 + 
					", NetSalary Per Month=" + (totalPaid - totalPaid * IRPF / 100) +
					", NetSalary Per Year=" + ((totalPaid - totalPaid * IRPF / 100) * 14) + "]";
	}
}
