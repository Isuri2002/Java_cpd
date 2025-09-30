import java.util.Scanner; // import.java.util.*;
public class KeyboardInput {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		System.out.println("Please insert your age : "+age);
	}
}