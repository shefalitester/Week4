package collectionConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListLearning {

	public static void main(String[] args) {
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Blue");
		ar1.add("Green");
		ar1.add("Red");
		
		System.out.println(ar1.get(2));
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Yellow");
		ar2.add("white");
		
		ar2.addAll(ar1);

		System.out.println("******************");
		for(int i=0; i<ar2.size();i++)
		{
			System.out.println(ar2.get(i));
			
		}
		System.out.println("******************");
		
		//Employee class object creation
		Employee e1 = new Employee("Tina",35, "QA");
		Employee e2 = new Employee("Shefali",44,"QA");
		Employee e3 = new Employee("Tom",33, "Dev");
		Employee e4 = new Employee("Sam",44,"BA");
		
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		
		//To traverse use iterator
		System.out.println("******************");
		Iterator<Employee> it = al.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println();
			System.out.print(" Age : "+e.age);
			System.out.print("  Dept : "+ e.dept);
			System.out.print("  Name : "+e.name);
		}
		System.out.println("\n******************");
		
		Iterator<Employee> it2 = al.iterator();
		while(it2.hasNext())
		{
			Employee e = it2.next();
			if(e.age>=40)
			{
				System.out.println();
			System.out.print(" Age : "+e.age);
			System.out.print("  Dept : "+ e.dept);
			System.out.print("  Name : "+e.name);}
			
				
		}
		
		
		
		
		
		
		
		
		}

	}

