public class Main {
    public static void main(String[] args) {
        System.out.println("Test my methods:");
        double a = 12.5;
        double b = 88.8;
        double r = sum(a, b);
        System.out.println(a + " + " + b + " = " + r);
    }
    public static double sum (double a, double b) {
        return a + b;
    }

}
