package com.wildcodeschool.swapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Planet {
	// TODO : add attributes
    private String name;
    @JsonProperty("rotation_period")
    private String rotationPeriod;    
    @JsonProperty("orbital_period")
    private String orbitalPeriod;
    private String diameter;	
    private String climate;	
    private String gravity;
    private String terrain;	
    @JsonProperty("surface_water")
    private String surfaceWater;
    private String population;
    private String[] residents;
    private String[] films;
    private String created;	
    private String edited;
    private String url;	    
    
    // TODO : add an empty constructor
    public Planet() {
    }
    
    // TODO : add getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//------------------------
    
    public String getRotationPeriod() {
        return rotationPeriod;
    }

    public void setRotationPeriod(String rotationPeriod) {
        this.rotationPeriod = rotationPeriod;
    }
//------------------------
       
    public String getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void setOrbitalPeriod(String orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }
//------------------------
    
    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }
//------------------------

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }
  //------------------------   
    
    public String getGravity() {
        return gravity;
    }

    public void setGravity(String gravity) {
        this.gravity = gravity;
    }
  //------------------------   
    
    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }
  //------------------------   
  
    public String getSurfaceWater() {
        return surfaceWater;
    }

    public void setSurfaceWater(String surfaceWater) {
        this.surfaceWater = surfaceWater;
    }
  //------------------------   

    public String getPpopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }
  //------------------------   

    public String[] getResidents() {
        return residents;
    }

    public void setResidents(String[] residents) {
        this.residents = residents;
    }
  //------------------------   

    public String[] getFilms() {
        return films;
    }

    public void setFilms(String[] films) {
        this.films = films;
    }
  //------------------------   

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }
  //------------------------      
    
    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }
//------------------------        
    
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
//------------------------
}
