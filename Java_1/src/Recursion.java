// Recursion => function calling itself in it's function

// Base case => Ending position
// Recursive case => repeated case

class Recursion {
    public static void main(String[] args) {
        natPrint(10);
    }

    public static void natPrint(int n){
        // Base case
        if(n==1){
            System.out.println(1);
        }
        // Recursive case
        else{
            System.out.println(n);
            natPrint(n-1);
        }
    }
}
