class ApplForm{
    private String name;  // variables/fields
    int rollno;
    
    
    public void display(){
        System.out.println(name);   // methods
        System.out.println(rollno);
    }  

    public String getValue(){
        return name;    // this getValue function can access(store) name bcoz it is into the function
    }


    //***********
    // setter function  - can be used to access private variables into a class
    public void setValues(String str, int number){
        name = str;
        rollno = number;
    }
}

class Main{
    public static void main(String[] args){
        ApplForm codeio = new ApplForm();  // 1st object
        //codeio.name = "Codeio";
        codeio.setValues("Codeio", 71);  //********
        //codeio.rollno = 71;
        codeio.display();  // output -> Codeio, 71
        System.out.println(codeio.rollno);  // output -> 71
        // the following gives an error because the private variable is used 
        // but in the above, setter function is used to access private variable

        
        ApplForm viewer = new ApplForm();  // 2nd object
        // viewer.name = "Viewer";  // it will give an error bcoz name is private
        // viewer.rollno = 78106;
        viewer.setValues("Viewer", 78106);
        viewer.display();  // output -> Viewer, 78106
        String std2 = viewer.getValue();
        System.out.println(std2);  // output -> Viewer
        System.out.println(std2+" = Student 2");  // output -> Viewer = Student 2
    }
}

