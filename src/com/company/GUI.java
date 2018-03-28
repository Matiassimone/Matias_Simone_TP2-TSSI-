package com.company;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//import javax.swing.JLabel;
//import javax.swing.JTextField;

/**
 * @author  SIM
 * */

    public class GUI {


        public GUI () {

            iniciarGUI();
        }



        JFrame ventana;
        //JLabel aceite;
        //JLabel agua;
        //JLabel neumaticos;
        //JTextField inputAceite;
        //JTextField inputAgua;
        //JTextField inputNeumaticos;
        JButton botonEncender;
        JButton botonApagar;



        public void iniciarGUI () {

            instanciarGUI();
            configurarGUI();
            añadirAGUI();
            oyentesGUI();

            ventana.setVisible(true);
        }

        private void instanciarGUI () {

            this.ventana = new JFrame("TP Numero 2");
            //this.aceite = new JLabel("Nivel de Aceite");
            //this.agua = new JLabel("Nivel de Agua");
            //this.neumaticos = new JLabel("Precion de Neumaticos");
            //this.inputAceite = new JTextField();
            //this.inputAgua = new JTextField();
            //this.inputNeumaticos = new JTextField();
            this.botonEncender = new JButton("Encender");
            this.botonApagar = new JButton("Apagar");
        }

        private void configurarGUI() {

            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setLayout(new FlowLayout());
        }

        private void añadirAGUI() {

            //ventana.add(aceite);
            //ventana.add(agua);
            //ventana.add(neumaticos);
            //ventana.add(inputAceite);
            //ventana.add(inputAgua);
            //ventana.add(inputNeumaticos);
            ventana.add(botonEncender);
            ventana.add(botonApagar);
            ventana.pack();
        }

        private void oyentesGUI() {

            botonEncender.addActionListener(new ActionListener(){

                public void actionPerformed(ActionEvent e) {

                    Auto instanceAuto = Auto.getInstance();

                   if (instanceAuto.getEncendido()) {

                       mensajePopBoton("El auto ya se encuentra encendido");

                   }else {

                       mensajePopBoton("Has encendido el Auto");
                       instanceAuto.encender();
                   }

                }});


            botonApagar.addActionListener(new ActionListener(){

                public void actionPerformed(ActionEvent e) {

                    Auto instanceAuto = Auto.getInstance();

                    if (!instanceAuto.getEncendido()) {

                        mensajePopBoton("El auto ya se encuentra apagado");

                    }else{

                        instanceAuto.apagar();
                        mensajePopBoton("Has apagado el Auto");
                    }

                }});
        }


        private void mensajePopBoton (String mensaje) {

            JOptionPane.showMessageDialog(null, mensaje);
        }






}
