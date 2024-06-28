package Daythree;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		String name;
		System.out.println("Enter Person Name:");
		name=ob.next();
		System.out.println("Enter Person age:");
		int age=ob.nextInt();
		System.out.println("Enter Person Gender:");
		String gender=ob.next();
		
		System.out.println("Enter Person income:");
		int income =ob.nextInt();
		
		
		Person person=new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		
		//display person details
		System.out.println(person);
		
		Taxcalculation calc=new Taxcalculation();
		calc.calculateTax(person); //tax calculation
		System.out.println("After calculation tax:");
		
		System.out.println(person);
		



		

		


	}

}
