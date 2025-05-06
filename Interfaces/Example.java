package Interfaces;

public class Example {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override public void run(){
                System.out.println("new Thread created");
            }
        }).start();
    }
}
