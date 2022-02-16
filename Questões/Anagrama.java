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
public class Anagrama {
    public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        int i, j, qtd, aux = 0;
        char ci, cj;

        String wd = input.nextLine().toLowerCase();
        qtd = wd.length();
        
        for (i = 0; i < qtd; i++) {
            ci = wd.charAt(i);

            for (j = i + 1; j < qtd; j++) {
                cj = wd.charAt(j);

                if (ci == cj) {
                    if (j - i > 1) {
                        aux += 2;
                    } else {
                        aux +=1;
                    }
                }
            }
        }

        System.out.println(aux);
    }
}
