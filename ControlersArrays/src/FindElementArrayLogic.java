import java.util.*;

public class FindElementArrayLogic {
	
	
	public void FindElement()
	{
	
	int a[]=new int[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Elements into the Array");
	
	
	for(int i=0;i<5;i++)
		a[i]=sc.nextInt();
	
	System.out.println("Array Elements are ...");
	
	for(int i=0;i<5;i++)
		System.out.println(a[i]);
	
	System.out.println("Enter Element to be Search");
	
	
	int x=sc.nextInt();
	int found=0;
	int pos=0;
	for(int i=0;i<5;i++)
	{
			if(x==a[i])
			{
				found=1;
				pos=i;
				break;
			}
	}
	if(found==1)
System.out.println("Element Found At : "+(pos+1)+" and value : "+a[pos]);
	else
		System.out.println("Element Not Found");
sc.close();		
	
	}

}
