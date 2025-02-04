package edu.okbu.cs1;

public class HealthData {
    int userAgeYears;
    int userAgeDays;
    int userAgeMins;
    int avgBeats = 72;

    public HealthData(int y, int d) {
        userAgeYears = y;
        userAgeDays = d;
    }

    public int ageInDays() {
        return userAgeYears * 365;
    }

    public int ageInMins() {
        return userAgeDays * 24 * 60;
    }

    public int totalHeartBeats() {
        return 28800 * avgBeats;
    }
}
