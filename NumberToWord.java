import java.util.Scanner;

public class NumberToWord {
    public static final String[] oneDigit=new String[]{" ","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten",
            "Eleven","Twelve","Thirteen","fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty"};
    public static String[] tenMultiple=new String[]{"", "","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
//    String[] tens = new String[]{"Hundred","Thousand"};

    public static String numberToWord(int num){
        if(num<0){
            return "Minus "+ numberToWord(-num);
        }
        //test for git
        if(num<20)
            return oneDigit[num];
        if(num<100)
            return tenMultiple[num/10]+((num%10!=0?" ":"")+oneDigit[num%10]);
        if(num<1000)
            return oneDigit[num/100]+" Hundred"+((num%100!=0)?" ":"")+numberToWord(num%100);
        return numberToWord(num/1000)+" Thousand"+((num%1000!=0)?" ":"")+numberToWord(num%1000);




    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to convert word");
        int number = sc.nextInt();
        if(number>=-99999&&number<=99999){
            System.out.println(numberToWord(number));
        }
        else
            System.out.println("Enter number upto 5 digit");
    }
}
