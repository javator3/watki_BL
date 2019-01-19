package pl.sda.watki;

public class Zadanie extends Thread{

    private int number;

    public Zadanie(int number) {
        this.number = number;
    }

    public void run(){
        for (int i = 0; i < 500; i++) {
            System.out.println(Thread.currentThread().getName() + " " + number * 2);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
