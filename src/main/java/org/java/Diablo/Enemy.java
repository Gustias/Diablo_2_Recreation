package org.java.Diablo;

public class Enemy {
    // KINTAMIEJI
    private int x;
    private int y;
    private int health = 100; // Pradinė gyvybių reikšmė, galima keisti

    public static final int ZINGSNIS = 1;

    // KONSTRUKTORIAI

    // Be Argumentų
    public Enemy() {
        this(0, 0);
    }

    // Su argumentais
    public Enemy(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // get/set
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    // METODAI

    // Movement
    public void move() {
        move(ZINGSNIS, 0);
    }

    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    // Println
    public void info() {
        System.out.println("Priešo koordinatės | X: " + x + " Y: " + y + " |");
        System.out.println("Gyvybės: " + health);
    }
}
