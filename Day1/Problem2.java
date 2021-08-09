import java.util.Scanner;

public class Problem2 {
   
	static int repeaters(int arr[],int n)
	{
		int count=0,i,j;
		for ( i = 0; i < n-1; i++)
        {
            int min_index = i;
            for (j = i+1; j < n; j++)
            {
                if (arr[j] < arr[min_index])
                    min_index = j;
            }
            
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
		for(i=0;i<n-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				count++;
			}
		}
		if(count>0)
		{
			count++;
		}
		return count;
		
	}
	static int arr[]=new int[20];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		if(n<0)
		{	System.out.println("Invalid input");
			return;
		}
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
			if(arr[i]<0)
			{ System.out.println("Invalid input");
			return;
			}
		}
		int count=repeaters(arr,n);
		System.out.println(count);
		scan.close();

	}

}
