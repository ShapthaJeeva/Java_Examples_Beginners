
// Objects cannot be created directly in Abstract class
abstract class Computer {
    abstract void turnOff();  // Abstract method
    void turnOn(){
        System.out.println("Turning ON");
    }
}

class HP extends Computer{
    void turnOn(){
        System.out.println("Turning ON-1");   // Overriding
    }
    void turnOff(){
        System.out.println("Turning OFF-HP");  // Overinding is necessary for abstract method
    }
}

class DELL extends Computer{
    void turnOff(){
        System.out.println("Turning OFF-DELL");  // Overinding is necessary for abstract method
    }
}

class Abstract{
    public static void main(String[] args) {
        HP ob = new HP();  // Using inheritance new object is created that uses the methods in abtract class
        ob.turnOn(); 
        ob.turnOff();

        DELL ob1 = new DELL();
        ob1.turnOn();
        ob1.turnOff();
    }
}