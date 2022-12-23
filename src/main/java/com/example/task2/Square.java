package com.example.task2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Square extends Shape {

    @Override
    double area() {
        return 0;
    }

    public Square(double x, double y) {
        super(x, y);
    }
    @Override
    void draw(GraphicsContext gr) {
        gr.setStroke(Color.BLACK);
        gr.setLineWidth(10);
        gr.strokeRect(x, y, 150, 150);
    }
}
