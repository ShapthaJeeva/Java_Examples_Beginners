class Inheritance {
    public static void main(String[] args) {
        //Son s = new Son();
        Daughter s = new Daughter();
        System.out.println(s.gender);
        s.print();
    }
}

// Multilevel inheritance

class GrandFather{
    char gender = 'M';
    void print(){
        System.out.println("Parent Class");
    }
}
/* 
class Father extends GrandFather{
    
}

class Son extends Father{

} */

class Mother extends GrandFather{
    char gender = 'F';   // Override
}

class Daughter extends Mother{

}