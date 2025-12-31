import java.util.*;

class Pr7{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a percentage");

		float per = sc.nextInt();
		if(per>=85){
			System.out.println("first class with distiction");
	      }
	      
	      else if(per>=75){
		      System.out.println("fist with distiction");
	      }
	      
	      
	      else if(per>60){
		      System.out.println("first class");
	      }




		     else if(per>47){
               System.out.println("pass");
		      }



		      else{
			      System.out.println("fail");
		      }

	}
}

