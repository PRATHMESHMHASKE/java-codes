import java.util.*;

class Pr5{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int age = sc.nextInt();
                
		if(age>=18){
			System.out.println("Valid age for voting");
		}else if(age<18&&age>0){
			System.out.println("Age is under 18 ");
		}else{
			System.out.println("Invalid age");
		}


	}
}

