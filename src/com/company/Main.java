package com.company;

/**
 * @author  SIM
 * */

public class Main {


    public static void main(String[] args) {


        Auto autoTest = Auto.getInstance();

        autoTest.setNivelAceite(5);
        autoTest.setNivelAgua(10);
        autoTest.setPrecionNeumaticos(23);

        autoTest.setDesgasteAceite(0.1);
        autoTest.setDesgasteAgua(0.5);
        autoTest.setDesgastePrecionNeumaticos(0.05);


        Mecanico observerMecanico = new Mecanico();

        observerMecanico.setAceiteAceptable(1);
        observerMecanico.setAguaAceptable(2);
        observerMecanico.setPrecionNeumaticosAceptable(21.5);

        autoTest.addObserver(observerMecanico);


        new GUI();

    }
}
