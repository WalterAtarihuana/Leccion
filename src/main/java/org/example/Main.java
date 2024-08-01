package org.example;

public class Main {
    public static void main(String []args){

        Pajaro pedro = new Pajaro("Pedro");
        pedro.comer();
        pedro.volar();
        System.out.println(pedro.cantar("Ave"));
    }
}
