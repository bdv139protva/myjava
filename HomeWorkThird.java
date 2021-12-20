/**
 * Java 1. Homework #3
 *
 * @author Bakeshko Daria
 * @version 20.12.21
 *
 */
import java.util.Arrays;
class HomeWorkThird {
    public static void main(String[] args) {
        changeToReverse1();
        changeToReverse2();
        changeToReverse3();

        fillMassive100();

        multiplyBy2IfLess6();
        fillDiagonalBy1();
        System.out.println(fillMassiveLenWithVal(5, 10));

    }

    //#3.1.1
    static void changeToReverse1() {
        int[] mass = {1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1};
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        
        for (int i = 0; i < mass.length; i++) {
            System.out.print((mass[i] == 0? 1 : 0) + " ");
        }
        System.out.println();
    }

    //#3.1.2
    static void changeToReverse2() {
        int[] mass = {0, 1, 0, 1, 0, 1, 0};
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 0) {
            System.out.print((mass[i] + 1) + " ");
            } 
            //if (mass[i] == 1) { Можно так, но компактнее выйдет:
            else {            
            System.out.print((mass[i] - 1) + " ");
            }
        }
        System.out.println();
    }

    //#3.1.3 Вот здесь не понимаю, что не так написала. Подскажите пожалуйста, он оба условия проходит и выдает 01010101,
    // потому что я вторглась в массив своим (mass[i]++)? Так нельзя?
     static void changeToReverse3() {
        int[] mass = {0, 0, 0, 0};
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 0) {
            System.out.print(mass[i]++);
            } 
            if (mass[i] == 1) {
            System.out.print(mass[i]++);
            }
        System.out.println();
        }
    }

    //#3.2
    static void fillMassive100() {
        int[] m = new int[100];
        for (int i = 0; i < m.length; i++) {
            m[i] = i;
            System.out.print(m[i] + 1 + " ");
        }
        System.out.println();
    }

    //#3.3
    static void multiplyBy2IfLess6() {
        int[] team = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < team.length; i++) {
            if (team[i] < 6) {
            System.out.print(team[i] * 2 + " ");
            } else {
            System.out.print(team[i] + " ");
            }
        }
        System.out.println();
    }

    //#3.4.1
    static void fillDiagonalBy1() {
        int counter = 1;
        int[][] square = new int[5][5];
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square.length; j++) {
                if (i == j) {
                square[i][j] = counter;
                }
                System.out.print(square[i][j] + " ");
                }
         System.out.println();
         }
         //Хотела вывести вторую диагональ, но не понимаю что не так.
         System.out.println();
         for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                int sum = i + j;
                if (sum == 5) {
                square[i][j] = counter;
                }
                System.out.print(square[i][j] + " ");
                }
         System.out.println();
         }
    }

    //#3.5 Тоже не разобралась что не так.
    static int[] fillMassiveLenWithVal(int len, int initialValue) {
        int v = initialValue;
        int[] mass = new int[len];
for (int i = 0; i < mass.length; i++) {
mass[i] = v;
}
        System.out.println(Arrays.toString(mass));
//}
 return mass;
    }
}
