package com.jobs.persistence;

import java.util.ArrayList;
import java.util.List;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;

public class EmployeeRepository {
	
	
	private static List<AbsStaffMember> members=new ArrayList<AbsStaffMember>();
	
	public EmployeeRepository() {
				
	}
	
		
	public List<AbsStaffMember> getAllMembers(){
		return members;
	}
	 
	
	public void addMember(AbsStaffMember member) throws Exception {
		if(member==null) throw new Exception();
		members.add(member);
	}
	
	public void payRepos() {
	for (AbsStaffMember e : members) {
		e.pay();
	}
	}

//Casteando a Employee no incremento el bonus a voluntarios.	
	public void bonus() {
		
		for (AbsStaffMember e : members) {
			if (e instanceof Employee) {
				((Employee)(e)).bonus();
			}

			}
			
		}
	
	
	

}
