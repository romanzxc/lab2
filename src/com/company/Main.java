package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        task28();
    }
    private static void task28() {
        /*Дана последовательность целых чисел а1, а2, ..., an. Выяснить, какое число встречается раньше — положительное
        или отрицательное.*/
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = in.nextInt();
        int[] ar = new int[size];
        System.out.println("Input elements of array: ");

        for(int i = 0; i < size; i++){
            ar[i]= in.nextInt();
            System.out.println(" " + i + " element is " + ar[i]);
        }
            if (ar[0] > 0){
                System.out.println("positive");
        }else{
                System.out.println("negative");
            }
    }
}
class task53 {
    public static void main(String[] args) {
        task53();
    }
    private static void task53(){
        /*Определить, сколько процентов от всего количества элементов последовательности целых чисел составляют нечетные
        элементы.*/
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = in.nextInt();
        int[] ar = new int[size];
        System.out.println("Input elements of array: ");
        int nep = 0;

        for(int i = 0; i < size; i++){
            ar[i]= in.nextInt();
            System.out.println(" " + i + " element is " + ar[i]);
        }

        for(int j = 0; j < size; j++){
            if (ar[j] %2 == 1) {
                nep++;
            }

        }

        System.out.println(nep + "elements are odd");
        int ods = nep * 100 / size ;
        System.out.println(ods + "%");

    }
}
class task78 {
    public static void main(String[] args) {
        task78();
    }

    private static void task78() {
        /*Дана непустая и упорядоченная по возрастанию последовательность целых чисел, оканчивающаяся числом 10 000.
         Определить порядковый номер первого числа, большего заданного n. Если таких чисел в последовательности нет,
         то на экран должно быть выведено соответствующее сообщение.
         */
        int nums[] = {5000, 6000, 7000, 8000, 9000, 10000};
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 0; i < 6; i++){
            if(n < nums[i]){
                System.out.println(nums[i] + " is bigger than n and it`s sequence number is " + i);
                break;
            }else{
                System.out.println(nums[i] + " isn`t bigger than n");
            }
        }
    }
}
class task103 {
    public static void main(String[] args) {
        task103();
    }

    private static void task103(){
        /*Удалить элемент массива целых чисел, который делится на 5 и 8. Если таких элементов нет, выдать сообщение
        «элементы для удаления не найдены», иначе удалить последний из найденных.*/
        int[] array = new int[30];
        Random rand = new Random();

        for(int i = 0; i < array.length;i++)
        {
            array[i] = rand.nextInt(100);
            System.out.print(array[i]+" ");
        }
        System.out.println("");

        int delElementPos = -1;
        for(int i = 0; i < array.length;i++)
        {
            if(array[i]!=0)
                if(array[i] % 5 == 0 && array[i] % 8 == 0)
                {
                    delElementPos = i;
                }
        }

        if(delElementPos != -1)
        {
            int tmp = 0;
            array[delElementPos] = 0;
            for(int i = delElementPos+1; i < array.length;i++)
            {
                tmp = array[i];
                array[i] = array[i-1];
                array[i-1] = tmp;
            }
            for(int item:array)
            {
                System.out.print(item+" ");
            }
        } else
        {
            System.out.println("There is no element to delete");
        }
    }
}
class task128 {
    public static void main(String[] args) {
        task128();
    }

    private static void task128(){
        /*Дан массив вещественных чисел. Среди них есть равные. Найти его первый максимальный элемент и заменить
         его нулем.*/

        int[] array = new int[]{10,10,5,20,20,3,4};
        int max = array[0];
        int maxPoint = -1;
        for (int item: array)
        {
            System.out.print(item+" ");
        }
        System.out.println("");
        for (int i = 0;i < array.length;i++)
        {
            if(array[i] > max)
            {
                max = array[i];
                maxPoint = i;
            }
        }
        array[maxPoint] = 0;
        for (int item: array)
        {
            System.out.print(item+" ");
        }
        System.out.println("");

        System.out.println("Max element is: " + max);
    }
    }
