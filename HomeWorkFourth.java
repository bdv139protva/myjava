/**
 * Java 1. Homework #4
 *
 * @author Bakeshko Daria
 * @version 25.12.21
 *
 */
 //gb.ru/posts/java_ticktacktoe_game - сттья
import java.util.Scanner;
import java.util.Random;
class HomeWorkFourth {
    final char SIGN_X = 'x'; // фишка поле - их знчния дстпны во всех мтдах, модефикатор final - финализирует (const);
    final char SIGN_O = 'o';
    final char SIGN_EMPTY = '.';
    char[][] table;//объвлние тблцы
    Scanner sc;
    Random random;
    public static void main(String[] args) {
        //HomeWorkFourth ttt = new HomeWorkFourth();//объект свзан с сслчной прмнной ttt (её тип - класс) для взва мтда game()
        //ttt.game();//взваю метод у объекта (ч\з ссылку)
        new HomeWorkFourth().game();
    }

    HomeWorkFourth() {//у мтда имя плнстью свпдет с имнем клсса, птму с БОЛЬШОЙ - это конструктор!
        //System.out.println("constructor");
        table = new char[3][3];//инициализация (сздние) тблцы
        sc = new Scanner(System.in);
        random = new Random();
    }

    void game() { // в этом мтде вся лгка игры
        //System.out.println("game");
        initTable();//мтод проинициализирует массив
        printTable();
        while (true) {//бскнчный игрвой цкл
            turnHuman();
            if (isWin(SIGN_X)) {
                System.out.println("YOU WON!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW...");
                break;
            }
            turnAi();
            printTable();
            if (isWin(SIGN_O)) {
                System.out.println("AI WON!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW...");
                break;
            }
        }
        printTable();
    }

    void initTable() {
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table.length; x++) {
                table[y][x] = SIGN_EMPTY;
            }
        }
    }

    void printTable() {
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table.length; x++) {
                System.out.print(table[y][x] + " ");
            }
            System.out.println();
        }
    }

    void turnHuman() {
        int x, y;
        do {//на входе в I р в лбом слчае, а птом - тльк если услвие истнно
            System.out.print("Enter x y [1...3]: ");
            x = sc.nextInt() - 1;//т.к. мссивы от 0 идут и мы срзу прбрзуем в 0
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));//прврка чсло в грницах, ячйка свбдна - истина
        table[y][x] = SIGN_X;
    }

    void turnAi() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table[y][x] = SIGN_O;
    }
    //не окзлись ли крднты за табл
    boolean isCellValid(int x, int y) { 
        if (x < 0 || y < 0 || x > 2 || y > 2) {
        return false;
        }
        return table[y][x] == SIGN_EMPTY;
    }
    //прврка: выиграл-ничья
    boolean isWin(char ch) {
        //Вариант для дз п2 Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов
        //вертикали и горизонтали
        for (int c = 0; c < table.length; c++) {
            if ((table[0][c] == ch && table[1][c] == ch && table[2][c] == ch) ||
                (table[c][0] == ch && table[c][1] == ch && table[c][2] == ch)) return true;
            }
        //диагонали
        if ((table[0][0] == ch && table[1][1] == ch && table[2][2] == ch) || (table[2][0] == ch && table[1][1] == ch && table[0][2] == ch)) return true;
        //Вариант из лекции
        //1ая - у - врткали
        //if (table[0][0] == ch && table[0][1] == ch && table[0][2] == ch) return true;
        //if (table[1][0] == ch && table[1][1] == ch && table[1][2] == ch) return true;
        //if (table[2][0] == ch && table[2][1] == ch && table[2][2] == ch) return true;
        //грзнтали
        //if (table[0][0] == ch && table[1][0] == ch && table[2][0] == ch) return true;
        //if (table[0][1] == ch && table[1][1] == ch && table[2][1] == ch) return true;
        //if (table[0][2] == ch && table[1][2] == ch && table[2][2] == ch) return true;
        //дгнали
        //if (table[0][0] == ch && table[1][1] == ch && table[2][2] == ch) return true;
        //if (table[2][0] == ch && table[1][1] == ch && table[0][2] == ch) return true;
        return false;
    }

    boolean isTableFull() {
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table.length; x++) {
                if (table[y][x] == SIGN_EMPTY) {//если ншли хть 1 пстую ячйку, знчит тблца вся не зплна- взврщаем ложь
                    return false;
                }
            }
        }
        return true;//всё пршли, тбл зплнна - истна
    }
}


