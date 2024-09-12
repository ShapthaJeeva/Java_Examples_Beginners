// Constructor

class Sample {
    int rolno;
    int marks;
/* 
    Sample(){   // this is the default parameter (which doens't include any parameter)

    }
    */

/* 
    Sample(){  // creating constructor Sample()
        System.out.println("This is a Default constructor");
        rolno = 71;  // we define default value here
        marks = 50;
    }*/

    Sample(int num, int mark){  // creating constructor Sample()
        System.out.println("This is a Default constructor");
        rolno = num;  // passing as parameter
        marks = mark;
    }
}

class Construct{
    public static void main(String[] args) {
        Sample obj = new Sample(78, 33);
        //Sample obj = new Sample();    // Sample() is called as Constructor becoz there is no function like Sample()
        System.out.println(obj.marks);  // default value is 0 in constuctor
        System.out.println(obj.rolno);
    }
}
