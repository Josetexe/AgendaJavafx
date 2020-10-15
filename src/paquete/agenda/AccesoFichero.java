/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.agenda;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author FP Mañana A
    */
public class AccesoFichero {

    private static String ruta="C:\\Jose\\contactos.csv";
    private static  String separador=",";
    public static void grabarContacto(Contacto c) {
        try {
            FileWriter fw=new FileWriter(ruta, true);
            String linea=c.getNombre()+separador+c.getApellido()+separador+c.getTelefono()+"\n";
            fw.write(linea);
            fw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
