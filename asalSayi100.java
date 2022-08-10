import java.util.Scanner;

public class asalSayi100 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int sayac = 0;
        for(int sayi=2;sayi<=100;sayi++)
        {
            boolean remind=true;
            for (int i = 2; i < sayi; i++)
            {
                if (sayi % i == 0)
                {
                    remind = false;
                    break;
                }
            }

            if(remind==true)
            {
                System.out.print(sayi+"\n");
                sayac++;
            }
        }
    }
}
