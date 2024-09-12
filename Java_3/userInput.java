import java.lang.System;  // it's automattically imported even if we don't put it. It is the library for output(System.out)
import java.util.Scanner;

class userInput{
    public static void main(String args[]){
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        int b = x.nextInt();
        x.nextLine();   // if we have to get a string input after an integer input we have to use like this 
        String p = x.nextLine();

        System.out.println(a+b);
        System.out.println(p);
        x.close();  // best practice to close x
    }
}