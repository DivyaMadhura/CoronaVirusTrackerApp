package com.app.coronaVirusTracker.models;

public class LocationStats {
    private String state;
    private String country;
    private String totalCasesCount;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTotalCasesCount() {
        return totalCasesCount;
    }

    public void setTotalCasesCount(String totalCasesCount) {
        this.totalCasesCount = totalCasesCount;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", totalCasesCount='" + totalCasesCount + '\'' +
                '}';
    }
}
