package com.mos.resources;

public class ResourceManager {

    private int totalMemory; // in MB
    private int usedMemory;  // in MB

    public ResourceManager(int totalMemory) {
        this.totalMemory = totalMemory;
        this.usedMemory = 0;
    }

    public boolean allocateMemory(int memory) {
        if (usedMemory + memory <= totalMemory) {
            usedMemory += memory;
            System.out.println("Allocated " + memory + " MB of memory.");
            return true;
        } else {
            System.out.println("Memory allocation failed. Not enough memory.");
            return false;
        }
    }

    public void releaseMemory(int memory) {
        usedMemory = Math.max(usedMemory - memory, 0);
        System.out.println("Released " + memory + " MB of memory.");
    }

    public int getAvailableMemory() {
        return totalMemory - usedMemory;
    }

    public void displayResourceStatus() {
        System.out.println("Total Memory: " + totalMemory + " MB");
        System.out.println("Used Memory: " + usedMemory + " MB");
        System.out.println("Available Memory: " + getAvailableMemory() + " MB");
    }
}