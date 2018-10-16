package zad_3;

import java.util.Scanner;

public class Strong {

    public Strong() {
        System.out.println("===== Zad.3 =====");
        computeStrongIteration(getStrongBaseFromUser());

        int base = getStrongBaseFromUser();
        computeStrongRecurrence(base,0);

    }

    public Strong(int base){
        System.out.println("===== Zad.3 =====");
        computeStrongIteration(base);
        computeStrongRecurrence(base,0);
    }

    public int getStrongBaseFromUser(){
        Scanner scanner = new Scanner(System.in);
        int strongBase = scanner.nextInt();

        return strongBase;
    }

    public long computeStrongIteration(int base){
        long strong = 0;
        for (int i = 0;i <base; i++){
            if(i==0)
                strong = base;
            else
                strong = strong * (base -i);
        }
        System.out.println("Odp. 3: "+ "wynik dzialania iteracyjnego: " + strong);
        return strong;
    }

    public long computeStrongRecurrence (int base, long strong){

        if (base == 0) {
            System.out.println("Odp. 3: "+ "wynik dzialania rekurencyjnego: " + strong);
            return strong;
        }
        if (strong == 0)
            strong = base;
        else
            strong = strong * base;

        return computeStrongRecurrence(base -1,strong);
    }

}
