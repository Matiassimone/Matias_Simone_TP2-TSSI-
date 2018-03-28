package com.company;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author  SIM
 * */

public class Temporizador {


    private Temporizador (){

    }



    private  Timer timer ;
    private int segundos = 0;

    private static Temporizador instance;



    public static  Temporizador getInstance() {

        if (instance == null) {

            instance = new Temporizador();
        }

        return instance;
    }

    class Contador extends TimerTask {

        public void run() {

            segundos++;
            System.out.println(getTiempo());
        }
    }

    public void contar () {

        this.segundos = 0;
        timer = new Timer();
        timer.schedule(new Contador(), 0, 1000);
    }

    public void detener () {

        timer.cancel();
    }

    public void reiniciar () {

        this.segundos = 0;
    }

    public String getTiempo () {

        String fullHour = "";

        int horas = (this.segundos / 3600);
        int minutos = ((this.segundos - (horas * 3600)) / 60);
        int segundos = (this.segundos - (horas * 3600) - (minutos * 60));

        fullHour += (horas > 9) ? ":" + horas : "0" + horas;
        fullHour += (minutos > 9) ? ":" + minutos : ":0" + minutos;
        fullHour += (segundos > 9) ? ":" + segundos : ":0" + segundos;

        return fullHour;
    }

    public int getSegundos () {

        return this.segundos;
    }
}