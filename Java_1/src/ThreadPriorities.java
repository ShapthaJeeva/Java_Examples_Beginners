public class ThreadPriorities {
    public static void main (String args[]) {
        B b1 = new B();
        A a1 = new A(b1) ;
        A a2 = new A(b1) ;
        A a3 = new A(b1) ;
    
        a1.start ();
        a2.start ();
        a3.start ();
    
        try{
            a1.join ();
            a2.join ();
            a3.join ();
        } catch (InterruptedException e) {
            System. out.println (e);
        } finally {
            System. out.println ("Final value of totalNum in b1 is:"+ b1.getTotalNum());
        }
    }
}
