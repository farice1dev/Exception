package Customer;

import java.util.HashMap;

public class UseCustomer {
	public static void main(String[] args) {
		
		Customer cus1=new Customer("Nohn",55,50000,83931345693l,true);
		Customer cus2=new Customer("Pengu",30,1000,90001345692l,false);
		Customer cus3=new Customer("Pumba",22,20000,8393000691l,true);
		Customer cus4=new Customer("Gaich",28,30000,8393137890l,false);
		
		HashMap<Long,Customer>lms=new HashMap<>();
		lms.put(cus1.getAadharNumber(),cus1);
		lms.put(cus2.getAadharNumber(),cus2);
		lms.put(cus3.getAadharNumber(),cus3);
		lms.put(cus4.getAadharNumber(),cus4);
		
	//	lms.forEach((x,y)->System.out.println(x+" "+y));
	//	for(Long a:lms.keySet()) {
	//		System.out.println(a);
	//	}
	/*	for(Long a:lms.keySet()) {
			System.out.println(a+" "+lms.get(a));
		}	*/
	
	/*	lms.values().forEach(x->{
			if(x.getName().startsWith("N")) {
				System.out.println(x);
				
			}
		});	*/
		
	//	lms.values().forEach(x->System.out.println(x));
	
	/*	int temp=0;
		for(Customer l:lms.values()) {
			if(l.getAge()>=temp) {
				temp=l.getAge();
			}
		}
			System.out.println(temp); */
		
	/*	for(Customer l:lms.values()) {
			if(l.getAge()>45) {
				System.out.println(l);
			}
		}	*/
	/*	for(Long l:lms.keySet()) {
			if(lms.get(l).isRegularCustomer()==true) {
				System.out.println("Discount= "+(lms.get(l).getAmountAvailable()-lms.get(l).getAmountAvailable()*(5/100))+" "+lms.get(l));	
			}
			else {
				System.out.println(lms.get(l));
			}
		} */ 
		
		lms.values().forEach(x->{
			if(x.getAmountAvailable()<50000) {
				x.setAmountAvailable(x.getAmountAvailable()+50000);
			}

		});
			System.out.println(lms);
	
	}
	
	

}
