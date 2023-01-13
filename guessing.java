import java.util.Scanner;
import java.util.Random;

public class guessing {
    static Random computer = new Random();
    static int computerNumber = computer.nextInt(1,11);
    static int chance=3;
    public static void guess() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 10");
        int num = scnr.nextInt();
        System.out.println(num);
        if(num==computerNumber){
            System.out.println("You Guess the correct answer :)");
        }else{
            chance--;
            System.out.println("You have " + chance + " chance " +  ":)");
            if(chance==0){return;}
            guess();
            }
        }








    public static void main(String[] args) {
        Scanner scnr=new Scanner(System.in);
        System.out.println("Do you want to play my guessing game? Type y for yes and n for no");
        String OptoPlay = scnr.nextLine();
        if (OptoPlay.equalsIgnoreCase("y")) {
            guess();



        }


    }


}


