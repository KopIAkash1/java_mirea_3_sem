import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task4();
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
        System.out.println("Все готово!");
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
        int size, elem = 0, count = 0, max = 0, min = 0, sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        size = scan.nextInt();
        int[] mass = new int[size];
        do{
            System.out.print("Элемент под номером " + elem + " - ");
            mass[elem] = scan.nextInt();
            sum += mass[elem];
            if(elem == 0){
                max = mass[elem];
                min = mass[elem];
            } else{
                if(max < mass[elem]){
                    max = mass[elem];
                }
                if(min > mass[elem]){
                    min = mass[elem];
                }
            }
            elem++;
        }while(elem <= size - 1);
        System.out.println("Результат при использованни цикла do-while:\n Сумма - " + sum + "\n Минимальное - " + min + "\n Максимальное - " + max);
        max = 0; sum = 0; min = 0; elem = 0;
        while(elem <= size - 1){
            System.out.print("Элемент под номером " + elem + " - ");
            mass[elem] = scan.nextInt();
            sum += mass[elem];
            if(elem == 0){
                max = mass[elem];
                min = mass[elem];
            } else{
                if(max < mass[elem]){
                    max = mass[elem];
                }
                if(min > mass[elem]){
                    min = mass[elem];
                }
            }
            elem++;
        }
        System.out.println("Результат при использованни цикла while:\n Сумма - " + sum + "\n Минимальное - " + min + "\n Максимальное - " + max);
    }
}