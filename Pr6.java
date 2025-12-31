import java.util.*;

class Pr6{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a cost price");
		int cp = sc.nextInt();
		System.out.println("Enter a selling price");
		int sp = sc.nextInt();

                int profit = sp-cp;
	        int loss = cp-sp;

	       if(sp>cp){
	       System.out.println("profit"+profit);
	       }else if (cp>sp){
	System.out.println("loss"+loss);

	       }else{
	       System.out.println("equal");
	       }	       

	}
}

