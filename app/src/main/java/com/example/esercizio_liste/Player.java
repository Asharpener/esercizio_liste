package com.example.esercizio_liste;

public class Player {
    private String name;
    private Integer lifePoints;
    private Integer experiencePoints;

    public Player (String name, Integer lifePoints, Integer experiencePoints) {
        this.name = name;
        this.lifePoints = (lifePoints);
        this.experiencePoints = (experiencePoints);
    }

    public String getName() {
        return name;
    }

    public Integer getLifePoints() {
        return lifePoints;
    }

    public Integer getExperiencePoints() {
        return experiencePoints;
    }


}
