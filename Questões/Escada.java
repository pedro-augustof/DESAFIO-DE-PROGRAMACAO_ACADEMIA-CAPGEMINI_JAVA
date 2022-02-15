/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author pedro
 */
public class Escada {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n, a, i, j, au;

        System.out.printf("n=");
        n = input.nextInt();

        if (n <= 8 && n >= 1)
        {
            a = n;

            for (i = 0; i < n; i++)
            {
                au = a - i - 1;

                for (j = 0; j < au; j++)
                {
                    System.out.printf(" ");
                }

                for (j = au; j < n; j++)
                {
                    System.out.printf("*");
                }
                System.out.printf("\n");
            }
        }
    }
}