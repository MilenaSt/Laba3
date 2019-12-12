package Laba3;

public class proverka {
    public static void main(String[] args) {
        //выводим количество аргументов заданных в командной строке
        System.out.println("Всего аргументов в командной строке: "
                + args.length);
        //обходим в цикле все элементы массивы args
        for (int i = 0; i < args.length; i++) {
            //и выводим их на консоль
            System.out.println("Hello " + args[i] + "!");
        }
    }
}