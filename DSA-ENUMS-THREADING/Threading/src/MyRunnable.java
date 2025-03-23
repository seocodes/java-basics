public class MyRunnable implements Runnable {
    @Override
    //ANY CODE YOU WANT TO RUN IN A SEPARATE THREAD, PLACE WITHIN THE RUN METHOD
    public void run(){
        //THIS COUNTDOWN TIMER WILL RUN IN THE BACKGROUND, IN A SEPARATE THREAD
        for(int i = 1; i<=10; i++){
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Thread was interrupted.");
            }

            if(i == 10){
                System.out.println("Time is up");
                System.exit(0);
            }
        }
    }

}
