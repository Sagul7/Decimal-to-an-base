import java.util.Scanner;

public class DecimaltoAnybase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int base = sc.nextInt();

        System.out.println(decimaltoAnybase(num,base));
    }
    public static int decimaltoAnybase(int num,int base)
    {
        String result ="";
        while(num>0)
        {
            int x=num%base;
            result = x+result;
            num/=base;
        }
        return Integer.parseInt(result);
    }
}
