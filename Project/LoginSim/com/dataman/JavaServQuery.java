package com.dataman;

import java.util.Scanner;
import com.dataman.CallRegis;

public class JavaServQuery {
	private static String[] user = new String[1];
	private static Scanner scan = new Scanner(System.in);

	public static final int LOGINSUCCESS = 1;
	public static final int LOGINFAIL = 0;
	public static boolean isOpen = true;

	public String getCacheUsername() {
		return user[0];
	}

	public void makeRegisterMenu() {
		System.out.println("\n=====Register Menu=====\n");

		System.out.print("[+] Username = ");
		String username = scan.nextLine();

		System.out.print("[+] Password = ");
		String password = scan.nextLine();

		CallRegis.postData(username, password);
	}

	public int makeLoginMenu() {
		boolean userCheck = false;
		boolean passCheck = false;

		System.out.println("\n=====Login Menu=====\n");

		System.out.print("[-] Username = ");
		String username = scan.nextLine();

		System.out.print("[-] Password = ");
		String password = scan.nextLine();

		if (CallRegis.data1IsThere(username)) {
			userCheck = true;
		} else {
			userCheck = false;
		}

		if (CallRegis.data2IsThere(password)) {
			passCheck = true;
		} else {
			passCheck = false;
		}

		if (userCheck == true && passCheck == true) {
			user[0] = username;
			return 1;
		} else {
			return 0;
		}
	}

	public void allDataInside() {
		System.out.println("\n=====All User in Database=====\n");
		CallRegis.getAllData();
		System.out.println("\n==============================\n");
	}

	public void CleanJSQ() {
		System.out.println("\n=====Bye Bye=====");
		scan.close();
	}
}
