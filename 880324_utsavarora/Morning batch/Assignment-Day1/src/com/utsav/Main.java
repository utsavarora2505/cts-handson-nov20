package com.utsav;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<User> list = new ArrayList<User>();
list.add(new User(123,"utsav","waheguru"));
list.add(new User(345,"vickyyadav","shreeram"));
list.add(new User(789,"shreyajain","jaijendenra"));
list.add(new User(563,"piyushasungh","jaimatadi"));
list.add(new User(564,"maasivyas","omsairam"));

for(User user : list) {
	if(user.getName().length() > 5) {
		System.out.println("Id = "+user.getId()+", Name = "+user.getName());
	}
 	}

}
}