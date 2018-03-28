package com.company;

import java.util.HashMap;
import java.util.Observable;

/**
 * @author  SIM
 * */

public class Auto extends Observable {


    private void Auto () {

    }



    private static Auto instance;


    private double nivelAceite;
    private double nivelAgua;
    private double precionNeumaticos;

    private double desgasteAceite;
    private double desgasteAgua;
    private double desgastePrecionNeumaticos;

    private boolean encendido = false;
    private int kilometros = 0;



    public static Auto getInstance () {

        if (instance == null) {

            instance = new Auto();
        }

        return instance;
    }




    public double getNivelAceite() {
        return this.nivelAceite;
    }

    public void setNivelAceite(double nivelAceite) {
        this.nivelAceite = nivelAceite;
    }

    public double getNivelAgua() {
        return this.nivelAgua;
    }

    public void setNivelAgua(double nivelAgua) {
        this.nivelAgua = nivelAgua;
    }

    public double getPrecionNeumaticos() {
        return this.precionNeumaticos;
    }

    public void setPrecionNeumaticos(double precionNeumaticos) {
        this.precionNeumaticos = precionNeumaticos;
    }

    public int getKilometros() {
        return this.kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    public double getDesgasteAceite() {
        return desgasteAceite;
    }

    public void setDesgasteAceite(double desgasteAceite) {
        this.desgasteAceite = desgasteAceite;
    }

    public double getDesgasteAgua() {
        return desgasteAgua;
    }

    public void setDesgasteAgua(double desgasteAgua) {
        this.desgasteAgua = desgasteAgua;
    }

    public double getDesgastePrecionNeumaticos() {
        return desgastePrecionNeumaticos;
    }

    public void setDesgastePrecionNeumaticos(double desgastePrecionNeumaticos) {
        this.desgastePrecionNeumaticos = desgastePrecionNeumaticos;
    }





    public void encender () {

        if (Temporizador.getInstance().getSegundos() == 0) {

            System.out.println("Tiempo transcurrido encendido :");
            Temporizador.getInstance().contar();

            this.encendido = true;
        }
    }

    public void apagar() {

        int seconds = 0;

        if (Temporizador.getInstance().getSegundos() != 0) {

            this.encendido = false;
            Temporizador.getInstance().detener();

            seconds = Temporizador.getInstance().getSegundos();

            this.nivelAgua = nivelAgua - (seconds * this.desgasteAgua);
            this.nivelAceite = nivelAceite - (seconds * this.desgasteAceite);
            this.precionNeumaticos = precionNeumaticos - (seconds * this.desgastePrecionNeumaticos);

            HashMap<String,Double> nuevosValores = new HashMap<String,Double>();
            nuevosValores.put("Agua", this.nivelAgua);
            nuevosValores.put("Aceite", this.nivelAceite);
            nuevosValores.put("PrecionNeumaticos", this.precionNeumaticos);

            System.out.println("\n\nValores antes de la revicion del Mecanico.. \n\n");
            System.out.println("\tAGUA = " + this.nivelAgua );
            System.out.println("\tACEITE = " + this.nivelAceite );
            System.out.println("\tNEUMATICOS = " + this.precionNeumaticos );

            setChanged();
            notifyObservers(nuevosValores);

            Temporizador.getInstance().reiniciar();
        }
    }

    public boolean getEncendido() {
        return this.encendido;
    }


}
