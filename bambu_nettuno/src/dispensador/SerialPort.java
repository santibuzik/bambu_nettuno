/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispensador;

import giovynet.serial.Baud;
import giovynet.serial.Com;
import giovynet.serial.Parameters;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Notebook
 */
public class SerialPort {

    public static void entregarFichas() {
        try {
            Parameters settings = new Parameters();
//definición del puerto que se va a utilizar
            settings.setPort("COM3");
//definición de la velocidad de impresión, se debe tener en cuenta dicho argumento en las especificacion de velocidad del dispositivo
            settings.setBaudRate(Baud._9600);
            settings.setMinDelayWrite(10);
//asignamos los parametros al objeto com1
            Com com1 = new Com(settings);
//envio de cadena de caracteres
            com1.sendString("A");
            TimeUnit.SECONDS.sleep(1);//inicio de envio de secuencias de escape ESC/POS
            com1.sendString("B");
            char[] data1 = {27, 'a', 2};
            com1.sendArrayChar(data1);
// fin de envio de secuencias de escape ESC/POS
            com1.close();
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }
    }
    
    
}
