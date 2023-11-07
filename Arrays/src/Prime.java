import java.util.Scanner;
public class Prime {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        
	        System.out.print("Enter the No. of Elements: ");
	        int n = input.nextInt();

	        int[] primeArray = new int[n];
	        int count = 0;
	        int num = 2; 

	        while (count < n) {
	            if (isPrime(num)) {
	                primeArray[count] = num;
	                count++;
	            }
	            num++;
	        }

	        
	        int[] reverseArray = new int[n];
	        for (int i = 0; i < n; i++) {
	            reverseArray[i] = primeArray[n - 1 - i];
	        }

	        System.out.println("Reverse of an Array : ");
	        for (int i = 0; i < n; i++) {
	            System.out.println(reverseArray[i]);
	        }

	        input.close();
	    }

	    
	    public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i * i <= num; i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}



