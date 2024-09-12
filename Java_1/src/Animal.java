// Inheritance

class Animal {
    int noLegs = 4;

    public static void eat(){
        System.out.println("I am eating");
    }

    public static void walk(){
        System.out.println("I am walking");
    }
}

// instead of repeating same methods, we can inherit methods from Animal class
    /*
class Dog {
    Boolean canBark = true;
     
    int noLegs = 4;

    public static void eat(){
        System.out.println("I am eating");
    }

    public static void walk(){
        System.out.println("I am walking");
    } 
} */

class Dog extends Animal {
    Boolean canBark = true;
    int noLegs = 5;  // it's called as METHOD OVERRIDING or FIELD OVERRIDING (changing the value of a variable in class where ther is inheritance, that varible already has a value )

    public static void eat(){
        System.out.println("Dog is eating");  // eat() method print a different output other than before that is declared in Dog class 
    }
}

// calling Animal class
class Call {
    public static void main(String[] args){
        Animal obj = new Animal();
        System.out.println(obj.noLegs);
        obj.eat();
        obj.walk();
    }
}

// calling Dog class
// methods of Animal class are inherited 
class Call_Dog {
    public static void main(String[] args){
        Dog object = new Dog();
        System.out.println(object.noLegs);
        System.out.println(object.canBark);;
        object.eat();
        object.walk();
    }
}

class Cat extends Animal {
    Boolean canJump = true;
}

class Call_Cat {
    public static void main(String[] args){
        Cat objCat = new Cat();
        System.out.println(objCat.noLegs);
        System.out.println(objCat.canJump);
        objCat.eat();
        objCat.walk();
    } 
}

