package day2_assignment;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=101;
		
		for(int i=2;i<n;i++) {
			if(n%i!=0)
			{
				System.out.println("Prime");
			}
			else
			{
				System.out.println("Not a prime");
			}
			break;
		}

	}

}
