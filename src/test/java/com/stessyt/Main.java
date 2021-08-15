package com.stessyt;

public class Main {
    public static void main(String[] args) {
        Vessel vessel = new Vessel();
        vessel.vesselType = "Survey vessel";
        vessel.yearBuild = 1982;
        vessel.portOfRegistry = "Tuvalu";
        vessel.maxSpeed = 10;
        vessel.lengthOverall = 40;
        vessel.usedForSailing = false;

        System.out.println(vessel.vesselType);
    }
}
