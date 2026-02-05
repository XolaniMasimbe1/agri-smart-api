package org.example.controller;


import org.example.domain.SensorData;
import org.springframework.web.bind.annotation.*;



@RestController
@CrossOrigin
public class SensorDataController {

    @GetMapping("/api/sensor/latest")
    public SensorData getLatestSensorData() {

        // Demo values (later replaced by Arduino data)
        int soilMoisture = 420;
        double soilPH = 6.4;
        double temperature = 25.1;

        String pumpStatus = soilMoisture < 500 ? "ON" : "OFF";

        return new SensorData(
                soilMoisture,
                soilPH,
                temperature,
                pumpStatus
        );
    }
}
