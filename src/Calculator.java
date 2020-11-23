import java.util.Scanner;

public class Calculator {
	public static double add(double x, double y) {
		return x+y;
	}
	
	public static double subtract(double x, double y) {
		return x-y;
	}
	
	public static double multiply(double x, double y) {
		return x*y;
	}
	
	public static double divide(double x, double y) {
		return x/y;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Enter an arithmetic expression separated by spaces. (Example: '12 + 6')");
			System.out.println("Otherwise, enter 'exit' when finished.");
			String command = scan.nextLine();
			if(command.equalsIgnoreCase("exit")) break;
			String[] split = command.split(" ");
			if(split.length==3) {
				double a=-1, b=-1;
				try {
					a=Double.parseDouble(split[0]);
					b=Double.parseDouble(split[2]);
				} catch(Exception e) {
					System.err.println("Error: Invalid Arithmetic Expression.");
					continue;
				}
				switch(split[1]) {
					case "+":
						System.out.println(add(a,b));
						break;
					case "-":
						System.out.println(subtract(a,b));
						break;
					case "*":
					case "x":
						System.out.println(multiply(a,b));
						break;
					case "/":
						System.out.println(divide(a,b));
						break;
					default:
						System.err.println("Error: Invalid Arithmetic Expression.");
						break;
				}
			}else {
				System.err.println("Error: Please enter only 1 operator with 2 operands.");
			}
		}while(true);
		scan.close();
	}
}