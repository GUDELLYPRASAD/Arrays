
public class Reversearryays {

	public static void main(String[] args) {
		char  a []= {'p','r','a','s','a','d'};
		int i=0,j=a.length-1; 
				char temp;
		while(i<j) {
			temp =a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		System.out.println("print a");
		
		
		for(int k = 0; k<a.length ; k++) {
			
			System.out.print(a[k] + " ");
			
		}
		
			
		}
	
		
		
		
	

	}

