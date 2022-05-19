package StringPackage;

public class Cases {
	int x = 10;
	int y = 20;
	
	//Not accepting parameters and not return value
	
	public void m1 () {
		System.out.println(x+y);
	}
	//not accepting parameters and return value
	public int m2() {
		return x+y;
	}
	//accepting parameters and not return value
	public void m3(int a,int b) {
		System.out.println(a+b);
	}
	//accepting parameters and return value
	
	public int m4(int p,int q) {
		int sum = p+q;
		return(p+q);
	}
	
	//main method
	public static void main(String[]args) {
		
		//not accept parameter and not return value
		Cases sum1 = new Cases();
		sum1.m1();
		
		//not accepting parameters and return the value
		
		Cases sum2 = new Cases();
		System.out.println(sum2.m2());
		
		//accepting parameters and not return value
		Cases sum3 = new Cases();
		sum3.m3(20, 30);
		
		//accepting parameters and return data type
		
		Cases sum4 = new Cases();
		System.out.println(sum4.m4(200,300));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
