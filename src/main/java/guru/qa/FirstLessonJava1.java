package guru.qa;

public class FirstLessonJava1 {
    public static void main(String[] args) {

     MathOperations();
     LogicalOperations();
     OperationsWithTypes();
     Overflow();
     DivisibilityOfANumber();
    }

    private static void MathOperations() {
        int a = 56;
        int b = 7;

        System.out.println("Математические операции");
        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));
        System.out.println("Умножение: " + (a * b));
        System.out.println("Деление: " + (a / b));
        System.out.println("Остаток от деления: " + (a % b));

    }
    private static void Overflow() {
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;

        System.out.println("Переполнение значений");
        System.out.println("Переполнение int при сложении: " + (maxInt + 1));
        System.out.println("Переполнение int при вычитании: " + (minInt - 1));
    }
    private static void LogicalOperations() {
        boolean x = true;
        boolean y = false;

        System.out.println("Логические операции");
        System.out.println("x AND y: " + (x && y));
        System.out.println("x OR y: " + (x || y));
        System.out.println("NOT x: " + (!x));


        int age = 19;
        boolean isAdult = age <= 17;
        boolean hasWine = true;

        System.out.println("Купит себе бутылку винишка : " + (isAdult && hasWine));
    }
    private static void OperationsWithTypes() {
        int intVal = 102;
        double doubleVal = 17.37;

        System.out.println("Комбинация типов (int и double)");
        System.out.println("Сложение: " + (intVal + doubleVal));
        System.out.println("Вычитание: " + (intVal - doubleVal));
        System.out.println("Умножение: " + (intVal * doubleVal));
        System.out.println("Деление: " + (intVal / doubleVal));
    }
    private static void DivisibilityOfANumber() {
        int number = 27;

        System.out.println("Проверка делимости числа");
        boolean divisibleBy3 = (number % 3 == 0);
        boolean divisibleBy5 = (number % 5 == 0);

        System.out.println("Число: " + number);
        System.out.println("Делится на 3? " + divisibleBy3);
        System.out.println("Делится на 5? " + divisibleBy5);
        System.out.println("Делится одновременно на 3 и 5? " + (divisibleBy3 && divisibleBy5));
    }
}










