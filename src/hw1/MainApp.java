package hw1;

public class MainApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange\n" + "Banana\n" + "Apple\n");
    }
    public static void checkSumSign() {
        int a = -2;
        int b = -5;
        int c = a + b;

        if (c >= 0) {      // если c больше или равно 0
            System.out.println("Сумма положительная");
        }else{
            System.out.println("сумма отрицательная");
        }
    }

    public static void printColor() {
        int value=101;

        if (value <= 0) {
            System.out.println("Красныйя");

        } else if (value == 1 && value <= 100) {

            System.out.println("Желтый");

        }else{
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 10;
        int b = 10;

        if (a >= b){
            System.out.println("a>=b");
        }else{
            System.out.println("a<b");
        }
    }
}
