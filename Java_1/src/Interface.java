interface Father{
    abstract void call();  // methods in interface should be abstract methods (necessity for interface), cannot have definition or body
    abstract void talk();
}

class Interface implements Father {  // implements is used for interface inheritance
    // methods in interface are abstract methods. so overriding is necessary
    public void call(){      // public is used to clear that call() methods in interface Father and class Interface are same
        System.out.println("Calling");
    }
    public void talk(){
        System.out.println("Talking");
    }

    public static void main(String[] args) {
        Interface ob = new Interface();
        ob.call();
        ob.talk();
    }
}
