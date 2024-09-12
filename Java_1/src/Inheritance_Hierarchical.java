class Inheritance_Hierarchical {
    public static void main(String[] args) {
        Daughter D = new Daughter();
        System.out.println(D.gender);
        D.print();

        Son S = new Son();
        System.out.println(S.gender);
        S.print();

        GrandDaughter G = new GrandDaughter();
        System.out.println(G.gender);
        G.print();

        GrandGrandDaughter GG = new GrandGrandDaughter();
        System.out.println(GG.gender);
        GG.print();
    }
}

// Hierarchical inheritance (One parent class & two children classes)

class Father{
    char gender = 'M';
    void print(){
        System.out.println("Parent Class");
    }
}

class Daughter extends Father{
    char gender = 'F';   // Override
}

class Son extends Father{
    char gender = 'M';   // Override
}

// Hybrid inheritance

class GrandDaughter extends Daughter{
    void print(){
        System.out.println("GrandDAughter");
    }
}

class GrandGrandDaughter extends GrandDaughter{
    void print(){
        System.out.println("GrandGrandDAughter");
    }
}