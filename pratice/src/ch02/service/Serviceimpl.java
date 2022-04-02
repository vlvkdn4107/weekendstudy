package ch02.service;

import java.util.ArrayList;
import java.util.Scanner;

import ch02.Userdata.User;

public class Serviceimpl implements Service{


	private ArrayList<User> users;
	Scanner scan = new Scanner(System.in);
	public Serviceimpl() {

		users = new ArrayList<User>();
	}
	

	@Override
	public void inputUser() {
		System.out.println("회원가입 합니다.");
		// 스캐너로 입력값을 받기
		System.out.print("name: ");
		String name = scan.next();
		System.out.println("pswd: ");
		int i = scan.nextInt();
		User user = new User(name, i);
		users.add(user);
		System.out.println(name +" 님의 회원가입을 축하합니다");
		
	}

	@Override
	public void updateUser(String name) {
		System.out.println("회원의 정보를 수정합니다");
		User updateUser = null;
		System.out.println("수정할 정보를 입력하세요");
		System.out.println();
		System.out.print("수정할 회원의 이름을 적으세요: ");
		String update_Name = scan.next();
		System.out.print("수정할 회원의 패스워드를 적으세요.: ");
		int update_number = scan.nextInt();
		for (int i = 0; i < users.size(); i++) {
			if(users.get(i).getName().equals(name)) {
				updateUser = users.get(i);
				updateUser.setName(update_Name);
				updateUser.setNumber(update_number);
				System.out.println("수정이 됬습니다.");
				break;
			}
		}
		
	}

	@Override
	public void deleteUser(String name) {
		System.out.println("회원의 정보를 삭제합니다");
		for (int i = 0; i < users.size(); i++) {			
			if(users.get(i).getName().equals(name)) {
				users.remove(i);
			}
			System.out.println(name + "의 정보가 없습니다.");
		}
		
		
	}

	@Override
	public void seletedUser() {
		System.out.println("회원의 정보를 출력합니다.");
		
	}

	@Override
	public void showUser() {
		for (User user : users) {
			System.out.println(user);
		}
		}


	@Override
	public boolean login(String useName, int password) {
		System.out.println("로그인");
		for (User user : users){
			if(user.getName().equals(useName) && user.getNumber() == password) {
				
				return true;
			}
		}
		return false;	
	}
		
	}
	
	

