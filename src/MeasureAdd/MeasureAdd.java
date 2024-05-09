package MeasureAdd;
import java.util.*;

public class MeasureAdd {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
	
	    while(true) {
	    	int num = sc.nextInt();
	    	if(num == -1) {
	    		break;
	    	}
	    	for(int i =1; i < num; i++) {
	    		if(num%i == 0) {
	    			sum += i;
	    		}
	    	}
	    	if(num == sum) {
	    		System.out.print(num + " = 1");
	    		for(int i =2; i < num; i++) {
		    		if(num%i == 0) {
		    			System.out.print(" + " +i);
		    		}
		    	}
	    		System.out.println();
	    	}
	    	else {
	    		System.out.println(num + " is NOT perfect.");
	    	}
	    	sum  =0;
	    }
	}
}