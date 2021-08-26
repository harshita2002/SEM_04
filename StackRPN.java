package stackrpn;
import java.util.*;
public class StackRPN {
	
	public static int eval(String RPNExpression) {
		Deque<Integer> intermediateResults = new LinkedList<>();
		String delimiter = ",";
		String[] symbols = RPNExpression.split(delimiter);
		for (String token : symbols) {
		if (token.length() == 1 && "+-*/".contains(token)){
		final int y = intermediateResults.removeFirst();
		final int x = intermediateResults.removeFirst();
		switch (token.charAt(0)){
		case '+':
		intermediateResults.addFirst(x + y);
		break ;
		case '-':
		intermediateResults.addFirst(x - y);
		break ;
		case '*':
		intermediateResults.addFirst(x * y);
		break ;
		case '/':
		intermediateResults.addFirst(x / y);
		break ;
		default:
		throw new IllegalArgumentException("Malformed RPN at :" + token);
		}
		} else { // token is a number.
		intermediateResults.addFirst(Integer.parseInt(token));
		}
		}
		return intermediateResults.removeFirst();
		}

	
	public static void main(String[] args) {
		int results = eval("10,6,9,3,+,-11,*,/,*,17,+,5,+");
		System.out.println(results);
	}

}
