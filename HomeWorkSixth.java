
 /**
 * Java 1. Homework #6
 *
 * @author Bakeshko Daria
 * @version 29.12.21 - 30.12.21
 *
 */
 /*1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
4. * Добавить подсчет созданных котов, собак и животных.
*/
class HomeWorkSixth{
    public static void main(String[] args) {
        IAnimal cat = new Cat(200);
        IAnimal dog = new Dog(500, 10);
        IAnimal[] animals = {cat, dog}; //пример полиморфизма
        for (IAnimal a : animals) {//цикл
            System.out.println(a);
            System.out.println(a.run(50));
            System.out.println(a.run(200));
            System.out.println(a.run(250));
            System.out.println(a.run(500));
            System.out.println(a.run(600));
            System.out.println(a.swim(5));
            System.out.println(a.swim(10));
            System.out.println(a.swim(20));
        }
        System.out.println("Animals were created: " + Animal.getCountOfAnimals() + ".");
    }
}

//создаем потомка на основании родительского типа
class Cat extends Animal {
    Cat(int runLimit, int swimLimit) {
        super(runLimit, swimLimit);//вызов конструктора родительского класса
    }

    //перегрузка конструктора для персонолизации кота
    Cat(int runLimit) {
        super(runLimit, 0);
    }

    @Override //Переопеределение метода под кота
    public String swim(int barrier) {
        return getClassName() + " can`t swim!!!";
    }
}

class Dog extends Animal {
    Dog(int runLimit, int swimLimit) {
        super(runLimit, swimLimit);
    }
}

interface IAnimal {
    String run(int barrier);
    String swim(int barrier);
}
//общий родительский тип
abstract class Animal implements IAnimal {
    //protected String name;
    protected int runLimit;
    protected int swimLimit;
    protected String className;
    protected static int countOfAnimals = 0;

    //прмтрчский конструктор*
    Animal(int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        className = getClass().getSimpleName();
        countOfAnimals++;//*подсчет каждой отработки конструктора (при создании животного)
    }

    @Override
    public String toString() {
        return className + ": run limit - " + runLimit + "m" +", swim limit - " + swimLimit + "m";
    }

    @Override
    public String run(int barrier) {
        if (runLimit < barrier) {
            return className + " couldn`t run " + barrier + "m!";
        } else {
            return className + " successfully run " + barrier + "m";
        }
    }

    @Override
    public String swim(int barrier) {
        if (swimLimit < barrier) {
            return className + " couldn`t swim " + barrier + "m!";
        } else {
            return className + " successfully swim " + barrier + "m";
        }
    }

    public String getClassName() {
        return className;
    }
    //*подсчет созданных животных
    public static int getCountOfAnimals() {
        return countOfAnimals;
    }
}

