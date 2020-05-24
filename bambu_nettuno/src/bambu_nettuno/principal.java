package bambu_nettuno;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.ws.WebServiceClient;

import dispensador.ahorasi;
import org.datacontract.*;
import org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasCierre_400Configuracion;
import org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasTransaccion_400Comportamiento;
import org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasTransaccion_400ConsultaTarjeta;
import org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasTransaccion_400RespuestaCancelarTransaccion;
import org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta;
import org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasTransaccion_400RespuestaConsultarTransaccion;
import org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasTransaccion_400RespuestaPostearConsultaDatosTarjeta;
import org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasTransaccion_400RespuestaPostearTransaccion;
import org.datacontract.schemas._2004._07.TransActV4ConcentradorWS_TransActV4Concentrador.ITarjetasTransaccion_400Transaccion;

import venta.venta;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.jws.WebService;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.rmi.RemoteException;
import java.sql.SQLException;
import org.tempuri.ITarjetasTransaccion_400;

public class principal extends JFrame {

	private JPanel contentPane;
    int resultado;
    int tipo;
    int cantidadFichas;
    static int value1;
    static int value2;
    static String operator;
    int totalapagar;
    ButtonGroup bgroup;
    ButtonGroup buttonGroup;
    int fichas;
    int dinero;
    
    ITarjetasTransaccion_400 WS = new ITarjetasTransaccion_400() {
		
		@Override
		public ITarjetasTransaccion_400RespuestaPostearTransaccion postearTransaccionBatch(
				ITarjetasTransaccion_400Transaccion transaccion, Integer referencia, String descripcion,
				Integer minutosExpira) throws RemoteException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ITarjetasTransaccion_400RespuestaPostearTransaccion postearTransaccion(
				ITarjetasTransaccion_400Transaccion transaccion) throws RemoteException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ITarjetasTransaccion_400RespuestaPostearConsultaDatosTarjeta postearConsultaDatosTarjeta(
				ITarjetasTransaccion_400ConsultaTarjeta consultaTarjeta) throws RemoteException {
			return null;
		}
		
		@Override
		public ITarjetasTransaccion_400RespuestaConsultarTransaccion consultarTransaccion(String tokenNro)
				throws RemoteException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ITarjetasTransaccion_400RespuestaConsultarDatosTarjeta consultarDatosTarjeta(String tokenNro)
				throws RemoteException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Boolean confirmarPosteoTransaccionBatch(String tokenNro) throws RemoteException {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public ITarjetasTransaccion_400RespuestaCancelarTransaccion cancelarTransaccion(String tokenNro)
				throws RemoteException {
			// TODO Auto-generated method stub
			return null;
		}
	};
    
    ITarjetasTransaccion_400Comportamiento tranComportamiento = new ITarjetasTransaccion_400Comportamiento(); 
    ITarjetasCierre_400Configuracion tranConfiguracion = new ITarjetasCierre_400Configuracion();
	ITarjetasTransaccion_400Transaccion transaccion = new ITarjetasTransaccion_400Transaccion();
	ITarjetasTransaccion_400RespuestaPostearTransaccion msjRespuesta = new ITarjetasTransaccion_400RespuestaPostearTransaccion();
    String empHASH;
    String empCod;
    String termCod;
    String monedaPesos = "0858";
    Double facturaNro = 0.0;
    int tarjetaVisa = 2;
    int tarjetaMaster = 1;
    int tarjetaTodas = 0;
	
    ahorasi ahoraSi = new ahorasi();
    venta ventaa = new venta();
    JLabel txtFichasCantidad;
    JLabel txtManualCantidad;
    JPanel panel;
    JButton btnMasFichas;
    JButton btnMenosFichas;
    JButton btnMenosTicket;
    JButton btnMasTicket;
    JLabel txtResult;
    JLabel btnpagar;
    JLabel btnborrar;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal frame = new principal();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1305, 770);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
       
