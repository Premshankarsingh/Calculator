package patterns;
import java.util.*;
public class pat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of pattern");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j||j==(n-i+1))
					System.out.print("O");
				else
					System.out.print("X");
			}
			System.out.println();
		}

	}

}
