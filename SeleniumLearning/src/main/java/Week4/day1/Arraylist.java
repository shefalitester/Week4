package Week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		List<Integer> empid = new ArrayList<Integer>();
		//insert values to list
		empid.add(567123);
		empid.add(908726);
		//insert value at specified index
		empid.add(2,7893456);
		empid.add(3,5678220);
		for (Integer i : empid) {
			System.out.println(i);
		}
		
		//to retrieve value
		System.out.println(empid.get(0));
		
		//Replace an element at specified index in Arraylist
		empid.set(0,161102);
		System.out.println("*************");
		for (Integer i : empid) {
			System.out.println(i);
		}
		//Search an element of Java ArrayList
		System.out.println("search element 5678220 present " + empid.contains(5678220));
		 List<Integer> number = new ArrayList<Integer>();
		 //add element 1,2, 3,3, 56, 676, 34, 99
		 number.add(1);
		 number.add(2);
		 number.add(3);
		 number.add(3);
		 number.add(56);
		 number.add(676);
		 number.add(34);
		 number.add(99);
		 System.out.println("************");
		 System.out.println("Original list");
		 for (Integer n : number) {
			System.out.print(n);
		}
			//Reverse an Arraylist
		 System.out.println("************");
		 System.out.println("Reverse list");
		 int t = number.size();
			
		 for (int rev = t-1; rev >= 0; rev--) {
			 System.out.print(number.get(rev));
		}
		 //sort the list
		 System.out.println("************");
		 
		 Collections.sort(number);
		 for (Integer a : number) {
			System.out.println(a);
		}
		//Remove the duplicates element
		 System.out.println("************");
		 for (int i = 0; i<t; i++) {
			 for (int j = i+1; j <t; j++) {
				 if(number.get(i).equals(number.get(j)))
				 {
					 number.remove(j);
					 t--;
					 //reduce the size of arraylist
					 }		
			}
			
		}
		 for (Integer a : number) {
				System.out.println(a); 
		 }
		 
	}
		 }
		 
		
	


