package studio1;

import support.cse131.ArgsProcessor;

public class Average {

    public static void main (String[] args) {

        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("How many grams of sugar in first bag");
        int n2 = ap.nextInt("How many grams of sugar in second bag?");
        double sum = n1 + n2;
        double average = sum / 2;
        System.out.println(average);

    }
}

