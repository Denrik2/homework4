public class Main {
    public static void main(String[] args) {
        //Задания 1.
        int age = 16;
        System.out.println("Задание №1");
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершенонолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия," +
                    " нужно немного подождать");
        }

        //Задание 2.
        int temperature = 5;
        System.out.println("Задание №2");
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку") ;
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        //Задание 3.
        int speed = 64;
        System.out.println("Задание №3");
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("если скорость " + speed + ", то можно ездить спокойно");
        }
    }
}