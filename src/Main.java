import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число");
        String firstNumber = console.next();
        System.out.println("Введите второе число");
        int secondNumber = (int) console.nextDouble();
        int maxNumber = Math.max(new Integer(firstNumber), secondNumber);
        double minNumber = Math.min(new Double(firstNumber), secondNumber);
        System.out.println("Наибольшее из двух чисел: " + maxNumber);
        System.out.println("Наименьшее из двух чисел: " + minNumber);
    }
}