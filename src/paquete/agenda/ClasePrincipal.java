/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.agenda;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author FP Mañana A
 */
public class ClasePrincipal extends Application {
    VBox v;
    TextField nombre;
    TextField apellido;
    TextField telefono;
    String nombre_g="";
    String apellido_g="";
    String telefono_g="";
   
    public static void main(String[] args) {
        launch(args);
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        v=new VBox();
        nombre=new TextField();
        apellido=new TextField();
        telefono=new TextField();
        Button btn_saludar=new Button("Enviar");
        Label lbl_nombre=new Label("Nombre:");
        Label lbl_apellido=new Label("Apellido:");
        Label lbl_telefono=new Label("Telefono:");
        
        btn_saludar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                nombre_g=nombre.getText();
                apellido_g=apellido.getText();
                telefono_g=telefono.getText();
                Contacto c=new Contacto(nombre_g, apellido_g, telefono_g);
                AccesoFichero.grabarContacto(c);
                nombre.setText("");
                apellido.setText("");
                telefono.setText("");
                
            }
        });
        v.getChildren().addAll(lbl_nombre,nombre,lbl_apellido,apellido,lbl_telefono,telefono,btn_saludar);
        Scene escena=new Scene(v, 300, 600, Color.AQUAMARINE);
        primaryStage.setScene(escena);
        primaryStage.show();
    }
}
