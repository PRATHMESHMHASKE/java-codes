import java.util.*;

class Pr8{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first num");
		int a = sc.nextInt();
		System.out.println("Enter a second num");
		int b = sc.nextInt();
                System.out.println("Enter a third num");
		int c =sc.nextInt();

	       if(a*a + b*b == c*c){
	       System.out.println("its pythogoras triplet");
	       

	       }else{
	       System.out.println("not py tri");
	       }	       

	}
}

