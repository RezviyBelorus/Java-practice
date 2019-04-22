package by.stormnet.hw_3.Task_4;

public class MathExp {
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
