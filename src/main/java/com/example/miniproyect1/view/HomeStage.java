package com.example.miniproyect1.view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Objects;

public class HomeStage extends Stage {
    private Scene scene;
    private VBox root;

    public HomeStage () {
        root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);
        scene = new Scene(root, 300, 300);
        initStage();
        showHome();
    }

    private void initStage() {
        setTitle("Mini proyecto 1");
        setResizable(false);
        getIcons().add(new Image(Objects.requireNonNull(getClass().getClassLoader().getResource("com/example/miniproyect1/favicon.png").toExternalForm())));
        setScene(scene);
        show();
    }

    private void showHome() {
        Label titleLabel = new Label("Mini proyecto 1");
        TextField secretWordTextField = new TextField();
        Button playButton = new Button("Jugar");
        root.getChildren().addAll(titleLabel, secretWordTextField, playButton);
    }
}
