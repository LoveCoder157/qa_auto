
package init;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson_1 {

    public static int even;
    public static int odd;

    public static  void  main(String[] args) throws IOException {

//      Task_1
//      Напиши программу, которая выводит на экран надпись:
//      JAVA HOME 10 раз
        for (int i = 0; i < 10; i++) { System.out.println("JAVA HOME"); }

//      Task_2
//      В методе main создай объект Man, сохрани ссылку на него в переменную man.
//      Создай также объект Woman и сохрани ссылку на него в переменную woman.
        Man   man   = new Man();
        Woman woman = new Woman();

//      Task_3
//      В man.wife сохрани ссылку на ранее созданный объект Woman.
//      В woman.husband сохрани ссылку на ранее созданный объект Man (подсказка: woman.husband = man;).
        man.wife      = woman;
        woman.husband = man;

//      Task_4
//      Написать функцию, которая возвращает минимум из двух чисел.
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));

//      Task_5
//      Добавь метод public static int convertToSeconds(int hour) который будет конвертировать часы в секунды.
//      Вызови его дважды в методе main с любыми параметрами. Результаты выведи на экран, каждый раз с новой строки.
        System.out.println(convertToSeconds(1));
        System.out.println(convertToSeconds(2));

//      Task_6
//      Таблица умножения
//      Выведи на экран таблицу умножения 10 на 10 в следующем виде:
        System.out.println(multiplicationTable(1));
        System.out.println(multiplicationTable(2));
        System.out.println(multiplicationTable(3));
        System.out.println(multiplicationTable(4));
        System.out.println(multiplicationTable(5));
        System.out.println(multiplicationTable(6));
        System.out.println(multiplicationTable(7));
        System.out.println(multiplicationTable(8));
        System.out.println(multiplicationTable(9));
        System.out.println(multiplicationTable(10));

//      Task_7
//      Подсчитать суммарную стоимость яблок.
//      За суммарную стоимость яблок отвечает переменная
        Apple apple = new Apple();
        apple.addPrice(50);
        Apple apple2 = new Apple();
        apple2.addPrice(100);
        System.out.println("Стоимость яблок " + Apple.applesPrice);

//      Task_8

        Human human = new Human();
        human.setName("Макс");
        System.out.println(human.name);

//      Task_9
//      Напишите метод checkSeason. По номеру месяца, метод должен определить время года (зима, весна, лето, осень) и вывести на экран.
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
        checkSeasonByIf(1);
        checkSeasonByIf(5);
        checkSeasonByIf(3);
        checkSeasonByIf(7);
//       Task_10
//       У человека должно быть имя (name, String), возраст (age, int), вес (weight, int), сила (strength, int).
//        Клас і рішення внизу


//      Task_11
//      Создать class Dog. У собаки должна быть кличка String name и возраст int age.
//      Создайте геттеры и сеттеры для всех переменных класса Dog.
//       Клас і рішення внизу

//      Task_12
//      Задача: Программа вводит два числа с клавиатуры и выводит их максимум в виде “The max is 25”.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = "The max is ";
        int max = 0;
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        if(a <= b)
            max = b;
        else
            max = a;

        System.out.println(text + max);

//      Task_13
//      Чётные и нечётные цифры
//      Ввести с клавиатуры положительное число. Определить, сколько в введенном числе четных цифр, а сколько нечетных.
        int number = Integer.parseInt(reader.readLine());
        while (number != 0) {
            if (number % 2 == 0) {
                number = number / 10;
                even += 1;
            }
            else{
                number = number / 10;
                odd += 1;
            }
        }
        System.out.println("Even: " + even + " Odd: " + odd);

//        Task_14
//        Найти максимальное число в массиве
        int[] array = getArray();
        int maxArray = max(array);
        System.out.println(maxArray);
    }

    public static int[] getArray() throws IOException {
        return new int[]{1,4,2,54,5,10};
    }

    public static int max(int[] array) {
        int maximalElemnet = 01;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] <= array[j])
                    maximalElemnet = array[j];
                else
                    maximalElemnet = array[i];
            }
        }
        return maximalElemnet;
    }


    public static void checkSeason(int month) {
        switch (month){
            case 1 :
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Літо");
                break;
            case 7:
                System.out.println("Літо");
                break;
            case 8:
                System.out.println("Літо");
                break;
            case 9:
                System.out.println("Осінь");
                break;
            case 10:
                System.out.println("Осінь");
                break;
            case 11:
                System.out.println("Осінь");
                break;
            case 12:
                System.out.println("Зима");
                break;
        }
    }
    
    public static void checkSeasonByIf(int numMonth){
        if (numMonth == 12 || numMonth == 1 || numMonth == 2) {
            System.out.println("Winter");
        } else if (numMonth == 3 || numMonth == 4 || numMonth == 5) {
            System.out.println("Spring");
        } else if (numMonth == 6 || numMonth == 7 || numMonth == 8) {
            System.out.println("Summer");
        } else if (numMonth == 9 || numMonth == 10 || numMonth == 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Unknown time of the year");
        }
    }

    public static String multiplicationTable (int number){
        String result = "";
        for (int i = 1; i <= 10; i++) {result += i*number + " ";}
        return result;
    }

    public static int convertToSeconds(int hour){return hour*60*60;}

    public static int min(int a, int b){
        if(a <= b)
            return  a;
        else
            return b;
    }

    public static class Dog{
        private String name;
        private int    age;

        public String getName() { return name; }

        public int getAge() { return age; }

        public void setName(String name) { this.name = name; }

        public void setAge(int age) { this.age = age; }
    }

    public static class Human {
        private String name;
        private int    age;
        private int    weight;
        private int    strength;
        public void setName(String name) { this.name = name; }
    }

    public static class Apple {
        public static int applesPrice = 0;

        public static void addPrice(int applesPrice) { Apple.applesPrice += applesPrice;}
    }

    public static class Man{ public Woman wife;}

    public static class Woman{ public Man husband;}
}
