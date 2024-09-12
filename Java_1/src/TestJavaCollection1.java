import java.util.*;
class TestJavaCollection1{
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Car");//Adding object in arraylist 
        list.add("Bus");
        list.add("Jeep");
        list.add("Van");

        System.out.println(list);
        
        //Traversing list through Iterator 
        Iterator itr = list.iterator(); 
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
