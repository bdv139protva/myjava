/**
 * Java 1. Homework #2
 *
 * @author Bakeshko Daria
 * @version 18.12.21-??.12.21
 *
 */
class HomeWorkSecond_2 {
    public static void main(String[] args) {
        System.out.println(isSum10to20(13, 70));
        System.out.println(isSum10to20(13, 7));
        System.out.println(isSum10to20(13, 2));
        System.out.println(isSum10to20(3, 7));
        System.out.println(isSum10to20(13, -70));

        writePositiveOrNot(0);
        writePositiveOrNot(30);
        writePositiveOrNot(-9);

        System.out.println(isNegative(0));
        System.out.println(isNegative(-88));
        System.out.println(isNegative(5));

        printWordNTimes("Studying is not about Time. It is about Effort", 3);
        printWordNTimes("Ooops", -5);
        printWordNTimes("O, no...", 0);
    }
    
    //#2.1
    static boolean isSum10to20(int a, int b) {
        int c = a + b;
        return (c >= 10 && c <= 20);
    }

    //#2.2
    static void writePositiveOrNot(int w) {
        System.out.println( w >= 0 ? "positive" : "negative");
    }

    //#2.3
    static boolean isNegative(int n) {
        return n < 0;
    }

    //#2.4
    static void printWordNTimes(String word, int times) {
        for (int p = 0; p < times; p++) {
            System.out.println(word);
        }
    }
    //#2.5 *!!!*
    
}
