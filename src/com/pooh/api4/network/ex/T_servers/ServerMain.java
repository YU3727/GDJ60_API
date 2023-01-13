package com.pooh.api4.network.ex.T_servers;

import java.util.ArrayList;

public class ServerMain {
//230113 7교시 network 풀이
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			new StudentController().start();
			ArrayList<StudentDTO> ar = new StudentDAO().init();
			System.out.println(ar.size());
			System.out.println(ar.get(1).getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
