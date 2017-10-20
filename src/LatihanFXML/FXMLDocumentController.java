package LatihanFXML;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class FXMLDocumentController {

       String pin="";
       String PIN="123";
       int tmp;
       int kesempatan;
       
    @FXML
    private JFXButton button1;

    @FXML
    private JFXButton button2;

    @FXML
    private JFXButton button8;

    @FXML
    private JFXButton button9;

    @FXML
    private JFXButton button7;

    @FXML
    private JFXButton button5;

    @FXML
    private JFXButton buttonc;

    @FXML
    private JFXButton button0;

    @FXML
    private JFXButton button3;

    @FXML
    private JFXButton button6;

    @FXML
    private JFXButton button4;

    @FXML
    private JFXButton buttonok;

    @FXML
    private JFXPasswordField editpin;

    @FXML
    void push0(ActionEvent event) {
        pin += "0";
        editpin.setText(pin);
    }

    @FXML
    void push1(ActionEvent event) {
        pin += "1";
        editpin.setText(pin);
    }

    @FXML
    void push2(ActionEvent event) {
        pin += "2";
        editpin.setText(pin);
    }

    @FXML
    void push3(ActionEvent event) {
        pin += "3";
        editpin.setText(pin);
    }

    @FXML
    void push4(ActionEvent event) {
        pin += "4";
        editpin.setText(pin);
    }

    @FXML
    void push5(ActionEvent event) {
        pin += "5";
        editpin.setText(pin);
    }

    @FXML
    void push6(ActionEvent event) {
        pin += "6";
        editpin.setText(pin);
    }

    @FXML
    void push7(ActionEvent event) {
        pin += "7";
        editpin.setText(pin);
    }

    @FXML
    void push8(ActionEvent event) {
        pin += "8";
        editpin.setText(pin);
    }   

    @FXML
    void push9(ActionEvent event) {
        pin += "9";
        editpin.setText(pin);
    }

    @FXML
    void pushc(ActionEvent event) {
        pin += "";
        editpin.setText(pin);
    }

    @FXML
    void pushok(ActionEvent event) throws IOException {
        if (pin.equals(PIN)){
            ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLMenuAwal.fxml"));
            Scene scene = new Scene(fxmlLoader.load(),830,450);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("MenuAwal");
            stage.show();
    }else {
        kesempatan -= 1;
        JOptionPane.showMessageDialog(null, "PIN Salah \nTersisa "+ kesempatan + " Kesempatan lagi !");
        editpin.setText("");
        pin ="";
        if(kesempatan==0){
            System.exit(0);
        }
        }
    }

}
