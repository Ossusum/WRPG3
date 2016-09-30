package com.ben.wrpg.Game;

/**Player Entity Class
 * Contains Player states, stats, History.
 * Created by Benny on 9/27/2016.
 */

public class Player {

    private String name;                // Player's name
    private float topSpeed;             // Player's top speed ever reached, in miles?
    private float distanceTraveled;     // Total distance player has traveled

    // Default constructor
    public Player(String name){
        this.name = name;
        this.topSpeed = 0f;
        this.distanceTraveled = 0f;
    }

    // Constructor
    public Player(String name, float topSpeed, float distanceTraveled){
        this.name = name;
        this.topSpeed = topSpeed;
        this.distanceTraveled = distanceTraveled;
    }
    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(float topSpeed) {
        this.topSpeed = topSpeed;
    }

    public float getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(float distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    // toString
    public String toString(){
        //TODO Make a formated string for Player Class
        return null;
    }
}
