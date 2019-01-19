package pl.sda.watki;

class Runner implements Runnable{
    long suma = 1;

    @Override
    public void run() {

        for (int i = 0; i < 500; i++) {
            System.out.println("Hello: " + i + " thread: " + Thread.currentThread().getName());

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            suma*= i + 64435123;
        }
    }
}


public class Main {

    public static void main(String[] args) {
        Zadanie thread1 = new Zadanie(5);
        Zadanie thread2 = new Zadanie(7);
        thread1.start();
        thread2.start();






/*        Thread thread = new Thread(new Runner());
        Thread thread2 = new Thread(new Runner());
        thread.start();
        thread2.start();

        RunnerExample runnerExample = new RunnerExample();
        RunnerExample runnerExample1 = new RunnerExample();
        runnerExample.start();
        runnerExample1.start();

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 500; i++) {
                    System.out.println("Hello: " + i + " thread: " + Thread.currentThread().getName());

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread3.start();*/
    }
}
