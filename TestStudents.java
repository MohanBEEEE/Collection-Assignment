package com.te.practiceweek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestStudents {

	public static void main(String[] args) {
		Set<Students> set = new HashSet<Students>();
		
		set.add(new Students(101, "yubi", 50.28, 30));
		set.add(new Students(185, "zubi", 80.28, 55));
		set.add(new Students(121, "rubi", 20.28, 12));
		set.add(new Students(191, "bubi", 90.28, 99));
		set.add(new Students(161, "aubi", 40.28, 02));
		
		ArrayList<Students> arrayList = new ArrayList<Students>(set);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 to sort by Age");
		System.out.println("Press 2 to sort by Id");
		System.out.println("Press 3 to sort by Name");	
		System.out.println("Press 4 to sort by Per");
		System.out.println("Press 5 to sort by exit");
		
		System.out.println("Enter any one number");
		int input = sc.nextInt();
		
		if(input<6) {
		
		switch (input) {
		case 1:
			Collections.sort(arrayList,new SortByAge());
			System.out.println(arrayList);
			break;
			
		case 2:
			Collections.sort(arrayList,new SetById());
			System.out.println(arrayList);
			break;
			
		case 3:
			Collections.sort(arrayList,new SetByName());
			System.out.println(arrayList);
			break;
		case 4:
			Collections.sort(arrayList,new SetByPre());
			System.out.println(arrayList);
			break;
		case 5: 
			System.exit(0);
		}
		}
		else { 
			throw new InvalidInputException("enter the vaild number");}
		
		}
		
		
		
		/*System.out.println(arrayList);
		Collections.sort(arrayList,new SortByAge());
		System.out.println(arrayList);*/
	}


