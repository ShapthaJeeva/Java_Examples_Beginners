// Runnable

class Cake implements Runnable{
    // class Cake extends Desert implements Runnable{
    // here Cake class inherites Desert at the same time it implements Thread
    public void run(){
        System.out.println("Mixing Ingredients for Cake "+Thread.currentThread().getId()); // here we should use Thread. instead of Cake.
        // when we use Cake.currentThread() there will be an error because now Cake class doesn't extend Thread. So we should use Thread.currentThread()

        System.out.println("Baking Cake "+Thread.currentThread().getId());
        System.out.println("Decorating Cake "+Thread.currentThread().getId());
    }
}

class ThreadCake {
    public static void main(String[] args) {
        int cakeCount = 4;
        for(int i=0; i<cakeCount; i++){
            Cake cake = new Cake();  // cake is the runnable object
            Thread thread = new Thread(cake);  // here we create a new tread because Cake class doesn't extend Thread. so there is no thread
            // to start() we have to create a thread
            thread.start(); 
        }
    } 
}
