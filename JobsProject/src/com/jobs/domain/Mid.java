package com.jobs.domain;

public class Mid extends Employee {

private final double IRPF = 15;
	
	public Mid(String name, String address, String phone, double brutSalaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, brutSalaryPerMonth, paymentRate);
		
		//totalPaid= paymentRate.pay(brutSalaryPerMonth);
		if (brutSalaryPerMonth < 1800 || brutSalaryPerMonth > 2500) throw new Exception("Error 105: El sueldo mensual de un mid debe estar entre 1800 y 2500. Usuario no añadido: " + name);

	}
	public void pay() {
		totalPaid=paymentRate.pay(brutSalaryPerMonth);
	}
	
	public String toString() {
		return "Mid [name=" + name + ", address=" + address + ", phone=" + phone +
				", totalPaid=" + totalPaid + "[ TotalPaid Per Year=" + totalPaid * 14 + 
				", NetSalary Per Month=" + (totalPaid - totalPaid * IRPF / 100) +
				", NetSalary Per Year=" + ((totalPaid - totalPaid * IRPF / 100) * 14) + "]";
	}
}
