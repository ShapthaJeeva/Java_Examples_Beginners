class cakeCounter {
    int cakeCount = 0;

    public synchronized void increment(){
    // if we don't use synchronized keyword here, there will be different output because count increment can be overlapped(when both the teams increase count at the same time)
        cakeCount++;
    }
}

class Team implements Runnable{
    cakeCounter counter;  // an object for cakeCounter class

    Team(cakeCounter counter){  // creating constructor for Team
        this.counter = counter;
    }
    public void run(){
        for(int i=0; i<1000; i++){
            counter.increment();
        }
    }
}

// main class

class Synchronized{
    public static void main(String[] args) {
        cakeCounter counter = new cakeCounter();

        // both team 1 and team 2 are using a shared variable for increment
        // so we have to use same counter for both 
        // that's why we are using synchronized keyword
        Thread team1 = new Thread(new Team(counter));
        Thread team2 = new Thread(new Team(counter));

        team1.start();
        team2.start();

        // to print the count after finishing all threads of both the teams
        try{
           team1.join();
           team2.join(); 
        }
        catch(Exception E){

        }

        System.out.println(counter.cakeCount);
    }
}