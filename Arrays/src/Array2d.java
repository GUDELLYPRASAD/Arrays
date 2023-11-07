
public class Array2d {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int m =2;
		int n=5;
		
			
		
		int[][]matrix=new int[m][n];
		int index =0;
		for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++) {
		matrix[i][j]=a[index];
		index++;
		}
		}
	
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++) {
			System.out.print(matrix[i][j] +" ");
		}
		System.out.println();
	}
	}
}
	


