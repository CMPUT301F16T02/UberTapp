package com.ubertapp.Models;

/**
 * The Request class represents a request that was sent out by the rider. A Driver that is in the
 * drivers list can then offer a ride to the Rider who made the request. It is essentially a class
 * who's sole purpose is to commpunicate b/w the Driver and Rider class whild holding important
 * information such as ride cost etc...
 */

import java.util.ArrayList;
import java.util.Collection;

public class Request {
    private Rider rider;
    private Collection<Driver> drivers;
    private String offeringDriverID;

    private final double cost;
    private final String riderId;

    public Request(double cost, Rider rider) {
        this.cost = cost;
        this.rider = rider;
        this.riderId = rider.getUserId();
        this.drivers = new ArrayList<Driver>();
    }

//    public Request(double cost, String riderId) {
//        this.cost = cost;
//        this.riderId = riderId;
//    }

    public double getCost() {
        return cost;
    }

//    public String getDriverId() {
//        return driverId;
//    }

    public Collection<Driver> getDrivers() {
        return this.drivers;
    }

    public Rider getRider() {
        return this.rider;
    }

    public String getRiderId() {
        return rider.getUserId();
    }

    public String getOfferingDriverID() {
        return offeringDriverID;
    }

    /**
     * Adds a driver to the list of drivers.
     * @param driver
     */
    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    /**
     * Allows a driver to offer a ride to the rider who this request belongs to. Driver must be
     * in the list.
     * @param driver
     */
    public void offerRide(Driver driver){
        if(drivers.contains(driver))
        {
            offeringDriverID = driver.getUserId();
        }
        //TODO: do some shenanigans to inform the user they are being offered a ride. (ACCEPT / DECLINE)
    }

    /**
     *
     */
    public void acceptOffer()
    {
        //Creates a ride instance(???) using the rider id, and the id of the driver whom the rider
        //accepted the offer from
    }
}
