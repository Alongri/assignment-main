package com.sony.assignment.actions.dialogs.add;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class JoinStringDialogController{

    @FXML
    private TextField string1;

    @FXML
    private TextField string2;

    @FXML
    private TextField resultTxt;

    @FXML
    public void btnJoinClicked() {
        resultTxt.setText(string1.getText()+string2.getText());
    }

}
