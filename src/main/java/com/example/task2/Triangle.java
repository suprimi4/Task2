package com.example.task2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Triangle extends Shape{
    @Override
    double area() {
        return 0;
    }

    public Triangle(double x, double y) {
        super(x, y);
    }

    @Override
    void draw(GraphicsContext gr) {
        gr.setStroke(Color.BLACK);
        gr.setLineWidth(10);
        gr.strokePolygon(new double[]{x, x-30, x+30, 40, 35},
                new double[]{y-100, y, y},
                3
        );
    }
}
