package mypack;
import java.util.*;

public class Employee 
{
		private int empid;
		private String name;
		
		
		Employee(){}
		Employee(int id,String str)
		{
			this.empid = id;
			this.name = str;
		}
		
		public int getEmpid() {
			return empid;
		}
		public void setEmpid(int empid) {
			this.empid = empid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public String toString()
		{
			return "Empid: "+empid+"\nName : "+name;
		}
		
		public ArrayList<Employee> getRecords()
		{
			ArrayList<Employee> AL = new ArrayList<Employee>();
			AL.add(new Employee(101,"Pooja 1"));
			AL.add(new Employee(102,"Pooja 2"));
			AL.add(new Employee(103,"Pooja 3"));
			AL.add(new Employee(104,"Pooja 4"));
			AL.add(new Employee(105,"Pooja 5"));
			
			return AL;
			
		}
		
	
		public boolean equals(Object emp)
		{
			Employee e=(Employee) emp;
			
			boolean status = false;
			if(this.empid == e.empid && e.name.equalsIgnoreCase(this.name))
				status = true;
		
			return status;
					
		}
			
}

