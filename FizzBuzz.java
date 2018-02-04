import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

	Scanner in = new Scanner(System.in);

	for (int i=1;i<101; i++)
	{
		if (i%3==0)
		{
			if (i%15==0){
			System.out.print("FizzBuzz");}
			else{System.out.print("Fizz");}
		}
		else if (1%5==0){	
			if (i%15==0){
				System.out.print("FizzBuzz");}
			else{System.out.print("Buzz");}
		}
		else{System.out.print(i);}
	System.out.print("\n");
	}
}
}
		
