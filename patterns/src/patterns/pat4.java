package patterns;
import java.util.*;
public class pat4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of pattern");
		int k,n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<(2*n);i++) {
			k=n;
			if(i<=n) {
				for(int j=1;j<(2*n);j++) {
					
					System.out.print(k);
					if(i>j)
						k=k-1;
					if(i+j>=2*n) 
						k=k+1;
				}
			}
			if(i>n) {
				for(int j=1;j<(2*n);j++) {
				
					System.out.print(k);
					if(i+j<2*n)
						k=k-1;
					if(j>=i) 
						k=k+1;
				}
			}
			System.out.println();
		}

	}

}

