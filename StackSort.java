import java.util.*;

public class StackSort{
	
	public static void main(String[] args){
		
		Stack<Integer> numbers=new Stack<>();
		numbers.add(957);
		numbers.add(456);
		numbers.add(72);
		numbers.add(959);
		numbers.add(3);
		numbers.add(125);
		System.out.println("Original stack: "+numbers);
		int temp;
		Stack<Integer> sortedNumbers = new Stack<Integer>();
		while(!numbers.isEmpty()) {
			temp = numbers.pop();			
			while(!sortedNumbers.isEmpty() && sortedNumbers.peek() > temp) {
				numbers.add(sortedNumbers.pop());
			}
			sortedNumbers.add(temp);		
		}
		
		String a;
		System.out.println("Sorted stack: "+sortedNumbers);
	}
}