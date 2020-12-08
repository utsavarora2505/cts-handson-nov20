package com.utsav.arora;
import java.util.*;
public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		List<String> l1 = new ArrayList<String>();
		l1.add("waheguru");
		l1.add("jai mata di");
		l1.add("om nmah shivayy");
		l1.add("jai bajrangbali");
		
		List<String> l2 = new ArrayList<String>();
		l2.add("utsav");
		l2.add("hardik");
		l2.add("vedika");
		l2.add("dharmik");
		Map<String, List> map= new HashMap<String, List>();
		map.put("CS",l1);
		map.put("ECE", l2);
		
		System.out.println("Enter the department");
		String s=kb.next();
		
		if(map.containsKey(s)) {
			System.out.println(map.get(s));
		}

	}

}
