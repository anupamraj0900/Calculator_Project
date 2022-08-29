
import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
        int a=0;
        while(true){
        	System.out.println("Enter the operator: ");
            char op= s.next().trim().charAt(0);
            if(op == '+' || op == '-'|| op == '*'||op=='/'||op=='%') {
            	System.out.println("Enter 2 numbers-");
            	int num1 = s.nextInt();
            	int num2=s.nextInt();
            	
            	if(op == '+') {
            		
            		a=num1+num2;
            	}
            	if(op == '-') {
            		
            		a=num1-num2;
            	}
            	if(op == '*') {
            		
            		a=num1*num2;
            	}
            	if(op == '/') {
            		
            		a=num1/num2;
            	}
            	if(op == '/') {
            		if(num2!=0) {
            		a=num1/num2;
            		}
            	}
            	if(op == '%') {
            		if(num2!=0) {
            		a=num1%num2;
            		}
            	}
            	
            	
            	
            	
            	
            	
            	
            }
            else if(op=='x' || op == 'X') {
        		break;
        	}
        	
        	else {
        		System.out.println("Invalid input");
        	}










            System.out.print("Result  is " );
            System.out.println(a);
            System.out.println("Press x or X to exit");
        }
        


	}

}
