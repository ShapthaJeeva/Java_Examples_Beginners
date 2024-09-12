class Throw {
    static void check(int age){
        if (age<18){
            throw new ArithmeticException("Age invalid");  // to explicitly throw an exception (previously in catch block system catched the error but here we are manually catching an error)
            // ArithmeticException() is class. to create a new object on this we use new keyword
            // try catch blocks should be given
        }
    }

    public static void main(String[] args) {
        try {
            check(9);
        }
        catch(ArithmeticException E){
            System.out.println(E);  // error is printed here
            System.out.println(E.getMessage());  // to get that message only
        }

        System.out.println("Hello!!!");
    }
}
