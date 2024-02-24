package org.example;
import java.util.PriorityQueue;

public class Toys implements Comparable<Toys>{
    int count = 0;
    protected int id;
    protected String name;
    private Integer percentageOfLoss;

    public Toys(String name, Integer percentageOfLoss) {
        count ++;
        this.id = count;
        this.name = name;
        this.percentageOfLoss = percentageOfLoss;
    }

    @Override
    public int compareTo(Toys o) {
        return this.percentageOfLoss-o.percentageOfLoss;
    }

    @Override
    public String toString() {
        return "Toys{" +
                "id = " + id +
                ", Название: '" + name + '\'' +
                ", % выпадения = " + percentageOfLoss +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPercentageOfLoss() {
        return percentageOfLoss;
    }

    public void setPercentageOfLoss(int percentageOfLoss) {
        this.percentageOfLoss = percentageOfLoss;
    }
}
