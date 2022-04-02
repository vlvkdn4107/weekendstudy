package ch02.Controller;

import java.util.Scanner;

import ch02.service.Service;
import ch02.service.Serviceimpl;

public class ControllerImpl implements Controller {

	Index index;
	Service service;
	Scanner scan = new Scanner(System.in);
	boolean flag1 = true;
	boolean flag2 = true;

	public ControllerImpl(Service service) {
		this.service = service;
		index = new Index();
	}

	@Override
	public void login() {
		

		while (flag1) {
			index.loginIndex();
			scan = new Scanner(System.in);
			System.out.print("입력 : ");
			char select = scan.nextLine().charAt(0); // String은 char의 배열이다. 따라서 charAt(i) 는 문자열의 첫번째 문자를 가져온다.
			if (select == '1') {
				System.out.println("로그인");
				// 스캐너로 입력값을 받기
				System.out.print("name : ");
				String name = scan.nextLine();
				System.out.print("pswd : ");
				int password = scan.nextInt();
				if (service.login(name, password)) {
					bodyProgram();
				} else {
					System.out.println("로그인이 실패했습니다.");
				}
			} else if (select == '2') {
				System.out.println("회원가입");
				service.inputUser();
			} else if (select == 'q') {
				System.out.println("프로그램 종료");
				flag1 = false;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}

	}

	@Override
	public void bodyProgram() {
		
		System.out.println("");

		while (flag2) {
			index.bodyIndex();
			scan = new Scanner(System.in);
			System.out.print("입력 : ");
			char select = scan.nextLine().charAt(0);
			if (select == '1') {
				System.out.println("추가");
				service.inputUser();
			} else if (select == '2') {
				System.out.println("수정");
				System.out.print("수정하실 이름을 선택해주세요: ");
				String name = scan.nextLine();
				service.updateUser(name);
			} else if (select == '3') {
				System.out.println("삭제");
				String name = scan.nextLine();
				service.deleteUser(name);
			} else if (select == '4') {
				System.out.println("모두 출력");
				service.showUser();
			} else if (select == 'b') {
				System.out.println("돌아가기");
				break;
			}
		}
	}

}
