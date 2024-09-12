class Cake extends Thread{
    public void run(){
        // run() is a default method that already exists in Thread class
        // we have to override it
        // run() should be public void, because it is defined as public in Thread class

        System.out.println("Mixing Ingredients for Cake "+Cake.currentThread().getId()); // here we can use Thread. instead of Cake.
        // it returns the Thread Id of the current running Thread

        System.out.println("Baking Cake "+Cake.currentThread().getId());
        System.out.println("Decorating Cake "+Cake.currentThread().getId());
    }
}

class ThreadBaking {
    public static void main(String[] args) {
        int cakeCount = 4;
        for(int i=0; i<cakeCount; i++){
            Cake cake = new Cake();
            // cake.run();  // here parallel processing doesn't occur. It occurs one by one(Thread Ids are same for all processes in output)
            cake.start(); // here parallel processing occurs
        }
    }    
}

// We have to use try catch for Threads
// we should call as start()
// Concurrent(parallel) => Thread & Runnable
// Not concurrent => Synchronized