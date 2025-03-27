package org.ex1;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;

public class Employee implements Serializable {
    @JsonProperty("name")
    private final String name;
    @JsonProperty("lastname")
    private final String lastname;
    @JsonProperty("price_hour")
    private final double priceHour;
    @JsonIgnore
    protected static final double FUEL_FEE = 1.5;
    @JsonIgnore
    protected static final double DIET_FEE = 10;

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public Employee(String name, String lastname, double priceHour) {
        this.name = name;
        this.priceHour = priceHour;
        this.lastname = lastname;
    }

    public double calculateSalary(double workedHours) {
        return workedHours * this.priceHour;
    }

    public double calculateTransport(int daysMonthWorked) {
        return DIET_FEE * daysMonthWorked;
    }
}
