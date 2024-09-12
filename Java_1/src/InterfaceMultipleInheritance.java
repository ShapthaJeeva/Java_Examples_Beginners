// Multiple Inheritance using interfaces (cannot be done in normal classes)

interface Father{
    abstract void call();  
    abstract void talk();
}

interface Mother{
    abstract void call();  
    abstract void talk();
}

class InterFaceMultipleInheritance implements Father,Mother{
    public void call(){      
        System.out.println("Calling");
    }
    public void talk(){
        System.out.println("Talking");
    }

    public static void main(String[] args) {
        InterFaceMultipleInheritance ob = new InterFaceMultipleInheritance();
        ob.call();
        ob.talk();
    }
}
