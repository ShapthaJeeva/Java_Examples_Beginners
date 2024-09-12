class ExceptionHandling {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        try{  // code with possibility of having error
            System.out.println(a/b);
        }
        // we can give multiple catch block for a try block (minimum one)
        // there are more than one exceptions for one code. so every exception can be handled by every catch block
        // but only one catch block is executed
        
        // if we don't know what exception can be occured, we can give as => catch(Exception E){
        
        catch(ArithmeticException E){  // possible error that could be occured & creating an object for that error 
            System.out.println("b is 0!!");
        }
        
        catch(Exception E){
            System.out.println("b is 0");
        }

        finally{  // Always it is executed even if there is no error
            System.out.println("Finally Block");
        }

        System.out.println("Hello");
    }
}
