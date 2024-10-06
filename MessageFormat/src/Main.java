import java.text.MessageFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення даних
        System.out.println("Введіть ціле число: ");
        int intValue = scanner.nextInt();

        System.out.println("Введіть число з плаваючою точкою: ");
        double floatValue = scanner.nextDouble();

        System.out.println("Введіть строку: ");
        scanner.nextLine(); // споживаємо залишок лінії
        String stringValue = scanner.nextLine();

        System.out.println("Введіть логічне значення (true/false): ");
        boolean boolValue = scanner.nextBoolean();

        // Форматоване виведення (10 разів з різними форматами)

        // 1. Виведення цілого числа в десятковому форматі
        System.out.printf("Ціле число (десятковий формат): %d\n", intValue);

        // 2. Виведення цілого числа в шістнадцятковому форматі
        System.out.printf("Ціле число (шістнадцятковий формат): %x\n", intValue);

        // 3. Виведення цілого числа у вісімковому форматі
        System.out.printf("Ціле число (вісімковий формат): %o\n", intValue);

        // 4. Виведення числа з плаваючою точкою
        System.out.printf("Число з плаваючою точкою: %.2f\n", floatValue);

        // 5. Виведення числа з плаваючою точкою у науковому форматі
        System.out.printf("Число з плаваючою точкою (науковий формат): %.2e\n", floatValue);

        // 6. Виведення строки з обмеженою довжиною поля (до 10 символів)
        System.out.printf("Строка (до 10 символів): %.10s\n", stringValue);

        // 7. Виведення строки з фіксованою шириною поля (20 символів, вирівняна ліворуч)
        System.out.printf("Строка (ширина поля 20): %-20s\n", stringValue);

        // 8. Виведення логічного значення в форматі "True/False"
        System.out.printf("Логічне значення: %b\n", boolValue);

        // 9. Використання MessageFormat для виведення строки
        String messageFormatOutput = MessageFormat.format("Ціле число: {0}, Плаваюче число: {1}, Строка: {2}, Логічне: {3}",
                intValue, floatValue, stringValue, boolValue);
        System.out.println("Виведення з використанням MessageFormat: " + messageFormatOutput);

        // 10. Виведення з нулями перед числом (мінімум 5 символів)
        System.out.printf("Ціле число (з нулями): %05d\n", intValue);

        scanner.close();
    }
}