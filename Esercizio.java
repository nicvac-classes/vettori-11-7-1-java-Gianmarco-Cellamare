//LEGGERE LE ISTRUZIONI NEL FILE README.md

import random.util.Scanner;
import java.util.Scanner;


class Esercizio {
    public static int EliminaElemento(int[] v, int n, int ie) {
        int i, n2;
    
        n2 = n - 1;
        i = ie;
        while (i <= n - 2) {
            v[i] = v[i + 1];
            i = i + 1;
        }
    
        public static int InserisciVettore(int[] v, int n, int e, int ie) {
            int i, n2;
    
            n2 = n + 1;
            i = n2 - 1;
            e = (3+random(10))*10;
            while (i >= ie + 1) {
                v[i] = v[i - 1];
                i = i - 1;
            }
            v[ie] = e;
            
            return n2;
        }

        public static void azzeraVettore(int[] v, int n) {
            int i;
    
            for (i = 0; i <= n - 1; i++) {
                v[i] = 0;
            }
        }

        public static int rimuoviDuplicatiFunz(int[] v, int n) {
            int i, j;
    
            i = 0;
            while (i <= n - 2) {
                j = i + 1;
                while (j <= n - 1) {
                    if (v[i] == v[j]) {
                        System.out.println("Elimino " + v[j] + " da cella " + j);
                        n = eliminaDaVettoreFast(v, n, j);
                    } else {
                        j = j + 1;
                    }
                }
                i = i + 1;
            }


    public static void main(String args[])
    {
        Scanner in = new Scanner( System.in );
        System.out.println("Inserisci il numerodegli animali chearriveranno al lago");
        N=in.nextline();
        int [] animali = int [N];
        i=0;
        s=0;
        while (i<N-1) {
            s = InserisciElemento(animali,N,i,s);
            VisualizzaVettore(animali,N);
            if (animali[i] > animali [i-1]){
                s = EliminaElemento(animali,N,s);
            }
            s = RimuoviDuplicati(animali,N);
            i++; 
        }

    }
}

