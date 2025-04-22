package com.mos.kernel;

import com.mos.drivers.DriverManager;

public class Kernel {

    private DriverManager driverManager;

    public Kernel() {
        this.driverManager = new DriverManager();
    }

    public void loadKernelModules() {
        System.out.println("Loading kernel modules...");
        driverManager.loadDriver("DisplayDriver");
        driverManager.loadDriver("AudioDriver");
        driverManager.loadDriver("NetworkDriver");
        System.out.println("Kernel modules loaded successfully.");
    }

    public void unloadAllDrivers() {
        System.out.println("Unloading all kernel modules...");
        driverManager.listLoadedDrivers();
        driverManager.unloadDriver("DisplayDriver");
        driverManager.unloadDriver("AudioDriver");
        driverManager.unloadDriver("NetworkDriver");
    }
}