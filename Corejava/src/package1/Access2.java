package package1;

import package2.Access3;

public class Access2 {

	public static void main(String[] args) {
		//default
		System.out.println("Dafault Access Specifier:");
		Access1 obj = new Access1(); 		  
        System.out.println(obj.hours);
        System.out.println(obj.minutes);
        
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

