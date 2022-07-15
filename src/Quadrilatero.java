public class Quadrilatero {

    public static void area(double lado) {
        System.out.println("Area do quadrado:" + lado * lado);
    }

    public static void area(double l1, double l2) {
        System.out.println("Area do retangulo:" + l1 * l2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("Area do trapezio:" + ((baseMaior + baseMenor) * altura) / 2);
    }

    public static void area(float diagonal1, float diagonal2) {
        System.out.println("Area do lozango:" + (diagonal1 * diagonal2) / 2);

    }

}


