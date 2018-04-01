package testdemo;/**
 * Created by 87057 on 2018/3/12.
 */

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;
import sample.Person;

public class test extends Application {
    @FXML
    public AnchorPane layout;
    @FXML
    private ChoiceBox choiceId;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws java.io.IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(test.class.getResource("choicebox.fxml"));
        AnchorPane layout = (AnchorPane) loader.load();
        Scene scene = new Scene(layout);
        primaryStage.setScene(scene);
        primaryStage.show();




    }
}
