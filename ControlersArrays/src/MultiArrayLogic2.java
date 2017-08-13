import java.util.*;
public class MultiArrayLogic2 
{
	MultiArrayLogic1 ml =new MultiArrayLogic1();
	Scanner sc=new Scanner(System.in);
	
	public void getdetails()
	{
		System.out.println("Enter Rows and Cols of the First Matrix");
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		System.out.println("Enter Rows and Cols of the Second Matrix");
		int r2=sc.nextInt();
		int c2=sc.nextInt();
	
	if(c1!=r2)
		System.out.println("Multiplication is Not Possible");
 	else
	{
		int a[][]=new int[r1][c1];
		int b[][]=new int[r2][c2];
		int c[][]=new int[r1][c2];
		System.out.println("Enter Elements into the First Matrix");
		ml.input(a, r1,c1);
		System.out.println("Enter Elements into the Second Matrix");
		ml.input(b, r2,c2);
		ml.matmul(a, b, c, r1,c1,c2);
		System.out.println("First Matrix ...");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				System.out.print("    "+a[i][j]);
			}
			System.out.println();
		}
		System.out.println("Second Matrix ...");
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				System.out.print("    "+b[i][j]);
			}
			System.out.println();
		}	
		System.out.println("Resultant Matrix ...");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
				System.out.print("    "+c[i][j]);
			}
			System.out.println();
		}

	} // else
}// get details 
}// main
