package control;

import model.*;
import infra.*;
import java.util.Random;

class RideController{
  HashMap<int, Ride> rides;
  RidePersistence persistence;

  RideController(){
    this.persistence = new RidePersistence();
  }

  public void addRide(String[] rideData){
    Ride ride = new Ride();

    ride.setOrigin(rideData[0]);
    ride.setDestination(rideData[1]);
    Driver driver = new UserController().getDriver(rideData[2]);
    ride.setDriver(driver);
    User passenger = new UserController().getUser(rideData[3]);
    ride.setPassenger(passenger);
    ride.setSchedule(rideData[4]);

    rides.put(new Random().nextInt(), ride);
    persistence.saveRides(rides);
  }

  public HashMap<String, Ride> getAll(){
    return rides;
  }

  public Ride getRide(String key){
    return rides.get(key);
  }

  public void deleteRide(String key){
    rides.remove(key);
    persistence.saveRides(rides);
  }
}