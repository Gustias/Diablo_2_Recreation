package org.java.Diablo;

public class Test {
    public static void main(String[] args) {
        Enemy e1 = new Enemy(); // Pradinės koordinatės: (0, 0)
        Enemy e2 = new Enemy(5, 7);

        e1.move();
        e2.move(-2, 5);

        System.out.println("---------------------------------");
        e1.info();
        System.out.println("---------------------------------");
        e2.info();
        System.out.println("---------------------------------");
    }
}
