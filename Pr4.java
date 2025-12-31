import java.util.*;

class Pr4{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		float num = sc.nextFloat();
                
		if(num%6==0){
			System.out.println("num is divisible by 6");
		}else{
			System.out.println("num is not divisible by 6");
		}

	}
}

