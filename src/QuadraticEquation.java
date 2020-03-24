public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return  (Math.pow(this.b, 2) - 4 * this.a * this.c);
    }

    public double getRoot1() {
        if (this.getDiscriminant() >= 0) {
            return (-this.b + Math.sqrt((this.getDiscriminant()))) / (2 * this.a);
        }
        return 0;
    }

    public double getRoot2() {
        if (this.getDiscriminant() >= 0) {
            return (-this.b - Math.sqrt((this.getDiscriminant()))) / (2 * this.a);
        }
        return 0;
    }

    public void displaySolution() {
        if (this.getRoot1() == 0 && this.getRoot2() == 0) {
            System.out.println("This equation has no solution!");
        } else if (this.getRoot1() == this.getRoot2()) {
            System.out.printf("This equation has one solution x = %.3f", getRoot1());
        } else {
            System.out.printf("This equation has two solution x1 = %.3f and x2 = %.3f",getRoot1(),getRoot2());
        }

    }
}
