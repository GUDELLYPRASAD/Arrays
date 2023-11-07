
public class Duplicate {

	    public static void main(String[] args) {
	        int a[] = {1,4,2,5,0,-1,9,8,1,3,1,2,5,0,-2};

	        for (int i = 0; i < a.length; i++) {
	            int count = 0;
	            if (a[i] != -1) {  
	                for (int j = i + 1; j < a.length; j++) {
	                    if (a[i] == a[j]) {
	                        count++;
	                        a[j] = -1;  
	                    }
	                }

	                if (count > 0) {
	                    System.out.println("Element " + a[i] + " appears " + (count + 1) + " times.");
	                }
	            }
	        }
	    }
	}
		
		
		

