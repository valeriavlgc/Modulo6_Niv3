package com.jobs.view;

import java.util.ArrayList;
import com.jobs.domain.AbsStaffMember;
import com.jobs.application.JobsController;

public class Main {

		
	private static JobsController controller=new JobsController();
	
	public static void main(String[] args) throws Exception {
		
		//Salta la excepción
		controller.createBossEmployee("Pepe Boss", "Direccion molona", "666666666", 100.0);
		controller.createEmployeeJunior("Pedro Employee", "Direccion molona 2", "665266666", 40.0);
		controller.createEmployeeMid("Laura Employee", "Direccion molona 3", "625266666", 45.0);
		//Añaden trabajador
		controller.createEmployeeJunior("Juana Employee", "Direccion molona 2", "665266666", 1200);
		controller.createManagerEmployee("Manuel Employee 3", "Direccion molona 2", "665226666", 4500);
		controller.createBossEmployee("Ramón Boss", "Direccion molona", "666666666", 20000);
		//obligatorio en el constructor introducir si recibe beca o no para añadir el bono
        controller.createVolunteer("Juan Volunteer", "Direccion molona 4", "614266666", "no cobra", 250);


		controller.payAllEmployeers();
				
		controller.bonusAllEmp();
		
		String allEmployees=controller.getAllEmployees();
				
		System.out.println("EMPLOYEES:\n" + allEmployees + " \n");
			
	}

}
