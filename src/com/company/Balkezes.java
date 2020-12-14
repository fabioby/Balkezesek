package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Balkezes {
    String name;
    LocalDate first;
    LocalDate last;
    int weight;
    int height;
    //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy LLLL dd");
    //String formattedString = localDate.format(formatter);


    public Balkezes(String name, LocalDate first, LocalDate last, int weight, int height) {
        this.name = name;
        this.first = first;
        this.last = last;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public LocalDate getFirst() {
        return first;
    }

    public LocalDate getLast() {
        return last;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }
}
