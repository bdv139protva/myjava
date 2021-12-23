/**
 * Java 1. Homework #1
 *
 * @author Bakeshko Daria
 * @version 16.12.21
 *
 */
class HomeWorkFirst {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    static void checkSumSign() {
        int a = -50;
        int b = 12;
        //if (a + b >= 0) {
        //    System.out.println("Sum is positive");
        //} else {
        //    System.out.println("Sum is negative");
        //}
        //String s = (a + b >= 0)? "Sum is positive" : "Sum is negative";
        System.out.println("Sum is " + (a + b >= 0? "positive" : "negative"));
    }
    static void printColor() {
        int value = 160;
        if (value <= 0) {
            System.out.println("Red");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        }
        if (value > 100) {
            System.out.println("Green");
        }
        //if (value <= 0) {
            //System.out.println("Red");
        //} else if (value <= 100) {
            //System.out.print("Yellow");
        //} else {
            //System.out.println("Green");
        //}
    }
    static void compareNumbers() {
        int a = -18;
        int b = 18;
        System.out.println("a " + (a >= b? ">= b" : "< b"));
    }
}
