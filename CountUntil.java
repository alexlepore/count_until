import java.util.Scanner;

public class CountUntil{

	public static void main (String[] args){
		inquire();
	}

	static void inquire(){
		try {
			System.out.println("How long would you like to \"loop\" for?");
			Scanner scan = new Scanner(System.in);
			int input = scan.nextInt();
			loop(input);
		} catch (Exception e) {
			System.out.println("Please try again, use a number");
			inquire();
		}
	}
	static void loop(int user_input){

		int i = 0;

		while (i < user_input) {
			System.out.println(i);
			i++;
		}
	}

}
