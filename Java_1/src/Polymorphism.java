// Polymorphism - having same methods with different signatures
// Method overloading - using methods with same name which having different number of parameters

class Polymorphism {
    public static void main(String[] args){
        Method obj1 = new Method();
        obj1.display();
        obj1.display(5);
    } 
}

class Method{
    void display(){
        System.out.println("I am a void function");
    }

    void display(int a){
        System.out.println(a);
    }
}
