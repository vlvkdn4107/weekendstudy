package ch02.service;

public interface Service {
	
	void inputUser();
	
	void updateUser(String name);
	
	void deleteUser(String name);
	
	void seletedUser();
	
	void showUser();
	
	boolean login(String useName, int password);

}
