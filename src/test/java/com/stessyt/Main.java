package com.stessyt;

public class Main {
    public static void main(String[] args) {
        Vessel vessel1 = new Vessel("Survey vessel", 1982, "Tuvalu", 10, 40, false);
        Vessel vessel2 = new Vessel("Hanse 460", 2018, "Tallinn", 7, 45, true);
        System.out.println(vessel1.vesselType);
        System.out.println(vessel1.getVesselType());
        vessel1.setVesselType("Sailing");
        System.out.println(vessel1.getVesselType());
        vessel2.sayVesselProperties();
    }
}
