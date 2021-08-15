package com.stessyt;

public class Vessel {
    String vesselType;
    int yearBuild;
    String portOfRegistry;
    int maxSpeed;
    int lengthOverall;
    boolean usedForSailing;

    public Vessel (String vesselType, int yearBuild, String portOfRegistry, int maxSpeed, int lengthOverall, boolean usedForSailing) {
        this.vesselType = vesselType;
        this.yearBuild = yearBuild;
        this.portOfRegistry = portOfRegistry;
        this.maxSpeed = maxSpeed;
        this.lengthOverall = lengthOverall;
        this.usedForSailing = usedForSailing;
    }

    String getVesselType() {
        return vesselType;
    }

    void setVesselType(String newVesselType) {
        this.vesselType = newVesselType;
    }

    void sayVesselProperties() {
        System.out.println("vessel type" + " " + "'" + vesselType + "'" + " -" + " year " + yearBuild);
    }
}

