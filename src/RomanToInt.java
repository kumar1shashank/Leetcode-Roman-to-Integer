import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInt {
	
	public int romanToInt(String num) {
		
			        // Create a HashMap to map Roman numeral characters to their corresponding values
		        Map<Character, Integer> romanMap = new HashMap<>();
		        romanMap.put('I', 1);
		        romanMap.put('V', 5);
		        romanMap.put('X', 10);
		        romanMap.put('L', 50);
		        romanMap.put('C', 100);
		        romanMap.put('D', 500);
		        romanMap.put('M', 1000);

		        int result = 0;
		        int prevVal = 0;

		        // Loop through the Roman string in reverse
		        for (int i = num.length() - 1; i >= 0; i--) {
		            char c = num.charAt(i);
		            int val = romanMap.get(c);
		            
		            //System.out.println("num.length()"+num.length()+"\n num.charAt(i)"+c+"\n romanMap.get(c);"+romanMap);

		            // If the current value is smaller than the previous value, subtract it from the result
		            
//		            System.out.println(" val="+val);
//		            System.out.println("prevVal="+prevVal);
//		            System.out.println(" result="+result);
		            
		            if (val < prevVal) {
		                result -= val;
		            }
		            // Otherwise, add it to the result
		            else {
		                result += val;
		            }

		            prevVal = val;
		            
		            //System.out.println("------------------------");
		        }

		        return result;
		    }
		

	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Roman numeral: ");
		String num = in.nextLine(); // Capture user input

		RomanToInt romanToInt = new RomanToInt(); // Create an object of RomanToInt class
		System.out.println(romanToInt.romanToInt(num)); // Call romanToInt() method on the object

		in.close();
	}

}
