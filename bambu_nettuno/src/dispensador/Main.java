/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispensador;

/**
 *
 * @author Notebook
 */
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JSlider;
//import javax.extensions.comm.*;
//import jSerialComm-2.5.3.;
import com.fazecast.jSerialComm.*;
import com.fazecast.jSerialComm.SerialPort;
import java.io.IOException;
///import org.apache.commons.lang3.SystemUtils;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

public class Main {

    public static String[] getPortNames() {
        SerialPort[] ports = SerialPort.getCommPorts();
        String[] result = new String[ports.length];
        for (int i = 0; i < ports.length; i++) {
            result[i] = ports[i].getSystemPortName();
        }
        return result;

    }

    public static void main(String[] args) throws IOException, InterruptedException {
        SerialPort[] ports = SerialPort.getCommPorts();
        String[] result = new String[ports.length];
        for (int i = 0; i < ports.length; i++) {
            result[i] = ports[i].getSystemPortName();
        }
        SerialPort sp = SerialPort.getCommPort("USBSER000"); // device name TODO: must be changed
        sp.openPort(0);
        sp.setComPortParameters(9600, 8, 1, 0); // default connection settings for Arduino
        sp.setComPortTimeouts(SerialPort.TIMEOUT_WRITE_BLOCKING, 0, 0); // block until bytes can be written

        if (sp.openPort()) {
            System.out.println("Port is open :)");
        } else {
            System.out.println("Failed to open port :(");
        }

        for (Integer i = 0;
                i < 5; ++i) {
            sp.getOutputStream().write(i.byteValue());
            sp.getOutputStream().flush();
            System.out.println("Sent number: " + i);
            Thread.sleep(1000);
        }

        if (sp.closePort()) {
            System.out.println("Port is closed :)");
        } else {
            System.out.println("Failed to close port :(");
            return;
        }

    }

    /*public boolean openPort() {
     SerialPort[] ports = SerialPort.getCommPorts();
     if (ports.length == 0) {
     System.out.println("No serial ports available!");
     return false;
     }
     System.out.println("Got {} serial ports available");
     int portToUse = -1;

     for (int i = 0; i < ports.length; i++) {
     SerialPort sp = ports[i];
     logger.debug("\t- {}, {}", sp.getSystemPortName(), sp.getDescriptivePortName());
     if (isSerialPort(sp)) {
     portToUse = i;
     }
     }
     if (portToUse < 0) {
     logger.warn("No relevant serial usb found on this system!");
     return false;
     }
     comPort = ports[portToUse];
     logger.info("Going to use the following port: {}", comPort.getSystemPortName());

     comPort.setFlowControl(SerialPort.FLOW_CONTROL_DISABLED);
     comPort.setComPortParameters(BAUD_RATE, 8,
     SerialPort.ONE_STOP_BIT, SerialPort.NO_PARITY);
     comPort.setComPortTimeouts(
     SerialPort.TIMEOUT_READ_BLOCKING | SerialPort.TIMEOUT_WRITE_BLOCKING,
     TIMEOUT_READ,
     TIMEOUT_WRITE
     );

     logger.debug("Going to open the port...");
     boolean result = comPort.openPort();
     logger.debug("Port opened? {}", result);
     return result;
     }*/

    /*public static void main(String[] args) {
     // create a window with a slider
     JFrame window = new JFrame();
     JSlider slider = new JSlider();
     slider.setMaximum(1023);
     window.add(slider);
     window.pack();
     window.setVisible(true);

     // determine which serial port to use
     SerialComm ports[] = SerialComm.getCommPorts();
     System.out.println("Select a port:");
     int i = 1;
     for (SerialComm port : ports) {
     System.out.println(i++ + ". " + port.getSystemPortName());
     }
     Scanner s = new Scanner(System.in);
     int chosenPort = s.nextInt();

     // open and configure the port
     SerialComm port = ports[chosenPort - 1];
     if (port.openPort()) {
     System.out.println("Successfully opened the port.");
     } else {
     System.out.println("Unable to open the port.");
     return;
     }
     port.setComPortTimeouts(SerialComm.TIMEOUT_READ_SEMI_BLOCKING, 0, 0);

     // enter into an infinite loop that reads from the port and updates the GUI
     Scanner data = new Scanner(port.getInputStream());
     while (data.hasNextLine()) {
     int number = 0;
     try {
     number = Integer.parseInt(data.nextLine());
     } catch (Exception e) {
     }
     slider.setValue(number);
     }
     }*/
}
