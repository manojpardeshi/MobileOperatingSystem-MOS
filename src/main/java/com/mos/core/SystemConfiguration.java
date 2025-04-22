package com.mos.config;

import java.util.HashMap;
import java.util.Map;

public class SystemConfiguration {

    private Map<String, String> config;

    public SystemConfiguration() {
        this.config = new HashMap<>();
        loadDefaultSettings();
    }

    private void loadDefaultSettings() {
        config.put("OS_NAME", "MobileOperatingSystem-MOS");
        config.put("VERSION", "1.0");
        config.put("LANGUAGE", "en-US");
    }

    public String getSetting(String key) {
        return config.getOrDefault(key, "Unknown Setting");
    }

    public void updateSetting(String key, String value) {
        config.put(key, value);
        System.out.println("Setting updated: " + key + " = " + value);
    }

    public void displaySettings() {
        System.out.println("System Configuration:");
        for (Map.Entry<String, String> entry : config.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}