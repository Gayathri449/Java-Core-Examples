import java.util.*;
public class MultiArrayLogic1 
{
	
	Scanner sc=new Scanner(System.in);

	void input(int x[][],int row,int col)
	{
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				x[i][j]=sc.nextInt();
			}
		}
	} 
	void print(int x[][],int row,int col)
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print("   "+x[i][j]);
			}
			System.out.println();
		}
	}
	void matmul(int x[][],int y[][],int z[][],int r1,int c1,int c2)
	{
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
				z[i][j]=0;
				for(int k=0;k<c1;k++)
				{
					z[i][j]=z[i][j]+x[i][k]*y[k][j];
				}
			}
		}
}

}
