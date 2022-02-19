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
public class Senha {
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int qtd, fal, i, aux, ascii, j;
        String pw, caresp = "!@#$%^&*()-+";
        // int de requisitos
        int ce = 1, n = 1, mai = 1, minu = 1;
        char car, care;
    
        pw = input.nextLine();
        input.close();
        qtd = pw.length();
        
        for (i = 0; i < qtd; i++) {
            car = pw.charAt(i);
            ascii = (int) car;

            if (Character.isDigit(car)) {
                n = 0;
            } else if (65 <= ascii && ascii <= 90) {
                mai = 0;
            } else if (97 <= ascii && ascii <= 122) {
                minu = 0;
            } else {
                for (j = 0; j < 12; j++) {
                    care = caresp.charAt(j);
                    if (car == care) {
                        ce = 0;
                    }
                }
            }
        }

        aux = ce + n + mai + minu;
        fal = 6 - qtd;

        if (aux >= 1 || qtd < 6) {
            if (qtd < 6 && fal < aux) {
                fal = aux;
                System.out.println(fal);
            } else if (qtd < 6 && fal >= aux) {
                System.out.println(fal);
            } else {
                System.out.println(aux);
            }
            
        } else {
            System.out.println("Senha Forte");
        }

    }
}
