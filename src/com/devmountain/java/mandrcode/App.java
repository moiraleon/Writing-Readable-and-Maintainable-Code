package com.devmountain.java.mandrcode;

public class App {

    public static void main (String[]args){
        Pizza pizza= new Pizza.Builder(12)
                .cheese(true)
                .ham(true)
                .build();

        //deliver pizza
        //this is chaining of methds using the builder pattern in the pizza class
    }
}
