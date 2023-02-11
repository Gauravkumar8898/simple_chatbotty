import java.util.Scanner;

public class VendingMachine {
    public static int Calculate(int[] coins, int change)
    {
        int[] counts = new int[change + 1];
        counts[0] = 0;

        for(int i = 1; i <= change; i++)
        {
            int count = Integer.MAX_VALUE;
            for(int coin : coins)
            {
                int total = i - coin;
                if(total >= 0 && count > counts[total])
                {
                    count = counts[total];
                }
            }
            counts[i] = (count < Integer.MAX_VALUE) ? count + 1 : Integer.MAX_VALUE;
        }
        return counts[change];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of type of coin  you want enter in machine ");
        int size = sc.nextInt();
        int[] coin = new int[size];
        System.out.println("Enter the type of coin in machine");
        for(int i=0;i<size;i++){
            coin[i] = sc.nextInt();
        }
        System.out.println("Enter money for change");
        int change = sc.nextInt();
        System.out.println("Minimum coin Required "+Calculate(coin,change));
    }
}
