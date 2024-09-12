import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.HashSet;
import java.util.*;


public class Collections{
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();  // datatype of elements which will be stored in Stack is given into <>
        stk.push(1);  // adds element 1
        stk.add(3);  // add() is a generalized method for all types of list. instead of using several methods for every list types we can use common method for all type of list(LinkedList, Stack, Array,...)
        stk.push(2);  //instead of push(), general method is remove()
        System.out.println(stk.peek());  // returns the top element of the stack
        System.out.println(stk);
        stk.pop();
        System.out.println(stk);

        HashMap<Integer,Character> hsh = new HashMap<>();
        hsh.put(1,'a');  // to insert (key,value) pair

        ArrayList<String> arr = new ArrayList<>();
        arr.add("Hi");
        arr.add("Subscribe");

        Iterator it = arr.iterator();  // iterator is used to traverse any type of data structure

        while(it.hasNext()){
            System.out.println(it.next());
        }

        LinkedList<String> lList = new LinkedList<>();
        lList.add("Hi");
        lList.add("Subscribe");

        Iterator ite = lList.iterator();  // iterator is used to traverse any type of data structure

        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println(lList.size());
    }
}

// Stack, LinkedList, HashSet, Queue, HashMap....
// HashSet => No index, No duplicate values even if we add same number in two times
// ArrayList => we don't have to give the length of the list. length can be anything