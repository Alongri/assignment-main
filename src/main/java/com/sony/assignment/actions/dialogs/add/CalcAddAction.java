package com.sony.assignment.actions.dialogs.add;

import com.sony.assignment.RobotApplication;
import com.sony.assignment.actions.Action;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class CalcAddAction extends Action {
    @Override
    protected void run() {
        try {
            openDialog();
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    private void openDialog() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(RobotApplication.class.getResource("calcAddDialog.fxml"));
        CalcAddDialogController controller = new CalcAddDialogController();
        Parent root = loader.load();
        Scene scene = new Scene(root);
        final Stage dialog = new Stage();
        dialog.setTitle("Add Action");
        dialog.setScene(scene);
        dialog.centerOnScreen();
        dialog.initModality(Modality.APPLICATION_MODAL);
        dialog.showAndWait();
    }

    @Override
    protected String getName() {
        return "Add Dialog";
    }
}
