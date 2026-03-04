
import java.util.Scanner;

public class SalaryCalculation {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Ahmet's wage: ");
        double wage1=scanner.nextDouble();

        System.out.print("Enter Hasan's wage : ");
        double wage2=scanner.nextDouble();
         
        System.out.print("How many month's salary do you want to know? ");
        int month=scanner.nextInt();
       
        for(int i=1; i<=month; i++){
         if(i % 2 == 0){
            wage1+=wage1 * 5.5 / 100;
            System.out.printf("%d. Month-Ahmet's wage: %.2f TL(%%5.5 increase)\n",i,wage1);
         }else{
            wage1-=wage1*2.5 /100;
            System.out.printf("%d. Month-Ahmet's wage: %.2f TL (%%2.5 decrease)\n",i,wage1);
         }
        }
        for(int i =1;i<=month;i++){
            wage2+=wage2*3.5 / 100;
            System.out.printf("%d. Month-Hasan's wage: %.2f TL(%%3.5 increase)\n",i,wage2);
        }
    }
}