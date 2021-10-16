package com.mycompany.csc211_imageassignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

public class SecondaryController {
    int counter = 0;
    int rotator = 0;
    
    @FXML
    private StackPane pane;

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    @FXML
    private Label label;

    @FXML
    void rotate(ActionEvent event) {
        rotator = rotator + 90;
        pane.setRotate(rotator);
        counter ++;
        label.setText("" + counter);
    }

    @FXML
    void switchTo1(ActionEvent event) throws FileNotFoundException {
        pane.getChildren().clear();
        Image img = new Image(new FileInputStream("C:\\Users\\Edson\\OneDrive\\Documents\\Images\\Eagle.jpg"));
        javafx.scene.image.ImageView mainImage = new javafx.scene.image.ImageView(img);
        pane.getChildren().add(mainImage);
        counter ++;
        label.setText("" + counter);
    }

    @FXML
    void switchTo2(ActionEvent event) throws FileNotFoundException {
        pane.getChildren().clear();
        Image img = new Image(new FileInputStream("C:\\Users\\Edson\\OneDrive\\Documents\\Images\\Owl.jpg"));
        javafx.scene.image.ImageView mainImage = new javafx.scene.image.ImageView(img);
        pane.getChildren().add(mainImage);
        counter ++;
        label.setText("" + counter);
    }
}