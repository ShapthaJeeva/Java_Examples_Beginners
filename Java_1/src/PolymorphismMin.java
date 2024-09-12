
class PolymorphismMin {
    public static void main(String[] args){
        Method obj1 = new Method();
        obj1.min(5, 6);
        obj1.min(5, 6, 7);
    }
}

class Method{
    void min(int a, int b){   // signature of this method
        if(a<b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
    }
 
    void min(int a, int b, int c){    // signature of this method
        System.out.println(c);
    }

    void min(int[] arr){    // signature of this method
        System.out.println("minimum");
    }
}

