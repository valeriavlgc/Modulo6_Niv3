package com.jobs.domain;

public class Senior extends Employee {

private final double IRPF = 24;

	public Senior(String name, String address, String phone, double brutSalaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, brutSalaryPerMonth, paymentRate);
				
		//totalPaid= paymentRate.pay(brutSalaryPerMonth);
		if (brutSalaryPerMonth < 2700 || brutSalaryPerMonth > 4000) throw new Exception("Error 103: El sueldo mensual de un senior debe estar entre 2700 y 4000. Usuario no añadido: " + name);

	}
	
	public void pay() {
		totalPaid=paymentRate.pay(brutSalaryPerMonth);
	}
	public String toString() {
		return "Senior [name=" + name + ", address=" + address + ", phone=" + phone +
				 ", totalPaid=" + totalPaid + "[ TotalPaid Per Year=" + totalPaid * 14 + 
					", NetSalary Per Month=" + (totalPaid - totalPaid * IRPF / 100) +
					", NetSalary Per Year=" + ((totalPaid - totalPaid * IRPF / 100) * 14) + "]";
	}
}
