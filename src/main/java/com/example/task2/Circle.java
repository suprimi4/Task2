package com.example.task2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends Shape {

    double radius = 5;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }




    @Override
    double area() {
        return 0;
    }

    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(Color.BLACK);
        gr.setLineWidth(10);
        gr.strokeOval(x, y, radius, radius);

    }
}
