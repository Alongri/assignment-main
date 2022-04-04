package com.sony.assignment.actions.dialogs.add;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.net.URL;
import java.util.ResourceBundle;

public class CalcAddDialogController{

    @FXML
    private TextField num1Txt;

    @FXML
    private TextField num2Txt;

    @FXML
    private TextField resultTxt;

    @FXML
    private Label errorLabel;

    @FXML
    public void btnAddClicked() {
        String res ="", errorMessage = "";
        try {
            int num1Value = Integer.valueOf(num1Txt.getText().trim());
            int num2Value = Integer.valueOf(num2Txt.getText().trim());
            res = String.valueOf(num1Value+num2Value);
        } catch (NumberFormatException e) {
            res = "";
            errorMessage = "Isn't legal numbers";
        }
        errorLabel.setTextFill(Color.color(1, 0, 0));
        errorLabel.setMinWidth(200);
        errorLabel.setText(errorMessage);
        resultTxt.setText(res);
    }

}
