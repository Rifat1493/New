/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_first_login;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Abdullah Al-Munzir
 */
public class Sales_reportsController implements Initializable {

    /**
     * Initializes the controller class.
     * 
     */
    
    @FXML
    private ComboBox <String> Total_sell_by;
    
    @FXML
    private TextField date_text;
    
    @FXML
    private TextField product_text;
    
    @FXML
    private TextField custname_text;
    
    @FXML
    private TextField custphone_text;
    
    ObservableList <String> list = FXCollections.observableArrayList("Date", "Product", "Customer");
    
     @FXML
    private void back_button(ActionEvent event) throws IOException {
       
            
        Parent main_parent = FXMLLoader.load(getClass().getResource("Sell.fxml"));
        Scene main_scene = new Scene(main_parent);
        Stage main_stage =(Stage) ((Node) event.getSource()).getScene().getWindow();
        main_stage.setScene(main_scene);
        main_stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
         Total_sell_by.setItems(list);
    }    
    
}
