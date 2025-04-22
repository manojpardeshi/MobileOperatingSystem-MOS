package com.mos.core;

import com.mos.kernel.Kernel;
import com.mos.config.SystemConfiguration;
import com.mos.resources.ResourceManager;

public class BootLoader {

    public void initializeSystem() {
        System.out.println("Initializing system...");

        // System Configuration
        SystemConfiguration config = new SystemConfiguration();
        config.displaySettings();

        // Kernel and Drivers
        Kernel kernel = new Kernel();
        kernel.loadKernelModules();

        // Resource Management
        ResourceManager resourceManager = new ResourceManager(1024); // 1024 MB of memory
        resourceManager.displayResourceStatus();

        System.out.println("System initialized successfully.");
    }

    public static void main(String[] args) {
        BootLoader bootLoader = new BootLoader();
        bootLoader.initializeSystem();
    }
}