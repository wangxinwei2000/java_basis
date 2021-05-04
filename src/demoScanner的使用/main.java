package demoScanner的使用;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input a number");
        int number = sc.nextInt();
        Judge_Prime(number);
    }

    public static void Judge_Prime(int number){
        if(number<=2){
            System.out.println("number is a Prime");
            return;
        }
        else {
            int i=2;
            while (i<=number){

                if(i==number){
                    System.out.println("number is a Prime");
                }
                if(number%2==0){
                    System.out.println("number is not a Prime");
                    break;
                }
            }
        }
    }
}
