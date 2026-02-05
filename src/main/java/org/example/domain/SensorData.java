package org.example.domain;

public class SensorData {
    private int soilMoisture;
    private double soilPH;
    private double temperature;
    private String pumpStatus;

    public SensorData(int soilMoisture, double soilPH, double temperature, String pumpStatus) {
        this.soilMoisture = soilMoisture;
        this.soilPH = soilPH;
        this.temperature = temperature;
        this.pumpStatus = pumpStatus;
    }

    public int getSoilMoisture() {
        return soilMoisture;
    }

    public double getSoilPH() {
        return soilPH;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getPumpStatus() {
        return pumpStatus;
    }
}