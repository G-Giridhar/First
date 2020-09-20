package com.epam;

import java.util.Scanner;

class Emp {
	String name, desig;
	int age, sal;
	static int count = 0;

	Emp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		name = sc.next();
		System.out.println("Enter age: ");
		age = sc.nextInt();
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + sal);
		System.out.println("Designation: " + desig);
	}

	public void raiseSal() {
		sal = sal + 2000;
	}
}

class Clerk extends Emp {
	Clerk() {
		sal = 15000;
		desig = "Clerk";
	}

	public void raiseSal() {
		sal = sal + 5000;
	}
}

class Developer extends Emp {
	Developer() {
		sal = 25000;
		desig = "Developer";
	}

	public void raiseSal() {
		sal = sal + 10000;
	}
}

class Manager extends Emp {
	Manager() {
		sal = 50000;
		desig = "Manager";
	}

	public void raiseSal() {
		sal = sal + 20000;
	}
}

public class EmployeeManagement {
	public static void main(String ag[]) {
		int ch1 = 0, ch2 = 0;
		Emp e[] = new Emp[100];
		do {
			System.out.println("----------------------");
			System.out.println("1. Create");
			System.out.println("2. Display");
			System.out.println("3. Raise Salary");
			System.out.println("4. Exit");
			System.out.println("----------------------");

			Scanner sc = new Scanner(System.in);
			ch1 = sc.nextInt();

			if (ch1 == 1) {
				do {
					System.out.println("--------------------");
					System.out.println("1. Clerk");
					System.out.println("2. Developer");
					System.out.println("3. Manager");
					System.out.println("4. Exit");
					System.out.println("-------------------");

					ch2 = sc.nextInt();

					switch (ch2) {
						case 1: {
							e[Emp.count++] = new Clerk();
						}
							break;
						case 2: {
							e[Emp.count++] = new Developer();
						}
							break;
						case 3: {
							e[Emp.count++] = new Manager();
						}
							break;
					}
				} while (ch2 != 4);
			}
			if (ch1 == 2) {
				for (int i = 0; i < Emp.count; i++) {
					e[i].display();
				}
			}
			if (ch1 == 3) {
				for (int i = 0; i < Emp.count; i++) {
					e[i].raiseSal();
				}
			}

		} while (ch1 != 4);
		System.out.println("Total no of employees added: " + Emp.count);
		System.out.println("Bye Bye ");
	}
	// sc.close();
}
