package ss4ClassAndObject;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = scanner.nextDouble();
        System.out.print("Input b: ");
        double b = scanner.nextDouble();
        System.out.print("Input c: ");
        double c = scanner.nextDouble();

        QuadraticEquation eq = new QuadraticEquation(a, b, c);

        double delta = eq.getDiscriminant();

        if (delta > 0) {
            System.out.printf("The equation has 2 solutions:" + eq.getRoot1(), eq.getRoot2());
        } else if (delta == 0) {
            System.out.printf("The equation has double solutions:" + eq.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
