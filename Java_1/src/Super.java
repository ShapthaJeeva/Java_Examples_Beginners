class Super {
    public static void main(String[] args) {
        Father F = new Father();
        System.out.println(F.gender);

        Daughter M = new Daughter();
        System.out.println(M.gender);  // here gender of Daughter 'F' is printed
        M.print();  // here gender of Parent class (Father) 'F' is printed
    }
}

class Father{
    char gender = 'M';  
    int age = 50;
    void print(){  
        System.out.println("Code io : Parent Class");
    }
}

class Daughter extends Father{
    char gender = 'F';

    void print(){
        System.out.println("Daughter Class");
        super.print();  // when we call print() method of Daughter it calls print() method of Father
        System.out.println(super.gender);  // it uses the value of parent class instead of it's own value
    }
}
