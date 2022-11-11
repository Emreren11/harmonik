import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        int n;

        System.out.print("Bir sayı giriniz: ");
        n=inp.nextInt();
        double result=0;
        for (double i=1; i<=n; i++)
        {
            result+=(1/i);
        }

        System.out.println(n+" sayısının harmonik sonucu: "+result);

    }
}