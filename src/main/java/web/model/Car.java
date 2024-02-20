package web.model;

public class Car {
    private int number;
    private String color;
    private int cost;
    public Car() {};
    public Car(int number, String color,int cost) {
        this.number = number;
        this.color = color;
        this.cost = cost;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "number=" + number +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                '}';
    }
}
