package com.example.miniproyect1.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
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
        getIcons().add(new Image("https://www.svgrepo.com/show/526045/moon.svg"));
        setScene(scene);
        show();
    }

    private void showHome() {
        Label titleLabel = new Label("Mini proyecto 1");
        titleLabel.setTextFill(Color.MIDNIGHTBLUE);
        titleLabel.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 16));
        TextField secretWordTextField = new TextField();

        Button playButton = new Button("Jugar");
        playButton.setBackground(new Background(new BackgroundFill(
                Color.web("144978"),
                new CornerRadii(5),
                Insets.EMPTY
        )));
        playButton.setTextFill(Color.WHITE);
        playButton.setFont(Font.font(14));
        playButton.setCursor(Cursor.HAND);
        root.getChildren().addAll(titleLabel, secretWordTextField, playButton);
    }
}
