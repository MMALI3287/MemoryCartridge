/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memorycartridge;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
/**
 *
 * @author USER
 */
public class MemoryCartridge extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
       FXMLLoader loader = new FXMLLoader(getClass().getResource("MemoryCartridge.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);
       

        primaryStage.setTitle("MemoryCartidge");
        primaryStage.setScene(scene);
        primaryStage.show();
        
         primaryStage.setOnCloseRequest(event -> {
            event.consume();
            
            exitAction(primaryStage);
                }); 
    }
    private void exitAction(Stage primaryStage) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setHeaderText("!!!EXITTING!!!");
        alert.setContentText("Want to Exit ?");

        if (alert.showAndWait().get() == ButtonType.OK) {
            primaryStage.close();
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
