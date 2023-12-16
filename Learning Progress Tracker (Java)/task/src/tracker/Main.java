package tracker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Learning Progress Tracker");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while(!input.equals("exit")){
            if(input.isBlank() || input.isEmpty() || input == null){
                System.out.println("No input.");
            }else{
                System.out.println("Error: unknown command!");
            }
            input = sc.next();
        }
        System.out.println("Bye!");
    }
}
