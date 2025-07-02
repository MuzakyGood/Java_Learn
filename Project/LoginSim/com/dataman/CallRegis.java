package com.dataman;

import java.util.HashMap;

class MainDataCenter {
	protected static HashMap<String, String> DataBase = new HashMap<>();
}

public class CallRegis extends MainDataCenter {
	public static void postData(String data1, String data2) {
		DataBase.put(data1, data2);
	}

	public static boolean data1IsThere(String data) {
		return DataBase.containsKey(data);
	}

	public static boolean data2IsThere(String data) {
		return DataBase.containsValue(data);
	}

	public static void getAllData() {
		System.out.println(DataBase);
	}
}
