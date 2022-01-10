 /**
 * Java 1. Homework #7
 *
 * @author Bakeshko Daria
 * @version 9.01.21 -10.01.21
 *
 */
 /*
 *1. Расширить задачу про котов и тарелки с едой.
 *2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
 *3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
 *4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
 *5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
 *6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
 */
 class HomeWorkSeventh {
    public static void main(String[] args) {
        Cat[] cats = { new Cat("Barsik", 13), new Cat("Murka", 10), new Cat("Persik", 17), new Cat("Jonyk", 5), new Cat("Pushok", 12)};
        Plate plate = new Plate(30, 200);
        System.out.println(plate);

        System.out.println("Cats eat");
        //коты едят I раз
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }

        System.out.println(plate);
        plate.addFood(55);
        System.out.println("Add some food ***");
        System.out.println(plate);

        System.out.println("And now Cats eat AGAIN");
        //коты едят II раз
        for (Cat cat : cats) {
            cat.isSatiety(false);
            cat.eat(plate);
            System.out.println(cat);
        }

        System.out.println(plate);
    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    //конструктор
    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    void isSatiety(boolean status) {
        satiety = status;
    }

    //уменьшает еду в тарелке за счет передачи тарелки (объекта) как параметра
    void eat(Plate plate) {
        if (!satiety) {
            satiety = plate.decreaseFood(appetite);
        }
    }

    @Override
    public String toString() {
        return "Cat: " + name + ", appetite: " + appetite + ", satiety: " + satiety;
    }
}

class Plate {
    private int food;
    private int volume;

    //конструктор
    Plate(int food, int volume) {
        this.food = food;
        this.volume = volume;
    }

    boolean decreaseFood(int portion) {
        if (food < portion) {
            return false;
        }
        food -= portion;
        return true;
    }

    void addFood(int food) {
        if (this.food + food <= volume) {
        this.food += food;
        }
    }

    @Override
    public String toString() {
        return "Food: " + food;
    }
}