package reExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import aaa.Member;
import util.Util;

public class reexam {

	static int num = 0;
	static List<Member> lists = new ArrayList<>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("프로그램 시작");
		make3();

		while (true) {
			System.out.print("명령어를 입력하세요 : ");
			String cmd = sc.nextLine();

			String id;
			String pw;
			String name;
			if (cmd.equals("exit")) {
				break;
			}

			if (cmd.equals("member join")) {
				while (true) {
					System.out.print("Id :");
					id = sc.nextLine().trim();

					boolean foundId = false;

					if (!id.isEmpty()) {
						for (Member member : lists) {
							if (member.getId().equals(id)) {
								System.out.printf("[%s]는 있는 아이디입니다.", id);
								foundId = true;
							}
						}
					}
					if (id.isEmpty()) {
						System.out.println("공백은 안돼요");
						continue;
					}
					if (!foundId) {
						break;
					}
				}

				while (true) {
					System.out.print("Pw :");
					pw = sc.nextLine();

					if (pw.isEmpty()) {
						System.out.println("공백은 안돼요");
						continue;
					}

					System.out.print("PwChk :");
					String PwChk = sc.nextLine();

					if (PwChk.isEmpty()) {
						System.out.println("공백은 안돼요");
						continue;
					}

					if (!pw.equals(PwChk)) {
						System.out.println("비밀번호가 다릅니다.");
					}

					else if (pw.equals(PwChk)) {
						break;
					}

				}
				while (true) {
					System.out.print("name :");
					name = sc.nextLine();

					if (name.isEmpty()) {
						System.out.println("공백은 안돼요");
						continue;
					} else {
						break;
					}
				}
				Member member = new Member(num, Util.getdate(), id, pw, name);
				lists.add(member);
				System.out.println("회원가입이 완료되었습니다.");

			} else if (cmd.startsWith("member list")) {
				String findCmd = cmd.substring("member list".length()).trim();

				boolean findList = false;

				if (!findCmd.isEmpty()) {
					for (Member member : lists) {
						if (member.getId().contains(findCmd)) {
							System.out.printf("[%d]번으로 [%s]에 가입한 아이디[%s]\n", member.getNum(), member.getRegDate(),
									member.getId());
							findList = true;
						}

					}
					if (!findList) {
						break;
					}
				} else if (findCmd.isEmpty()) {
					for (Member member : lists) {
						System.out.printf("[%d]번으로 [%s]에 가입한 아이디[%s]\n", member.getNum(), member.getRegDate(),
								member.getId());
					}
				}

			} else {
				System.out.println("잘못된 명령어입니다.");
			}
		}

		sc.close();
		System.out.println("프로그램이 종료되었습니다.");
	}

	static void make3() {
		System.out.println("아이디 3개 추가");
		for (int i = 1; i <= 3; i++) {
			Member member = new Member(num + i, Util.getdate(), "ID" + i, "PW" + i, "name" + i);
			lists.add(member);
		}
	}

}
