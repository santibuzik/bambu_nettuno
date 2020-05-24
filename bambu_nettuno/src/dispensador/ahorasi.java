/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispensador;

import gnu.io.CommPortIdentifier;
import gnu.io.PortInUseException;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import gnu.io.UnsupportedCommOperationException;
import static java.awt.image.ImageObserver.ERROR;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.TooManyListenersException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Notebook
 */
public class ahorasi implements SerialPortEventListener {

	private static OutputStream salida = null;
	// private static InputStream entrada = null;
	static SerialPort puertoSerial;
	static SerialPortEventListener listener;
	private static final String puerto = "COM3";
	private static final int tiempo_espera = 2000; // milisegundos
	private static final int data_rate = 9600; // igual que en arduino
	private String[] inputLine;
	static private BufferedReader Input = null;
	String cont = null;
	static int Output1;
	private SerialPort serialPort = null;
	String fichas = null;
	InputStream inputStream;

	public void inicializarConexion() {
		CommPortIdentifier puertoID = null;
		Enumeration puertoEnum = CommPortIdentifier.getPortIdentifiers();
		while (puertoEnum.hasMoreElements()) {
			CommPortIdentifier actualPuertoID = (CommPortIdentifier) puertoEnum.nextElement();
			if (puerto.equals(actualPuertoID.getName())) {
				puertoID = actualPuertoID;
				break;
			}
		}
		if (puertoID == null) {
			mostrarError("No hay conexión");
			// System.exit(ERROR);
		}
		try {
			puertoSerial = (SerialPort) puertoID.open(puertoID.getClass().getName(), tiempo_espera);
			puertoSerial.setSerialPortParams(data_rate, SerialPort.DATABITS_8, SerialPort.STOPBITS_1,
					SerialPort.PARITY_NONE);
			salida = puertoSerial.getOutputStream();
			Input = new BufferedReader(new InputStreamReader(puertoSerial.getInputStream()));
			initListener();
		} catch (Exception e) {
			mostrarError(e.getMessage());
			// System.exit(ERROR);
		}
	}

	public void initListener() {
		// SerialPort serialPort;
		try {
			puertoSerial.addEventListener(this);
			puertoSerial.notifyOnDataAvailable(true);
		} catch (TooManyListenersException e) {
			// logText = "Too many listeners. (" + e.toString() + ")";
			// window.txtLog.setForeground(Color.red);
			// window.txtLog.append(logText + "n");
			System.out.println("error");
		}
	}

	public void enviarDatos(String datos, String pfichas) {
		try {
			fichas = pfichas;
			salida.write(datos.getBytes());

		} catch (Exception e) {
			// mostrarError ("Error");
			// System.exit(ERROR);
			System.out.println(e.getMessage());
		}
	}

	public static void mostrarError(String mensaje) {
		// JOptionPane.showConfirmDialog(null, mensaje, "Error",
		// JOptionPane.ERROR_MESSAGE);
	}

	@Override
	public synchronized void serialEvent(SerialPortEvent oEvent) {
		
/*		try {
			while (inputStream.available() > 0 && fichas != cont) {
				int numBytes = inputStream.read(readBuffer);
				System.out.println(numBytes);
				// enviarDatos("B", fichas);
				System.out.println("sip");
			}
			System.out.print(new String(readBuffer));
		} catch (IOException e) {
		}*/

		System.out.println("Ouput1: " + Output1 + " valor recibido: " + cont);
		//if (oEvent.getEventType() == SerialPortEvent.DATA_AVAILABLE) {
			try {
				while (inputStream.available()>0 && inputStream.read() != 5) {
				boolean ok = true;
				String inputLine = Input.readLine();
				System.out.println(inputLine);
				while (ok = true) {
					if (inputLine.contains("0" + fichas)) {
						enviarDatos("B", fichas);
						System.out.println("sip");
						ok = false;
					}
				}
				System.out.println(inputLine);
				}
				

				// por enquanto só mostra o dado na saída.. depois, vamos mandar pro Google
				// App Engine
			} catch (IOException e) {
				System.err.println(e.toString());
			}
			switch (oEvent.getEventType()) {
			case SerialPortEvent.BI:
			case SerialPortEvent.OE:
			case SerialPortEvent.FE:
			case SerialPortEvent.PE:
			case SerialPortEvent.CD:
			case SerialPortEvent.CTS:
			case SerialPortEvent.DSR:
			case SerialPortEvent.RI:
			case SerialPortEvent.OUTPUT_BUFFER_EMPTY:
				break;
			case SerialPortEvent.DATA_AVAILABLE:
				byte[] readBuffer = new byte[20];

				try {
					while (inputStream.available() > 0 ) {
						int numBytes = inputStream.read(readBuffer);
						System.out.println(numBytes);
						// enviarDatos("B", fichas);
						System.out.println("sip");
					}
					System.out.print(new String(readBuffer));
				} catch (IOException e) {
				}
				break;
			}}
		//}
	

	private static void RecibirDatos() throws IOException {
		Output1 = Integer.parseInt(Input.readLine());
		// cont = Integer.parseInt(Input.readLine());
		// System.out.println("Ouput1: " + Output1 + " valor recibido: " + cont);
	}

}
