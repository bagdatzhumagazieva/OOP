package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner cs=new Scanner(System.in);
        int a=cs.nextInt();
        int b=cs.nextInt();

        System.out.print(Math.max(a,b));
    }
}
