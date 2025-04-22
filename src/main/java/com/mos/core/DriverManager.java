package com.mos.drivers;

import java.util.ArrayList;
import java.util.List;

public class DriverManager {

    private List<String> loadedDrivers;

    public DriverManager() {
        this.loadedDrivers = new ArrayList<>();
    }

    public void loadDriver(String driverName) {
        if (!loadedDrivers.contains(driverName)) {
            loadedDrivers.add(driverName);
            System.out.println("Driver loaded: " + driverName);
        } else {
            System.out.println("Driver already loaded: " + driverName);
        }
    }

    public void unloadDriver(String driverName) {
        if (loadedDrivers.contains(driverName)) {
            loadedDrivers.remove(driverName);
            System.out.println("Driver unloaded: " + driverName);
        } else {
            System.out.println("Driver not found: " + driverName);
        }
    }

    public void listLoadedDrivers() {
        System.out.println("Loaded Drivers:");
        for (String driver : loadedDrivers) {
            System.out.println("- " + driver);
        }
    }
}