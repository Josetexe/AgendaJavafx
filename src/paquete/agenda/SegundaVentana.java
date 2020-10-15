/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.agenda;

import java.util.ArrayList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author FP Mañana A
 */
public class SegundaVentana {
    public static void mostrarVentana(String titulo, ArrayList<Contacto> lista_contanto){
        TableView tv=new TableView();
        TableColumn<String, Contacto> columna1 = new TableColumn<>("NOMBRE");
        columna1.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        TableColumn<String, Contacto> columna2 = new TableColumn<>("TELEFONO");
        columna2.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        tv.getColumns().add(columna1);
        tv.getColumns().add(columna2);
    
        for (Contacto  c : lista_contanto) {
            tv.getItems().add(c);
        }
        
        Stage ventana=new Stage();
        ventana.setTitle(titulo);
        VBox v=new VBox(20);
        v.getChildren().addAll(tv);
        Scene escena =new Scene(v, 200, 200);
        ventana.setScene(escena);
        ventana.show();
    }
}
