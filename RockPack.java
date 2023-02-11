import java.util.Random;
import java.util.Scanner;

public class RockPack {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] name = {"not","Rock","Paper","Scissor"};
        Random rd = new Random();


        while (true) {
            int value = rd.nextInt(1,4);
            System.out.println("Enter choice 1. for Rock 2. for Paper 3. for Scissor");
            int user = sc.nextInt();
            if (user > 0 && user < 4) {
                if (user == value) {
                    System.out.println("Match is Draw");
                } else if ((user == 1 && value == 2) || (user == 2 && value == 3) || (user == 3 && value == 1)) {
                    System.out.println("You loss");
                } else {
                    System.out.println("You win");
                }
                System.out.println("you enter a " + name[user]);
                System.out.println("Opponent enter a " + name[value]);

                System.out.println("Enter Y for exit and Any key for continue:");
                String n = sc.next();
                if (n.equals("y")) {
                    break;
                }
            }
            else
                System.out.println("Enter valid choice: ");
        }


    }
}

