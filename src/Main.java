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

        //Задание 4.
        int ageP = 25;
        System.out.println("Задание №4");
        if (ageP >= 2 && ageP <= 6) {
            System.out.println("Если возраст человека равен " + ageP + " то ему нужно ходить в детский сад");
        }
        if (ageP >= 7 && ageP <= 17) {
            System.out.println("Если возраст человека равен " + ageP + " то ему нужно ходить в школу");
        }
        if (ageP >= 18 && ageP <= 24) {
            System.out.println("Если возраст человека равен " + ageP + " то ему нужно ходить в университет");
        }
        if (ageP > 24) {
            System.out.println("Если возраст человека равен " + ageP + " то ему нужно ходить на работу");
        }

        //Задание 5.
        int ageOfTheChild = 16;
        System.out.println("Задание №5");
        if (ageOfTheChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageOfTheChild + " то ему нельзя кататься на атракционе");
        }
        if (ageOfTheChild >= 5 && ageOfTheChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageOfTheChild + " то он может кататься только в " +
                    "сопровождение взрослого");
        }
        if (ageOfTheChild >= 14) {
            System.out.println("Если возраст ребенка равен " + ageOfTheChild + " то он может кататься без " +
                    "сопровождения взрослого");
        }

        //Задание 6.
        int occupiedPlaces = 105;
        System.out.println("Задание №6");
        if (occupiedPlaces < 60) {
            System.out.println("В вагоне осталось " + (60 - occupiedPlaces) + " сидячих мест");
        }
        if (occupiedPlaces >= 60 && occupiedPlaces < 102) {
            System.out.println("В вагоне не осталось свободных сидячих мест, но есть ещё " + (102 - occupiedPlaces) +
                    " стоячих места");
        }
        else {
            System.out.println("В вагоне вообще не осталось свободных мест");
        }
    }
}