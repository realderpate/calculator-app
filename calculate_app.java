package calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class calculate_app {
    public static double plus(double a, double b)
    {
        return a + b;
    }
    public static double minus(double a, double b)
    {
        return a - b;
    }
    public static double multiply(double a, double b)
    {
        return a * b;
    }
    public static double division(double a, double b)
    {
        return (double)a/b;
    }

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hello, this is simple calculator");
        System.out.println("Please insert two numbers");
        double a = Double.parseDouble(reader.readLine());
        double b = Double.parseDouble(reader.readLine());
        System.out.println("Now choose the operation");
        System.out.println("1 - plus");
        System.out.println("2 - minus");
        System.out.println("3 - multiply");
        System.out.println("4 - division");
        int operationType = Integer.parseInt(reader.readLine());
        if(operationType == 1)
            System.out.println(plus(a, b));
        else if(operationType == 2)
            System.out.println(minus(a, b));
        else if(operationType == 3)
            System.out.println(multiply(a, b));
        else if(operationType == 4)
            if (b != 0)
                System.out.println(division(a, b));
            else
                System.out.println("Division to 0 is invalid operation");
        else
            System.out.println("Pleasw type a valid number of operation");
    }
}
