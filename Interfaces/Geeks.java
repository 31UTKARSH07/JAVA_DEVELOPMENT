package Interfaces;

public class Geeks {
    public static void main(String[] args) {
        new Thread(()->System.out.println("Utkarsh Pathak")).start();
    }
}
/*we can see the use of a lambda
expression to implement the Runnable
functional interface and create a new thread. */