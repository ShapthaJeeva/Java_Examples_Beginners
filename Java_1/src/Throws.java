class UserDefined extends Exception{  // Exception is default class in java
    UserDefined(String str){
        super(str);
    }

    /* 
    String msg;  // an instant variable
    UserDefined(String str){
        this.msg = str;
    }

    String getMsg(){
        return this.msg;
    }  */
}

class Throws{
    // throws => if there is an error it will be handled otherwise it continues
    // instead of using multiple catch blocks for every exception types we can use throws keyword to handle any exceptions
    
    static void check(int age) throws UserDefined,ArithmeticException{  // if we expect that there may be errors in both UserDefined and ArithmeticException we can handle like this
        if (age<18){
            // throw new ArithmeticException("Age invalid");  => this is for the code given as comment
            throw new UserDefined("Age invalid!");  
        }
        else{
            throw new ArithmeticException("Age valid");
        }
    }

    public static void main(String[] args) {
        try {
            check(2);
        }
        catch(UserDefined E){ 
            System.out.println(E.getMessage());  
        }
        catch(ArithmeticException E){
            System.out.println(E.getMessage());
        }

        System.out.println("Hello!!!");
    }
}
