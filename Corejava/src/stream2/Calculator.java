package stream2;

public class Calculator {
public static void main(String[] args) {
	
	double num1 = 18550;
	double num2 = 2;
	char operator = '/';
	double result;
	switch (operator) {
	
	case '-':
		result = num1 - num2;
		System.out.println("sub=" + result);
		break;
	case '+':
		result = num1 + num2;
		System.out.println("add=" + result);
		break;
	case '/':
		result = num1 / num2;
		System.out.println("divide=" + result);
		break;
	case '*':
		result = num1 * num2;
		System.out.println("mult=" + result);
		break;
	default:
		System.out.println("invalid Operator");
		break;
	}
}
}
