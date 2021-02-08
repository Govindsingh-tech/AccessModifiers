package package2;

import package1.Access1;

public class Access3 extends Access1 {

	public static void main(String[] args) {
		Access3 obj = new Access3();
		
		//public
		System.out.println("Public access modifier:");
        System.out.println(obj.hours2);
        System.out.println(obj.minutes2);
        
      //protected
      	System.out.println("Protected access modifier:");
        System.out.println(obj.hours3);
        System.out.println(obj.minutes3);

	}

}
