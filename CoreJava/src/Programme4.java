import java.util.Scanner;

public class Programme4 {
	public static void main(String[] args) {
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		number=sc.nextInt();
		int i = 2;
		while(i < number)
		{
			 if(number % i == 0) {
				System.out.println("Number is not a prime number");
				return ;
			}
			i++;
		}
		System.out.println("Number is prime number " + number);
		
	}
}

