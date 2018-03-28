package com.company;

import java.util.HashMap;
import javafx.beans.Observable;
import java.util.Observer;

/**
 * @author  SIM
 * */


public class Mecanico implements Observer {


    public Mecanico () {

    }



    private double aguaAceptable;
    private double aceiteAceptable;
    private double precionNeumaticosAceptable;



    public double getAguaAceptable() {
        return aguaAceptable;
    }

    public void setAguaAceptable(double aguaAceptable) {
        this.aguaAceptable = aguaAceptable;
    }

    public double getAceiteAceptable() {
        return aceiteAceptable;
    }

    public void setAceiteAceptable(double aceiteAceptable) {
        this.aceiteAceptable = aceiteAceptable;
    }

    public double getPrecionNeumaticosAceptable() {
        return precionNeumaticosAceptable;
    }

    public void setPrecionNeumaticosAceptable(double precionNeumaticosAceptable) {
        this.precionNeumaticosAceptable = precionNeumaticosAceptable;
    }


    @Override
    public void update(java.util.Observable o, Object arg) {

        HashMap<String, Double> nuevosValores = (HashMap<String, Double>) arg;

        if ((this.aguaAceptable > nuevosValores.get("Agua")) || (this.aceiteAceptable > nuevosValores.get("Aceite")) ||
                (this.precionNeumaticosAceptable > nuevosValores.get("PrecionNeumaticos"))) {


            if (this.aguaAceptable > nuevosValores.get("Agua")) {

                System.out.println("\n\nMECANICO:\tTenes el nivel bajo de agua..");
            }

            if (this.aceiteAceptable > nuevosValores.get("Aceite")) {

                System.out.println("\n\nMECANICO:\tTenes el nivel bajo de aceitee..");
            }

            if (this.precionNeumaticosAceptable > nuevosValores.get("PrecionNeumaticos")) {

                System.out.println("\n\nMECANICO:\tTenes poca precion en los neumaticos..");
            }


        }else{

            System.out.println("\n\nMECANICO:\tTenes todo en perfectas condiciones..");

        }
    }


}
