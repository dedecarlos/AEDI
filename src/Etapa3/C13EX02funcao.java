package Etapa3;

import java.util.Scanner;

public class C13EX02funcao {
    public static double funcao(int x){
        double fx;
        if (x < 4 && x > -4){
          return fx = (5 * x + 3) / Math.sqrt(16 - Math.pow(x, 2.0));
        }
        else if (x == 4){
           return fx = 0;
        }
        else {
           return fx = (5 * x + 3) / Math.sqrt(Math.pow(x, 2.0) - 16);
        }
    }
}
