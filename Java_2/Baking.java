class Cake extends Thread{
    public void run(){
        try{
            //System.out.println("Mixing Ingredients for Cake "+Cake.currentThread().getId());
            //System.out.println("Baking Cake "+Cake.currentThread().getId());
            //System.out.println("Decorating Cake "+Cake.currentThread().getId());   

            System.out.println("Mixing Ingredients for Cake "+Cake.currentThread().getName());
            System.out.println("Baking Cake "+Cake.currentThread().getName());
            System.out.println("Decorating Cake "+Cake.currentThread().getName());    
        }
        catch(Exception e){
            System.out.println("Exception is caught");
        }
    }
    
}

class Baking {
    public static void main(String[] args) {  // main is also a thread
        int cakeCount = 4;
        for (int i=0; i<cakeCount; i++){
            Cake cake = new Cake();
            cake.start();

            cake.setPriority(Thread.MAX_PRIORITY);  // to give priority for a thread (default priority value = 5 )
            System.out.println(cake.getPriority());
            // minimum priority = 1
            // maximum priority = 10

            System.out.println(cake.isAlive());

            cake.setName("Cake "+(i+1));  // to set thread name as we want instead of default thread id
            // here we have to use getName() instead of getId()

            try{
                if(i==1){
                    cake.sleep(2000);  // to keep a thread sleep => it won't effect other threads
                }
            }
            catch(InterruptedException e){

            }
        }

        Cake sample = new Cake();
        sample.start();

        try{
            sample.join();  // to say that the following code of this join() should be executed after finishing running of the above start()
            // interrupting main thread not to run before the running of the thread finish
        }
        catch(InterruptedException E){

        }

        System.out.println("Outside forloop");
        //System.out.println(1/0);  // here all the other threads will be executed. only this line gives an error (it is in the main thread)
        
        // usually if there is an error, other code won't give their output(only error msg will be printed)
        // in multithreading => if there is a problem in a thread, that thread will only give an error. other threads will be executed
        // if we use a single thread, if there is an error in one line, the whole thread will give the error. no output is given.
        // that means => threads are independent
        System.out.println(sample.isAlive());
    }
}

// getId()
//setName()
//getName()
//getPriority() => to get the priority thread
//isAlive() => to check whether that thread is running or in active