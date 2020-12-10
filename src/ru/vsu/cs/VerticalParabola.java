package ru.vsu.cs;

public class VerticalParabola {
    public double a;
    public double b;
    public double c;

    public VerticalParabola(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isPointInside(Point point) {
        return point.getY() > a * Math.pow(point.getX(), 2) + b * point.getX() + c;
    }
}