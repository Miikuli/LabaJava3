package ru.mikova.geometry;

public class Line {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Линия от " + start + " до " + end;
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }
}