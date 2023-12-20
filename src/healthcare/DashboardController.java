/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcare;

import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 *
 * @author Lenovo
 */
public class DashboardController implements Initializable {
    
    private Label label;
    @FXML
    private Pane top_pane;
    @FXML
    private VBox panel_scroll;
    
    private void handleButtonAction(MouseEvent event) {
      refreshNodes();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        refreshNodes();
    }    

    private void refreshNodes() {
        
        panel_scroll.getChildren().clear();
        Node [] nodes = new Node[10];
        for(int i=0;i<=8    ;i++)
            
        {
        try {
            nodes[i] = (Node)FXMLLoader.load(getClass().getResource("patients.fxml"));
            panel_scroll.getChildren().add(nodes[i]);
        
        }catch(IOException ex){
         Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
        
            
            }
}

