/**
 * Java 1. Homework #3
 *
 * @author Bakeshko Daria
 * @version 20.12.21 - 23.12.21
 *
 */
import java.util.Arrays;
class HomeWorkThird {
    public static void main(String[] args) {
        changeToReverse1();
        //changeToReverse2();

        fillMassive100();

        multiplyBy2IfLess6();
        fillDiagonalBy1Left();
        fillDiagonalBy1Right();
        fillDiagonalBy1Both();
        
        int[] mass = fillMassiveLenWithVal(5, 10);
        System.out.println(Arrays.toString(mass));

    }

    //#3.1.1 Задать целочисленный массив, состоящий из элементов 0 и 1. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    static void changeToReverse1() {
        int[] mass = {1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 1};
        System.out.print(Arrays.toString(mass));
        System.out.println();
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 1) {
            mass[i] = 0;
            } else {
            mass[i] = 1;        
            }
        }
        System.out.print(Arrays.toString(mass));
        System.out.println();

    }

    //??#3.1.2 Задать целочисленный массив, состоящий из элементов 0 и 1. 
    //С помощью цикла и условия заменить 0 на 1, 1 на 0;
    

    //#3.2 Задать пустой целочисленный массив длиной 100. 
    //С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    static void fillMassive100() {
        int[] m = new int[100];
        //System.out.print(Arrays.toString(m));
        //System.out.println();
        for (int i = 0; i < m.length; i++) {
            m[i] = i + 1;
        }
        System.out.print(Arrays.toString(m));
        System.out.println();
        System.out.println();
    }

    //#3.3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] 
    //пройти по нему циклом, и числа меньшие 6 умножить на 2;
    static void multiplyBy2IfLess6() {
        int[] team = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print(Arrays.toString(team));
        System.out.println();
        for (int i = 0; i < team.length; i++) {
            int a = team[i];
            if (a < 6) {
            team[i] = a * 2;
            } else {
            team[i] = a;
            }
        }
        System.out.print(Arrays.toString(team));
        System.out.println();
    }

    //#3.4.1 Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), 
//и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, 
//если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких 
//элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

    static void fillDiagonalBy1Left() {
        int counter = 1;
        //int[][] square = { {2, 2, 2, 2, 2}, {2, 2, 2, 2, 2}, {2, 2, 2, 2, 2}, {2, 2, 2, 2, 2}, {2, 2, 2, 2, 2} };
        int[][] square = new int[5][5];

        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square.length; j++) {
                int a = square[i][j];
                if (i == j) {
                square[i][j] = counter;
                } else {
                square[i][j] = a;
                }
                System.out.print(square[i][j] + " ");
            }
        System.out.println();
        }
        System.out.println();
    }
        //#3.4.2 Другая диагональ - обратная.
    static void fillDiagonalBy1Right() {
        int counter = 1;
        //int[][] square = { {2, 2, 2, 2, 2}, {2, 2, 2, 2, 2}, {2, 2, 2, 2, 2}, {2, 2, 2, 2, 2}, {2, 2, 2, 2, 2} };
        int[][] square = new int[5][5];
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                int b = square[i][j];
                int sum = i + j;
                if (sum == 4) {
                square[i][j] = counter;
                } 
                System.out.print(square[i][j] + " ");
            }
        System.out.println();
        }
        System.out.println();
    }

        //#3.4.2 Обе диагонали вместе.
    static void fillDiagonalBy1Both() {
        int counter = 1;
        //int[][] square = { {2, 2, 2, 2, 2}, {2, 2, 2, 2, 2}, {2, 2, 2, 2, 2}, {2, 2, 2, 2, 2}, {2, 2, 2, 2, 2} };
        int[][] square = new int[5][5];
            for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square.length; j++) {
                int a = square[i][j];
                if (i == j) {
                square[i][j] = counter;
                } else {
                square[i][j] = a;
                }
            }
            }
        for (int i = 0; i < square.length; i++) {
           for (int j = 0; j < square[i].length; j++) {
               if (i == j || i + j == 4) {
               square[i][j] = counter;
               }
               System.out.print(square[i][j] + " ");
            }
        System.out.println();
        }
    }


    //#3.5 Написать метод, принимающий на вход два аргумента: len и initialValue, 
    //и возвращающий одномерный массив типа int длиной len, 
    //каждая ячейка которого равна initialValue;
    static int[] fillMassiveLenWithVal(int len, int initialValue) {
        int[] mass = new int[len];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = initialValue;
        }
        return mass;
    }
}


