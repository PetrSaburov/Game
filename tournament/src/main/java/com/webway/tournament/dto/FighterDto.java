package com.webway.tournament.dto;

public class FighterDto {

    private Long fighterId;
    private String fighterName;
    private Double fighterAttack;
    private Double fighterDefence;
    private Double fighterHealth;
    private Integer fighterStatus;

    public Long getFighterId() {
        return fighterId;
    }

    public void setFighterId(Long fighterId) {
        this.fighterId = fighterId;
    }

    public String getFighterName() {
        return fighterName;
    }

    public void setFighterName(String fighterName) {
        this.fighterName = fighterName;
    }

    public Double getFighterAttack() {
        return fighterAttack;
    }

    public void setFighterAttack(Double fighterAttack) {
        this.fighterAttack = fighterAttack;
    }

    public Double getFighterDefence() {
        return fighterDefence;
    }

    public void setFighterDefence(Double fighterDefence) {
        this.fighterDefence = fighterDefence;
    }

    public Integer getFighterStatus() {
        return fighterStatus;
    }

    public void setFighterStatus(Integer fighterStatus) {
        this.fighterStatus = fighterStatus;
    }

    public Double getFighterHealth() {
        return fighterHealth;
    }

    public void setFighterHealth(Double fighterHealth) {
        this.fighterHealth = fighterHealth;
    }
}
