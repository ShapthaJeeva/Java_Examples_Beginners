class Final {
    public static void main(String[] args) {
        Father F = new Father();
    }
}

class Father{
    final char gender = 'M';  // we can't change this value by overriding
    int age = 50;
    final void print(){  // we can't change this by overriding
        System.out.println("Code io : Parent Class");
    }
}

class Daughter extends Father{
    char gender = 'F';
}