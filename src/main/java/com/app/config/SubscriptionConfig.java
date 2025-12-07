package com.app.config;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Component
@ConfigurationProperties(prefix = "subscription")
@Validated
public class SubscriptionConfig {

    @Min(1)
    private int userId;

    @NotBlank
    private String userName;

    @NotBlank
    private String plan;

    private int[] watchTimeHours;
    private List<String> genresPreferred;
    private Set<String> activeDevices;

    private Map<String, Integer> ratings;

    @NotNull
    private LastWatched lastWatched;

    // Nested class
    public static class LastWatched {
        private String movie;
        private String duration;

        public String getMovie() { return movie; }
        public void setMovie(String movie) { this.movie = movie; }

        public String getDuration() { return duration; }
        public void setDuration(String duration) { this.duration = duration; }
    }

    // Getters & setters
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }

    public String getPlan() { return plan; }
    public void setPlan(String plan) { this.plan = plan; }

    public int[] getWatchTimeHours() { return watchTimeHours; }
    public void setWatchTimeHours(int[] watchTimeHours) { this.watchTimeHours = watchTimeHours; }

    public List<String> getGenresPreferred() { return genresPreferred; }
    public void setGenresPreferred(List<String> genresPreferred) { this.genresPreferred = genresPreferred; }

    public Set<String> getActiveDevices() { return activeDevices; }
    public void setActiveDevices(Set<String> activeDevices) { this.activeDevices = activeDevices; }

    public Map<String, Integer> getRatings() { return ratings; }
    public void setRatings(Map<String, Integer> ratings) { this.ratings = ratings; }

    public LastWatched getLastWatched() { return lastWatched; }
    public void setLastWatched(LastWatched lastWatched) { this.lastWatched = lastWatched; }
}
