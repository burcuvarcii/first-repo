import java.util.ArrayList;
import java.util.Scanner;

public class SingleArray {
    public static void main(String[] args) {
    int[] numbers ={2,3,5,9,7,51,12,56,32,2,4,6,8,47,120,456,421};
    int[] singles = teksayilarigetir(numbers);

    System.out.println("Odd numbers : ");
    for(int number : singles){
        System.out.println(number+" ");

    }
    }
    public static int[]  teksayilarigetir(int[] dizi){
        ArrayList<Integer>list=new ArrayList<>();
        for(int number : dizi){
            if(number % 2 == 1){
                list.add(number);

            }
        }
    
    int[] sonuc =new int [list.size()];
    for(int i =0;i<list.size();i++){
        sonuc[i]=list.get(i);
    }
    return sonuc;
}
}
