package in.pattern.making;

public class ineuronassignment1 {

	public static void main(String[] args)
{
			int n=10;
		
			for(int i=0;i<n;i++)
			{ //Question 1 //
				for(int j=0;j<n;j++)
				{
					if ( i==0 || j==(n-1)/2 || i==(n-1))
						System.out.print("*");
					else
						System.out.print(" " );
				}
System.out.print("          ");
				for(int j=0;j<n;j++)
				{
					if ( j==0 || i==j || j==(n-1))
					 System.out.print("*");
					else
					 System.out.print(" " );
				}
System.out.print("          ");
				for(int j=0;j<n;j++)
				{
					if ( i==0 || j==0 || i==(n-1)/2 || i==(n-1))
						System.out.print("*");
					else
						System.out.print(" " );				
				}	
System.out.print("          ");
				for(int j=0;j<n;j++)
				{
					if ( j==0 && i!=n-1 || j==n-1 && i!=n-1 || i==(n-1) && j!=0 && j!=n-1)
						System.out.print("*");
					else
						System.out.print(" " );
				} 
System.out.print("          ");
				for(int j=0;j<n;j++)
				{
					if ( i==0 && j!=n-1 && j!=0 || j==0 && i!=0|| i==(n-1)/2 && j!=(n-1)|| j==(n-1)&& i<(n-1)/2 && i!=0 || i==j && i>=(n-1)/2 && j>=(n-1)/2  )
						System.out.print("*");
					else
						System.out.print(" " );
				}
System.out.print("          ");
				for(int j=0;j<n;j++)
				{
					if ( i==0 && j!=0 && j!=n-1 || j==0 && i!=0 && i!=n-1|| j==(n-1) && i!=0 && i!=n-1  || i==(n-1) && j!=0 && j!=n-1 )
					 System.out.print("*");
					else
					 System.out.print(" " );
				}
System.out.print("          ");
				for(int j=0;j<n;j++)
				{
					if ( j==0 || i==j || j==(n-1))
					 System.out.print("*");
					else
					 System.out.print(" " );
				}
//Pattern Making //		Question 3		
System.out.print("          ");
				for(int j=0;j<n;j++)
				{
					if ( i+j<=(n-1)/2 || j-i>= n/2 || i==0 || j==0 || j==(n-1) || i==(n-1)  )
						System.out.print("*");
					else
						System.out.print(" " );
				} 
//Question 4//		
System.out.print("          ");
				for(int j=0;j<n;j++)
				{
					if ( i-j>=n/2 || i+j>n-1+(n-1)/2)
						System.out.print("*");
					else
						System.out.print(" " );
				} 
//Question 5//				
System.out.print("          ");
				for(int j=0;j<n;j++)
				{
					if ( i+j<=(n-1)/2 || i-j>=n/2 || i==0 || j==0 || i==(n-1))
						System.out.print("*");
					else
						System.out.print(" " );
				} 
//1111 2222 3333 4444// Question 2
System.out.print("          ");
				for(int j=0;j<n;j++)
				{
					System.out.print(i);	
				}
				System.out.println();
			}

	}

}
