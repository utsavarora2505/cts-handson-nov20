package com.utsav.arora3;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		String choice = null;
		int n = 0;
		EmpServiceImpl service = new EmpServiceImpl();
		List<Employee> list = new ArrayList<Employee>();
		
		
		do {
			System.out.println("1: Add Employee");
			System.out.println("2: Find by ID");
			System.out.println("3: Display all Employees");
			System.out.println("4: Sort the Employees by Id");
			System.out.println("5: Sort the Employees by Name");
			System.out.println("6: Sort the Employees by Salary");

			System.out.print("---Enter your Choice : ");

			n = scan1.nextInt();
			
			switch (n) {
			case 1:
				System.out.print("Enter ID : ");
				Integer id = scan1.nextInt();

				System.out.print("Enter name : ");
				String name = scan2.nextLine();

				System.out.print("Enter Salary : ");
				Double salary = scan1.nextDouble();

				System.out.print("Enter DOB (in dd-MM-yyyy) : ");
				String dob = scan2.nextLine();
				service.add(id, dob, name, salary);
				break;
			case 2:
				System.out.print("Enter the id : ");
				Integer fId = scan1.nextInt();
				list = service.findEmployeeById(fId);
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
				;
				break;
			case 3:
				list = service.getEmployees();
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
				;
				break;
			case 4:
				list = service.getSortedEmployeesById();
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}

				break;
			case 5:
				list = service.getSortedEmployeesByName();
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
				;
				break;
			case 6:
				list = service.getSortedEmployeesBySalary();

				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
				;
				break;
			default:
				System.out.println("Enter Valid Input");
				break;
			}
			System.out.print("Continue(y/n)");
			choice = scan2.nextLine().toLowerCase();

		} while (choice.equals("y"));
		System.out.println("End");

	}

}
