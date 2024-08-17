package ru.job4j.calculator;

public class TemperatureFit {
    public static double idealTemperatureForFruits(int temperature) {
        return temperature - 2.0;
    }

    public static double idealTemperatureForMeat(int temperature) {
        return temperature - 5.0;
    }

    public static void main(String[] args) {
        int roomtemperature = 10;
        double fruitsTemp = TemperatureFit.idealTemperatureForFruits(roomtemperature);
        double meatTemp = TemperatureFit.idealTemperatureForMeat(roomtemperature);
        System.out.println("Ideal temperature for fruits is " + fruitsTemp + "°C");
        System.out.println("Ideal temperature for meat is " + meatTemp + "°C");
    }
}

