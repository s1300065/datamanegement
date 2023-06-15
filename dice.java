import java.util.*;
class dice{
    public static void main(String[] args){
        System.out.println("Rolling dice...");
        Random rand = new Random();
        int num1 = rand.nextInt(7) + 1;
        int num2 = rand.nextInt(7) + 1;
        int sum = 0;
        sum = num1 + num2;
        System.out.println("Die 1: "+ num1);
        System.out.println("Die 2: "+ num2);
        System.out.println("Total value: "+ sum);
    }
}
