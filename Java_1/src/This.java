class This {
    public static void main(String[] args) {
        Father F = new Father();
        F.print('M', 50);
        System.out.println(F.gender);
        System.out.println(F.age);
    }
}

class Father{
    char gender;  
    int age;
    void print(char gender, int age){  
        this.gender = gender;  // this.gender => it says that it is in Father class & = gender is the char gender(given as parameter)
        this.age = age;
    }
}

class Daughter extends Father{
    char gender;
}
