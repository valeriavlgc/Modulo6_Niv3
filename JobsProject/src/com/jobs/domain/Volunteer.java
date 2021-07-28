package com.jobs.domain;

public class Volunteer extends AbsStaffMember {

protected String description;

private int schoolarship = 0;

	public Volunteer(String name, String address, String phone, String description, int schoolarship) throws Exception {
		super(name, address, phone);
		this.description = description;
		this.schoolarship = schoolarship;
		if (schoolarship > 300) throw new Exception("Error 107. Las ayudas a becarios no pueden superar los 300€.");
		
		totalPaid= 0;
		if (totalPaid != 0) throw new Exception("Error 106. Los becarios no cobran.");
	}

		
	@Override
	public void pay() {
		super.totalPaid= 0;
		
	}
	

	public void setDescription(String description) {
		this.description = description;
	}


	
	@Override
	public String toString() {
		return "Volunteer [name=" + name + ", address=" + address + ", phone=" + phone + 
				", description=" + description + ", totalPaid=" + totalPaid +
				", schoolarship quantity=" + schoolarship + "(Ayuda gubernamental.)" + "]";
	}

	
}
