package rev;

public class Mobile {
	public static void main(String[]args) {
	for(Mobile x:mob) {
		Mobile y=x;
		if(y.getAmount()>2000) {
			y.setPrice(y.getAmount()+999);
		}
		System.out.println(y);
	}
			
	}

}
