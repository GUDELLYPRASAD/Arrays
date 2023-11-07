import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
	int a[]={1456,898,900,2344,222,989,634};
	Scanner sc =new Scanner(System.in);
	System.out.println("enter palindrome no");
	int p =sc. nextInt();
	for (int i=0;i<a.length-1;i++) {
	for(int j=i+1;j<a.length;j++) {
		if(a[i]>a[j]) {
			System.out.println(a[j]);
			
		}
		else {
			System.out.println("print highest");
		}
	}
	
	int temp = 0;
	int sum=0;
	int r=0;
	int n=0;
	
	while(n>0) {
		
		n=n%10;
		sum =sum+r;
		n=n%10;
	}
	if (sum==temp) {
		System.out.println("palindrome");
	}else {
		System.out.println("not palimdrome");
	}
	}
	}
}
