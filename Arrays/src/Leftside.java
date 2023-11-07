import java.util.Scanner;

public class Leftside {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		System.out.println("input data");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+ " ");
		}
		Scanner sc= new Scanner(System.in);
		System.out.println("no of position left position");
		int n =sc.nextInt();
		for (int i=0;i<n;i++);{
			int first=a[0];
			for (int j=0;j<a.length-1;j++) {
				a[j]=(a[j]+1);
			}
			a[a.length-1]=first;
		}
		System.out.println();
		System.out.println("output array:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
	}
}

	
		
			
