import java.util.*;
public class BinaryLogic
{
	public void getbinary()
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Elements into the Array ");
		int n=sc.nextInt();
		int a[]=new int[n];
	
		System.out.println("Enter Elements into the Array ");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		// Binary Search Logic
		int limit=n-1;
		for(int i=0;i<limit;i++)
		{
			for(int j=0;j<limit-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
	
	System.out.println("The Array Elements are ....");
	
	for(int num:a)
		System.out.println(num);
	System.out.println("Enter Element to be Search");
	int x=sc.nextInt();
	int first=0;
	int last=n-1;
	int mid=0;
	int found=0;
	while((first<=last) && (found==0))
	{
		mid=(first+last)/2;
		if(x==a[mid])
			found=1;
		else if(x>a[mid])
			first=mid+1;
		else if(x<a[mid])
			last=mid-1;
	}
	if(found==1)
System.out.println("Element Found At : "+(mid+1)+" and value : "+a[mid]);
	else
		System.out.println("Element Not Found");
sc.close();		
	
	}	
	
	}
	