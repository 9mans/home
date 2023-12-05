package objectclass;

import static java.lang.Math.*;
import static java.lang.System.*;

public class Ex9_13 {

	public static void main(String[] args) {
		
		double val = 90.7552;
		out.println("round(" + val + ") = " + round(val));
		
		val *= 100;
		
		out.println(round(val)/100);
		out.println(round(val)/100.0);
		out.println();
		
		
	}
}
