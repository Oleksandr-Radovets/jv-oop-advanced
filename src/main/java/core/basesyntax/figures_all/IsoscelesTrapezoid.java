package core.basesyntax.figures_all;

import core.basesyntax.Figure;
import core.basesyntax.AreaCalculator;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator {

    private double firstline;
    private double secondline;
    private double thirdline;

    public IsoscelesTrapezoid() {}

    public IsoscelesTrapezoid(double firstline, double secondline, double thirdline) {
        this.firstline = firstline;
        this.secondline = secondline;
        this.thirdline = thirdline;
    }

    public IsoscelesTrapezoid(String name, String color, double firstline, double secondline, double thirdline) {
        super(name, color);
        this.firstline = firstline;
        this.secondline = secondline;
        this.thirdline = thirdline;
    }

    @Override
    public double areaFigura() {
        return (firstline + secondline) * thirdline / 2;
    }

    @Override
    public void infoFigure() {
        System.out.println("name= " + name + ", color= " + color + ", area= " + areaFigura() +
                " unit sq., Length A=" + firstline + " unit sq., Length B= " + secondline + " unit sq." + " " + thirdline + " unit sq.");
    }
}
