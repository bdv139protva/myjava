/**
 * Java 1. Homework #2
 *
 * @author Bakeshko Daria
 * @version 18.12.21
 *
 */
class HomeWorkSecond {
    public static void main(String[] args) {
        System.out.println(talkSum10to20(13, 70));
        System.out.println(writePositiveOrNot(-9));
        System.out.println(talkPositiveOrNot(-40));
        printVictory();
    }
    
    //#2.1
    static boolean talkSum10to20(int a, int b) {
        int c = a + b;
        return (c >= 10 && c <= 20);
    }

    //#2.2
    static String writePositiveOrNot(int w) {
        return w >= 0 ? "positive" : "negative";
    }

    //#2.3
    static boolean talkPositiveOrNot(int n) {
        return (n >= 0);
    }

    //#2.4
    static void printVictory() {
        for (int p = 0; p < 3; p++) {
            System.out.println("Victory!");
        }
    }
    //#2.5 *!!!*
    
}
