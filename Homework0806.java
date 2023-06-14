package homeWork;

public class Homework0806 {
    public static void main(String[] args) {
        //double pizza1 = getArea(24);
        //double pizza2 = getArea(28);
//        getDifferenceCalorie(pizza1, pizza2);
//        getDifferenceCalorie(getArea(24),getArea(28));
        printResult();

    }

    static double getArea(int d) {
        double a = Math.PI * Math.pow(d / 2, 2);
        return a;
    }
    static double getDifferenceCalorie (double p1, double p2) {
        double result = (p2 - p1) * 40;
        return result;
    }
    static void printResult (){
        System.out.println(getDifferenceCalorie(getArea(24),getArea(28)));
    }
}
