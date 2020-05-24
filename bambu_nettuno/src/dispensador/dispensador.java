/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispensador;

import java.util.Enumeration;
import javax.comm.CommPortIdentifier;
import javax.comm.PortInUseException;
import javax.comm.SerialPort;
import org.omg.CORBA.TIMEOUT;
import javax.comm.*;
import java.util.HashMap;
import bambu_nettuno.*;
import java.awt.Color;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.TooManyListenersException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Notebook
 */
public class dispensador implements SerialPortEventListener {

    CommPortIdentifier idPuerto = null;
    Enumeration listaPuertos;
    SerialPort puertoSerie = null;
    InputStream entrada;

    public static void listarPuertos() {
        Enumeration listaPuertos = CommPortIdentifier.getPortIdentifiers();
        boolean encontrado = false;
        while (listaPuertos.hasMoreElements() && !encontrado) {
            CommPortIdentifier idPuerto = (CommPortIdentifier) listaPuertos.nextElement();
            if (idPuerto.getPortType() == CommPortIdentifier.PORT_SERIAL) {
                if (idPuerto.getName().equals("COM3")) {
                    encontrado = true;
                } else {
                    System.out.println("Puerto no encontrado");
                }
            }
        }
    }

    public static void abrirPuerto() {
        //SerialPort puertoSerie = null;
        CommPortIdentifier idPuerto = null;
        SerialPort puertoSerie = null;
        try {
            puertoSerie = (SerialPort) idPuerto.open("DescripcionPropietario", 2000);
            try {
                puertoSerie.setSerialPortParams(9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_EVEN);
                puertoSerie.notifyOnDataAvailable(true);
            } catch (UnsupportedCommOperationException e) {
                System.out.println("Error configurando parámetros de configuración");
            }

        } catch (PortInUseException e) {
            System.out.println(e.getMessage());
        }
    }

    public void comunico() throws IOException {

        entrada = puertoSerie.getInputStream();
        String s = null;
        while (entrada.available() > 0) {
            int dato = entrada.read();
            s = s + (char) dato;

        }
    }

    @Override
    public void serialEvent(SerialPortEvent spe) {
        if (spe.getEventType() == SerialPortEvent.DATA_AVAILABLE) {
            try {
                entrada = puertoSerie.getInputStream();
                String s = null;
                while (entrada.available() > 0) {
                    int dato = entrada.read();
                    s = s + (char) dato;
//Tenemos nuevos datos disponibles en el puerto, podemos poner aquí el código que recibe los datos y los procesa.
                }
            } catch (IOException ex) {
                System.out.println("error");
                Logger.getLogger(dispensador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
