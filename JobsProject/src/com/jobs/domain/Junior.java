package com.jobs.domain;

public class Junior extends Employee {

private final double IRPF = 2;	

  public Junior(String name, String address, String phone, double brutSalaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone, brutSalaryPerMonth, paymentRate);
				
		//totalPaid= paymentRate.pay(brutSalaryPerMonth);
		if (brutSalaryPerMonth < 900 || brutSalaryPerMonth > 1600) throw new Exception("Error 104: El sueldo mensual de un junior debe estar entre 900 y 1600. Usuario no añadido: " + name);

	}
  
  public void pay() {
		totalPaid=paymentRate.pay(brutSalaryPerMonth);
	}
	public String toString() {
		return "Junior [name=" + name + ", address=" + address + ", phone=" + phone + 
				", totalPaid=" + totalPaid + "]" + "[ TotalPaid Per Year=" + totalPaid * 14 + 
				", NetSalary Per Month=" + (totalPaid - totalPaid * IRPF / 100) +
				", NetSalary Per Year=" + ((totalPaid - totalPaid * IRPF / 100) * 14) + "]";
	}
}
