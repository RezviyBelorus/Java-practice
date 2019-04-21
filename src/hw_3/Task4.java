package hw_3;

public class Task4 {
    public static void main(String[] args) {
        double degree = 180;
        double radians = Math.toRadians(180);
        int cos = (int)Math.cos(radians);


        int num1 = 256;
        int num2 = 8;
        int num3 = 2;
        int num4 = 3;

        double math = (cos + num1/num2 - num3 ^ num4)* Math.PI ;

        System.out.println("Mathematical expression = " + math);

    }
}
