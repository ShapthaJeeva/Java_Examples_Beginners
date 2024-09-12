class Static {
    public static void main(String[] args) {
        Daughter M = new Daughter();  // object is created for Daughter class
        System.out.println(M.gender);

        System.out.println(Father.age);  // prints => 50

        Daughter.age = 18;  // Here age is changed for both Father and Daughter

        System.out.println(Father.age);  // prints => 18

        Father.print();  // without creating an object for Father class we can access method(print())
    }
}

class Father{
    static char gender = 'M';
    static int age = 50;  // when we use static for variable, the change made by overriding is for both Father and Daughter classes
    static void print(){
        System.out.println("Code io : Parent Class");
    }  // No object is created to Father class but method of Father class is accessed
}

class Daughter extends Father{
    char gender = 'F';
}
