package co.edu.campusucc.poo.domain;

public class ThereadExtends extends Thread{
    private int times;
    public void run ()
    
        {
            System.out.println("Thread Sttarted  Runnin... on ucc university");
            System.out.println("Random Times " + times);
            printTimes();

        }

        //Defined Behavior
        public void printTimes(){
            int timesCount = 0;
            while (timesCount<=times) {
                System.out.print("=");
                timesCount ++ ;
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
            }
            System.out.print("> ok");

        }

        public int getTimes() {

            return times;
        }

        public void setTimes(int times){
            this.times = times;
        }
    }

