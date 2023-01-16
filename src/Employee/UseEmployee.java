package Employee;

import java.util.HashMap;
import java.util.Iterator;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee("Jaambavan",23,4856,500000,"SDE",true);
		Employee e2=new Employee("Beeboo",20,4757,100000,"BRICK LAYER",true);
		Employee e3=new Employee("Rasiga",27,4746,300000,"NURSE",false);
		Employee e4=new Employee("Bintu",41,2335,700000,"POLICE",false);
	
	HashMap<Integer,Employee>emp=new HashMap<>();
	emp.put(e1.getId(),e1);
	emp.put(e2.getId(),e2);
	emp.put(e3.getId(),e3);
	emp.put(e4.getId(),e4);
		
 /*	for(Integer l:emp.keySet()) {
		if(emp.get(l).getSalary()>=500000) {
			System.out.println(emp.get(l));
		}
	}  */
	
/*	Employee min=e1;
	for(Employee l:emp.values()) {
		if(l.getAge()<=min.getAge()) {
			min=l;
		}
	}
	System.out.println(min);*/
	
/*	for(Employee l: emp.values()) {
		if(l.isMale()&&l.getSalary()<300000) {
			System.out.println(l);
		}
	} */
	
/*	Iterator<Employee>itr=emp.values().iterator();
		while(itr.hasNext()) {
			if(itr.next().getAge()>=25) {
				itr.remove();
			}
		}
	emp.forEach((x,y)->System.out.println(x+" "+y));
	*/
	
/*	Iterator<Employee>itr=emp.values().iterator();
	while(itr.hasNext()) {
		if(itr.next().getId()==4757) {
			itr.remove();
		}
	}
	emp.forEach((x,y)->System.out.println(x+" "+y)); */
	
/*	Iterator<Integer>itr=emp.keySet().iterator();
	while(itr.hasNext()) {
		if(itr.next()==4856) {
			itr.remove();
		}
	}
	emp.keySet().forEach(x->System.out.println(emp.get(x))); */
	
/*	Iterator<Integer>itr=emp.keySet().iterator();
	while(itr.hasNext()) {
		if(emp.get(itr.next()).getName().equalsIgnoreCase("Beeboo")) {
			itr.remove();
		}
	}
	emp.keySet().forEach(x->System.out.println(emp.get(x))); **/
	
	Iterator<Integer>itr=emp.keySet().iterator();
	while(itr.hasNext()) {
		if((emp.get(itr.next()).getSalary()>10000)&&emp.get(itr.next()).getRole().equals("NURSE")) {
			itr.remove();
		}
	}
	emp.keySet().forEach(x->System.out.println(emp.get(x)));
	
	
	
	
	
	
	
	
	}

}
