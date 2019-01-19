package pl.sda.watki;

class Sender{
    public void send(String msg){
        System.out.println("Sending: " + msg);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(msg + " Send \n");
    }
}

class ThreadSend extends Thread{
    private String msg;
    private Thread thread;
    private Sender sender;

    @Override
    public void run(){
        synchronized (sender) {
            sender.send(msg);
        }
    }


    public ThreadSend(String msg, Sender sender) {
        this.msg = msg;
        this.sender = sender;
    }
}

public class Sync {

    public static void main(String[] args) {

        Sender sender = new Sender();
        ThreadSend threadSend = new ThreadSend("Dzien dobry", sender);
        ThreadSend threadSend1 = new ThreadSend("Do widzenia", sender);
        threadSend.start();
        threadSend1.start();

        try {
            threadSend.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            threadSend.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("KONIEC");


    }
}
