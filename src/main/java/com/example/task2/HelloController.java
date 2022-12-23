package com.example.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HelloController {
    public TextField lbl;
    public Button btn;
    public Canvas can;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void addPicker(ActionEvent actionEvent) {
        GraphicsContext gr = can.getGraphicsContext2D();
        gr.clearRect(0, 0, can.getWidth(), can.getHeight());
        /*GraphicsContext gr = can.getGraphicsContext2D();
        if((lbl.getText().equals())){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Предупреждение: ");
            alert.setHeaderText(null);
            alert.setContentText("Введено нечисло или число не из диапазона от 0 до 5!");
            alert.showAndWait();
            return;
        }else {
            int numberOfSides = Integer.parseInt(lbl.getText());
            ShapeFactory shapeFactory = new ShapeFactory();
            Shape shape1 = shapeFactory.createShape(numberOfSides);
            gr.clearRect(0, 0, 250, 485);
            shape1.draw(gr);
        }*/
    }

    public void onClick(MouseEvent mouseEvent) {
        double x = mouseEvent.getX();
        double y =mouseEvent.getY();

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.createShape(Integer.parseInt(lbl.getText()));
        shape.setX(x);
        shape.setY(y);
        shape.draw(can.getGraphicsContext2D());

    }
}