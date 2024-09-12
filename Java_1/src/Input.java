import java.util.Scanner;  // importing package to get user input

class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        float b = input.nextFloat();
        String c = input.next();  // next() => Only first word is printed even if we input a sentence
        String d = input.nextLine();  // nextLine() => whole sentence can be printed
        char e = input.next().charAt(0); // character in 0th index will be printed
        System.out.println(a);
        System.out.println(b+9);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
