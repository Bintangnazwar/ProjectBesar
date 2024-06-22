package com.example.test;

import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import com.example.test.com.main.LibrarySystem;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        Button button = new Button("Selamat Datang di Perpustaan");
        button.setOnAction(event -> LibrarySystem.startLibrarySystem(stage));

        VBox root = new VBox(10, button);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 400, 240);

        stage.setTitle("Library system");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
