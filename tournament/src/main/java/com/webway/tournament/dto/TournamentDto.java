package com.webway.tournament.dto;

public class TournamentDto {

    private Long tourId;
    private String tourName;
    private Integer tourStatus;

    public Long getTourId() {
        return tourId;
    }

    public void setTourId(Long tourId) {
        this.tourId = tourId;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public Integer getTourStatus() {
        return tourStatus;
    }

    public void setTourStatus(Integer tourStatus) {
        this.tourStatus = tourStatus;
    }
}
