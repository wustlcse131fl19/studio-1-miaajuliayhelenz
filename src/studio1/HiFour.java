package studio1;

import support.cse131.ArgsProcessor;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String s0 = ap.nextString("Whats your name?");
		String s1 = ap.nextString("Second persons name?");
		String s2 = ap.nextString("Third persons name?");
		String s3 = ap.nextString("Fourth persons name?");
		//
		// Say hello to the names in s0 through s3.
		//
		String msg = "Greetings "+ s0+", " + s1 +", "+ s2 +", and "+ s3 + ".";
		System.out.println(msg);


	}
}