		ahoraSi.inicializarConexion();
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		btnMasFichas = new JButton("");
		btnMasFichas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		        tipo = 1;
		        if (txtFichasCantidad.getText().isEmpty() || txtFichasCantidad.getText().equals("0")) {
		            txtFichasCantidad.setText("1");
		            cantidadFichas = 1;
		        } else {
		            fichas = Integer.parseInt(txtFichasCantidad.getText());
		            fichas++;
		            txtFichasCantidad.setText(String.valueOf(fichas));
		            cantidadFichas = 1;
		        }
		        totalapagar = Integer.parseInt(txtFichasCantidad.getText()) * 50;
		        txtResult.setText("$ " + String.valueOf(totalapagar));
		        btnMasFichas.setVisible(true);
		        btnMenosFichas.setVisible(true);
		        btnMasTicket.setVisible(false);
		        btnMenosTicket.setVisible(false);
			}
			
		});
		btnMasFichas.setBackground(new Color(255, 255, 255));
		btnMasFichas.setIcon(new ImageIcon(principal.class.getResource("/bambu_nettuno/mais.png")));
		btnMasFichas.setBounds(418, 159, 97, 97);
		btnMasFichas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel.setLayout(null);
		panel.add(btnMasFichas);
		
		btnMenosFichas = new JButton("");
		btnMenosFichas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
		        tipo = 1;
		        if (txtFichasCantidad.getText().isEmpty() || txtFichasCantidad.getText().equals("0")) {
		            txtFichasCantidad.setText("1");
		            cantidadFichas = 1;
		        } else {
		            fichas = Integer.parseInt(txtFichasCantidad.getText());
		            fichas--;
		            txtFichasCantidad.setText(String.valueOf(fichas));

		            cantidadFichas = 1;
		        }
		        totalapagar = Integer.parseInt(txtFichasCantidad.getText()) * 50;
		        txtResult.setText("$ " + String.valueOf(totalapagar));
		        btnMasFichas.setVisible(true);
		        btnMenosFichas.setVisible(true);
		        btnMasTicket.setVisible(false);
		        btnMenosTicket.setVisible(false);
			}
		});
		btnMenosFichas.setIcon(new ImageIcon(principal.class.getResource("/bambu_nettuno/menois.png")));
		btnMenosFichas.setBounds(81, 159, 97, 97);
		panel.add(btnMenosFichas);
		
		btnMenosTicket = new JButton("");
		btnMenosTicket.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		        tipo = 3;
		        if (txtManualCantidad.getText().isEmpty() || txtManualCantidad.getText().equals("0")) {
		            txtManualCantidad.setText("50");
		            cantidadFichas = 1;
		        } else {
		            dinero = Integer.parseInt(txtManualCantidad.getText()) - 50;
		            //dinero+50;
		            txtManualCantidad.setText(String.valueOf(dinero));
		            cantidadFichas = 1;
		        }
		        totalapagar = Integer.parseInt(txtManualCantidad.getText());
		        txtResult.setText("$ " + String.valueOf(totalapagar));
		        btnMasFichas.setVisible(false);
		        btnMenosFichas.setVisible(false);
		        btnMasTicket.setVisible(true);
		        btnMenosTicket.setVisible(true);
			}
		});
		btnMenosTicket.setIcon(new ImageIcon(principal.class.getResource("/bambu_nettuno/menois.png")));
		btnMenosTicket.setBounds(753, 159, 97, 97);
		panel.add(btnMenosTicket);
		
		btnMasTicket = new JButton("");
		btnMasTicket.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		        tipo = 3;
		        if (txtManualCantidad.getText().isEmpty() || txtManualCantidad.getText().equals("0")) {
		            txtManualCantidad.setText("50");
		            cantidadFichas = 1;
		        } else {
		            dinero = Integer.parseInt(txtManualCantidad.getText()) + 50;
		            //dinero+50;
		            txtManualCantidad.setText(String.valueOf(dinero));
		            cantidadFichas = 1;
		        }
		        totalapagar = Integer.parseInt(txtManualCantidad.getText());
		        txtResult.setText("$ " + String.valueOf(totalapagar));
		        btnMasFichas.setVisible(false);
		        btnMenosFichas.setVisible(false);
		        btnMasTicket.setVisible(true);
		        btnMenosTicket.setVisible(true);
			}
		});
		btnMasTicket.setIcon(new ImageIcon(principal.class.getResource("/bambu_nettuno/mais.png")));
		btnMasTicket.setBounds(1090, 159, 97, 97);
		panel.add(btnMasTicket);
		
		txtResult = new JLabel("0");
		txtResult.setForeground(Color.WHITE);
		txtResult.setHorizontalAlignment(SwingConstants.CENTER);
		txtResult.setFont(new Font("Arial", Font.BOLD, 60));
		txtResult.setBounds(418, 536, 444, 97);
		panel.add(txtResult);
		
		btnpagar = new JLabel("");
		btnpagar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		        if (tipo == 1) {
		            //totalapagar = Integer.parseInt(txtfichas.getText()) * 50;
		            //cantidadFichas = Integer.parseInt(txtfichas.getText());
		            double totalconimpuesto = totalapagar;
		            double totalsinimpuesto = totalapagar / 1.22;
		            double montoimpuesto = totalapagar - totalsinimpuesto;
		            String rut = null;
		            int numeroTag = 0;
		            //TIPO 1 VENTA FICHAS
		            //TIPO 2 VENTA CLUBNETTUNO
		            //TIPO 3 VENTA MANUAL 
		            int dialogButton = JOptionPane.YES_NO_OPTION;
		            int dialogResult = JOptionPane.showConfirmDialog(null, "CONFIRMA LA COMPRA DE FICHAS POR $" + totalapagar + "?", "Warning", dialogButton);
		            if (dialogResult == JOptionPane.YES_OPTION) {
		                // Saving code here
		            	facturaNro = ventaa.consultarNro();
		                //LLAMO POS
		            	
		            	transaccion.setEmpHASH(empHASH);
		            	transaccion.setEmpCod(empCod);
		            	transaccion.setTermCod(termCod);
		            	transaccion.setOperacion("VTA");
		            	transaccion.setMonedaISO(monedaPesos);
		            	transaccion.setMonto(totalconimpuesto);
		            	transaccion.setFacturaNro(facturaNro);
		            	transaccion.setFacturaMonto(totalconimpuesto);
		            	transaccion.setFacturaMontoGravado(totalsinimpuesto);
		            	transaccion.setFacturaMontoIVA(montoimpuesto);
		            	transaccion.setFacturaConsumidorFinal(true);
		            	
		            	try {
							msjRespuesta = WS.postearTransaccion(transaccion);
						} catch (RemoteException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
		            	
		            	if(msjRespuesta.getResp_MensajeError().equals("9")) {
		            		ITarjetasTransaccion_400RespuestaCancelarTransaccion respCancelar = new ITarjetasTransaccion_400RespuestaCancelarTransaccion();
		            		try {
								respCancelar = WS.cancelarTransaccion(msjRespuesta.getTokenNro());
							} catch (RemoteException e1) {
								// TODO Auto-generated catch block
								String error = e1.getMessage();
								System.out.println(error);
							}
		            	}
		            	
		                ahoraSi.enviarDatos("A", txtFichasCantidad.getText());
		                venta venta = new venta(totalsinimpuesto, totalconimpuesto, montoimpuesto, cantidadFichas, rut, numeroTag, tipo);
		                //ARDUINO
		                /*try {
		                 //SerialPort.entregarFichas();
		                 } catch (Exception e) {
		                 System.out.println(e.getMessage());
		                 JOptionPane.showMessageDialog(null, "OCURRIÓ UN ERROR :( ");

		                 }*/
		                try {
		                    venta.insertarVenta(venta);
		                } catch (SQLException ex) {
		                    System.out.println("error");
		                }
		            }
		            if (dialogResult == JOptionPane.NO_OPTION) {
		                // Saving code here
		            }

		            //new confirmarcompra(totalapagar).setVisible(true);
		            txtFichasCantidad.setText("0");
		            txtResult.setText("$ 0");
		            txtManualCantidad.setText("0");
		        } else if (tipo == 2) {

		        } else if (tipo == 3) {
		            double totalconimpuesto = totalapagar;
		            double totalsinimpuesto = totalapagar / 1.22;
		            double montoimpuesto = totalapagar - totalsinimpuesto;

		            String rut = null;
		            int numeroTag = 0;
		            //TIPO 1 VENTA FICHAS
		            //TIPO 2 VENTA CLUBNETTUNO
		            //TIPO 3 VENTA MANUAL 
		            int dialogButton = JOptionPane.YES_NO_OPTION;
		            int dialogResult = JOptionPane.showConfirmDialog(null, "CONFIRMA LA COMPRA POR $" + totalapagar + "?", "Warning", dialogButton);
		            if (dialogResult == JOptionPane.YES_OPTION) {
		                // Saving code here
		                //LLAMO POS
		                venta venta = new venta(totalsinimpuesto, totalconimpuesto, montoimpuesto, cantidadFichas, rut, numeroTag, tipo);
		                try {
		                    venta.insertarVenta(venta);
		                    JOptionPane.showMessageDialog(null, "VENTA CONFIRMADA! :) ");
		                    txtResult.setText("$ 0");
		                    //bgroup.clearSelection();
		                    tipo = 1;
		                    btnMasFichas.setVisible(true);
		                    btnMenosFichas.setVisible(true);
		                    btnMenosTicket.setVisible(true);
		                    btnMasTicket.setVisible(true);

		                } catch (SQLException ex) {
		                    System.out.println("error");
		                    JOptionPane.showMessageDialog(null, "OCURRIÓ UN ERROR :( ");
		                    txtResult.setText("$ 0");
		                    bgroup.clearSelection();
		                    tipo = 1;

		                }

		            }
		            if (dialogResult == JOptionPane.NO_OPTION) {
		                txtFichasCantidad.setText("0");
		                txtManualCantidad.setText("0");
		                txtResult.setText("0");
		                tipo = 0;
		                btnMasFichas.setVisible(true);
		                btnMenosFichas.setVisible(true);
		                btnMenosTicket.setVisible(true);
		                btnMasTicket.setVisible(true);
		            }
		        }
			}
		});
		btnpagar.setIcon(new ImageIcon(principal.class.getResource("/bambu_nettuno/cash.png")));
		btnpagar.setBounds(872, 536, 97, 108);
		panel.add(btnpagar);
		
		btnborrar = new JLabel("");
		btnborrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		        txtFichasCantidad.setText("0");
		        txtManualCantidad.setText("0");
		        txtResult.setText("0");
		        tipo = 0;
		        btnMasFichas.setVisible(true);
		        btnMenosFichas.setVisible(true);
		        btnMenosTicket.setVisible(true);
		        btnMasTicket.setVisible(true);
			}
		});
		btnborrar.setIcon(new ImageIcon(principal.class.getResource("/bambu_nettuno/cancelarsolo.png")));
		btnborrar.setBounds(979, 536, 97, 97);
		panel.add(btnborrar);
		
		txtFichasCantidad = new JLabel("0");
		txtFichasCantidad.setForeground(Color.WHITE);
		txtFichasCantidad.setFont(new Font("Arial", Font.BOLD, 75));
		txtFichasCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		txtFichasCantidad.setBounds(208, 120, 179, 178);
		panel.add(txtFichasCantidad);
		
		txtManualCantidad = new JLabel("0");
		txtManualCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		txtManualCantidad.setForeground(Color.WHITE);
		txtManualCantidad.setFont(new Font("Arial", Font.BOLD, 75));
		txtManualCantidad.setBounds(880, 120, 179, 178);
		panel.add(txtManualCantidad);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 1306, 735);
		lblNewLabel.setIcon(new ImageIcon(principal.class.getResource("/bambu_nettuno/FONDO4 copia.png")));
		panel.add(lblNewLabel);
	}
}
