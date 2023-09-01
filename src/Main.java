import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task6();
    }


    private static void task3(){
        int sum = 0, al, size, num = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        size = scan.nextInt();
        int[] mass = new int[size];
        System.out.println("Введите значения массива:");
        for(int i = 0; i < size;i++){
            System.out.print("Элемент под номером " + num + " - "); num++;
            mass[i] = scan.nextInt();
        }
        for(int i : mass){
            sum += i;
        }
        al = sum / size;
        System.out.printf("Сумма: " + sum + " Среднее арифметическое: " + al);;
    }
    private static void task31(){
        int sum = 0, al;
        int[] mass = {0,1,2,3,4,5,6,7,8,9};
        for(int i : mass){
            sum += i;
        }
        al = sum / mass.length;
        System.out.printf("Сумма: " + sum + " Среднее арифметическое: " + al);;
    }
    private static void task4(){
        int size, elem = 0, min, max, sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: "); size = scan.nextInt();
        int[] mass = new int[size];
        while(elem < size){ // ЦИКЛ ЗАПИСИ ЧИСЕЛ
            System.out.print("Введите значение элемента под номером " + (elem+1) + " - ");
            mass[elem] = scan.nextInt();
            elem++;
        }
        elem = 0;
        min = mass[0];
        max = mass[0];
        while(elem < size){
            sum += mass[elem];
            if(min > mass[elem]){min = mass[elem];}
            if(max < mass[elem]){max = mass[elem];}
            elem++;
        }
        System.out.println("Цикл WHILE:\n Сумма - " + sum +"\n Минимальное число - " + min + "\n Максимальное число - " + max);
        sum = 0; elem = 0;
        do{
            sum += mass[elem];
            if(min > mass[elem]){min = mass[elem];}
            if(max < mass[elem]){max = mass[elem];}
            elem++;
        }while(elem < size);
        System.out.println("Цикл DO-WHILE:\n Сумма - " + sum +"\n Минимальное число - " + min + "\n Максимальное число - " + max);
    }
    private static void task5(String[] args){
        for(String str : args){
            System.out.print(str + " ");
        }
    }
    private static void task6(){
        float num;
        for(int i = 0; i < 10; i++){
            System.out.printf("%f%n", (float) 1 / (i + 1));
        }
    }
}