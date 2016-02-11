package trianguloiso;

import java.util.Scanner;

public class TrianguloIso {

    public static int m, n, a, b, c, p = 0;

    public static void main(String[] args) {

        Scanner ac = new Scanner(System.in);
     
        do {
            System.out.println("Dame m: ");
            m = ac.nextInt();
        } while (m < 1 || m > 1000000);

        do {
            System.out.println("Dame n: ");
            n = ac.nextInt();
        } while (n < 1 || n > 1000000);
     
        
    if(m<n){ 
     for (a = m; a <= n; a++) { //este va aumentando a

            for (b = a; b <= n; b++) {//este va aumentando b

                for (c = b; c <= n; c++) { //este aumenta c

                if((a+b>c) && (a+c>b) && (c+b>a)){    
                    if (a == b && c != a && c != b) {
                        p++;
                    } else if (a == c && b != a && b != c) {
                        p++;
                    } else if (c == b && a != b && a != c) {
                        p++; //este cuenta las ternas triangulares que tiene    
                    }
                }
                }

            }
        }
    }else{
        System.out.println("m tiene que ser menor que n");
    }
     
     
        System.out.println("Ternas triangulares: " + p);

    }

}
