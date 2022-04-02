package ch02;

import ch02.Controller.Controller;
import ch02.Controller.ControllerImpl;
import ch02.service.Serviceimpl;

public class Main {
	
	public static void main(String[] args) {
		Controller program = new ControllerImpl(new Serviceimpl());
		program.login();
		
	}
	
}
