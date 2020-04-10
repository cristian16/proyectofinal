package Modelo;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UsuarioBD {

    private static ArrayList<String> listaNombres;
    private static ArrayList<Usuario1> listacliente;
    
    //GUARDAMOS UN CLIENTE EN LA BASE DE DATOS
    public static void guardarClienteBD(Usuario1 cliente) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/sintetica", "root", "root");
            System.out.print("Conexion establecida!");
            Statement sentencia = conexion.createStatement();
            int insert = sentencia.executeUpdate("insert into clientes values('" + cliente.getCedula()
                    + "','" + cliente.getNombres() + "','" + cliente.getApellidos() + "','" + cliente.getTeléfono() + "','"
                    + cliente.getDireccion() + "','" + cliente.getEdad() + "')");
            sentencia.close();
            conexion.close();
        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }
    }
   // ELIMINAMOS UN CLIENTE EN LA BASE DE DATOS
    public static void eliminarCliente(String cedula) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/sintetica", "root", "root");
            System.out.print("Conexion Establecida");
            Statement sentencia = conexion.createStatement();
            int insert = sentencia.executeUpdate("delete from clientes where Cedula = '" + cedula + "'");
            sentencia.close();
            conexion.close();
        } catch (Exception e) {
            System.out.print("Error en la conexion" + e);
        }
    }
    
    public static Usuario1 buscarCliente(String cedula) {

        Usuario1 cliente = new Usuario1();;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/sintetica", "root", "root");
            //System.out.print("Conexion Establecida");
            Statement sentencia = conexion.createStatement();
            ResultSet encontrar = sentencia.executeQuery("select * from estudiante "
                    + "where Cédula = '" + cedula + "'");

            while (encontrar.next()) {
                String cedul = encontrar.getString("Cédula");
                String nombre = encontrar.getString("Nombres");
                String apellido = encontrar.getString("Apellidos");
                String tel = encontrar.getString("Telefono");
                String dir = encontrar.getString("Direccion");
                String edad = encontrar.getString("Edad");

                cliente.setCedula(cedul);
                cliente.setNombres(nombre);
                cliente.setApellidos(apellido);
                cliente.setTeléfono(tel);
                cliente.setDireccion(dir);
                cliente.setEdad(edad);
            }
            sentencia.close();
            conexion.close();
        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }
        return cliente;
    }

    public static ArrayList cargarNombres() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/sintetica", "root", "root");
            System.out.print("Conexion establecida!");
            Statement sentencia = conexion.createStatement();
            ResultSet necesario = sentencia.executeQuery("select nombres,apellidos from estudiante");

            listaNombres = new ArrayList<>();
            while (necesario.next()) {

                String nom = necesario.getString("nombres");
                String ape = necesario.getString("apellidos");

                listaNombres.add(nom + " " + ape);
            }
            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }
        return listaNombres;

    }

    //actualizar cliente
    public void actualizarCliente(Usuario1 cliente) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/sintetica", "root", "root");
            System.out.print("Conexion establecida!");

            Statement sentencia = conexion.createStatement();

            int update = sentencia.executeUpdate("update alumno.alumno set Nombre='" + cliente.getNombres() + "' ,'"
                    + cliente.getApellidos() + "','" + cliente.getDireccion() + "' ,'" + cliente.getEdad() +"' where ( Cedula = '" + cliente.getCedula() + "')");

            sentencia.close();
            conexion.close();
        } catch (Exception t) {
            System.out.print("Error en la conexion" + t);
        }
    }

    public static ArrayList cargarCliente() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/sintetica", "root", " ");
            System.out.print("Conexion establecida!");
            Statement sentencia = conexion.createStatement();
            ResultSet encontrar = sentencia.executeQuery("select * from estudiante");
            Usuario1 cliente = null;

            listaNombres = new ArrayList<>();
            while (encontrar.next()) {

                String ced = encontrar.getString("cedula");
                String nom = encontrar.getString("nombres");
                String ape = encontrar.getString("apellidos");
                String tel = encontrar.getString("telefono");
                String dir = encontrar.getString("direccion");
                String corr = encontrar.getString("correo");

                Usuario1 Usuario1 = new Usuario1();

                cliente.setCedula(ced);
                cliente.setNombres(nom);
                cliente.setApellidos(ape);
                cliente.setTeléfono(tel);
                cliente.setDireccion(dir);

                listacliente.add(cliente);
            }
            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }
        return listacliente;

    }

}
