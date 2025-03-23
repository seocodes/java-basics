public class MyRunnable implements Runnable{

    private final String text;

    MyRunnable(String text){
        this.text = text;
    }

    @Override
    public void run(){
        try{
            for(int i = 1; i<= 5; i++){
                Thread.sleep(1000);

                //this.text is not necessary because there’s no naming conflict in the code.
                //the run() method does not have a local variable or parameter named text, so the method knows it's that instance's attribute (this.text)
                System.out.println(Thread.currentThread().getName() + " " + text);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted");
        }

    }
}
