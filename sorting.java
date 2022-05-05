import java.util.*;
class sorting{
	

	
	
	
	
	void insertionsort(int a1[]){
		int n = a1.length;
		for(int i=1; i<n; i++)
		{
			int k= a1[i];
			int j= i-1;
			
			while(j>=0 && a1[j]>k){
				a1[j+1]=a1[j];
				j=j-1;
			}
			a1[j+1]=k;
		}
	}
	
	void display(int a1[]){
		int n=a1.length;
		for(int i=0; i<n; i++){
			System.out.println(a1[i]+" ");
		}
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of an array");
		int n=sc.nextInt();
		
		int a1[]=new int[n];
		
		System.out.println("Enter elements of an array");
		for(int i=0;i<n;i++){
			a1[i]=sc.nextInt();
		}
		
		sorting s1=new sorting();
		s1.insertionsort(a1);
		System.out.println();
		s1.display(a1);
		
	
	}
}