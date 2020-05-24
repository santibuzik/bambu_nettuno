/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import empresa.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import venta.venta;

/**
 *
 * @author Notebook
 */
public class bdventa {

	empresa empresa;

	public static String insertarVenta(double totalsinimpuesto, double totalconimpuesto, double montoimpuesto,
			int cantidadFichas, String rut, int numerotag, int tipo) throws SQLException {

		String resultado = "exito";

		Connection c = null;
		Statement stmt = null;
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bambu", "postgres", "postgres");
			c.setAutoCommit(false);
			System.out.println("Opened database successfully");

			PreparedStatement st = c.prepareStatement(
					"INSERT INTO venta (totalsinimpuesto,totalconimpuesto,montoimpuesto,cantidadFichas,rut,numerotag,tipo) VALUES (?, ?, ?, ?, ?, ?, ?)");

			st.setDouble(1, totalsinimpuesto);
			st.setDouble(2, totalconimpuesto);
			st.setDouble(3, montoimpuesto);
			st.setInt(4, cantidadFichas);
			st.setString(5, rut);
			st.setInt(6, numerotag);
			st.setInt(7, tipo);

			st.executeUpdate();
			st.close();
			// stmt = c.createStatement();
			// String sql = "INSERT INTO venta
			// (totalsinimpuesto,totalconimpuesto,montoimpuesto,cantidadFichas,rut,numerotag,tipo)
			// "
			// + "VALUES (" + totalsinimpuesto + "," + totalconimpuesto + "," +
			// montoimpuesto + "," + cantidadFichas + "," + rut + "," + numerotag + "," +
			// tipo + ",)";
			// stmt.execute(sql);
		} catch (Exception e) {
			resultado = e.getClass().getName() + ": " + e.getMessage();
			// System.exit(0);
			System.out.println(resultado);
		}
		// stmt.close();
		c.commit();
		c.close();

		return resultado;
	}

	public static String verificarVentaEmpresa(String rut) throws SQLException {

		String resultado = "exito";

		Connection c = null;
		// Statement stmt = null;
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bambu", "postgres", "postgres");
			c.setAutoCommit(false);
			System.out.println("Opened database successfully");

			// stmt = c.createStatement();
			String sql = "SELECT (rut,numeroTag,razonsocial,direccion, habilitada) FROM empresa where rut=? ";
			PreparedStatement ps = c.prepareStatement(sql);
			ps.setString(1, rut);
			ResultSet rs = ps.executeQuery();
			int numerotag = rs.getInt(2);
			String razonsocial = rs.getString(3);
			String direccion = rs.getString(4);
			boolean habilitada = rs.getBoolean(5);
			// empresa = (rut, numerotag, razonsocial, direccion, habilitada);
			while (rs.next() == false) {
				// System.out.println(rs.getString("f.Cod_Factura"));
				throw new Exception("No existe el rut " + rut);
			}
			rs.close();
			ps.close();
			resultado = "exito";
			// stmt.execute(sql);
		} catch (Exception e) {
			resultado = e.getClass().getName() + ": " + e.getMessage();
			// System.exit(0);
			System.out.println(resultado);
		}
		// empresa empresa = empresa(rut, numerotag, razonsocial, direccion,
		// habilitada);
		// stmt.close();
		c.commit();
		c.close();

		return resultado;
	}

	public Double consultarNro() throws ClassNotFoundException {
		Connection c = null;
		Double msj = 0.0;
		int ultimoNumero = 0;
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bambu", "postgres", "postgres");
			c.setAutoCommit(false);
			System.out.println("Opened database successfully");

			// stmt = c.createStatement();
			String sql = "SELECT MAX(numerofolio) FROM venta";
			PreparedStatement ps = c.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ultimoNumero = rs.getInt(1);
				//ultimoNumero++;
			}
			Double numeroNuevo = Double.valueOf(ultimoNumero);
			msj = numeroNuevo;
		} catch (SQLException e) {
			String error = e.getMessage();
			System.out.println(error);
		}
		return msj;
	}

	/*
	 * private static empresa empresa(String rut, int numerotag, String razonsocial,
	 * String direccion, boolean habilitada) { throw new
	 * UnsupportedOperationException("Not supported yet."); //To change body of
	 * generated methods, choose Tools | Templates. }
	 */
}
