package com.example.miniproyect1;

import com.example.miniproyect1.view.HomeStage;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        new HomeStage();
    }
}
