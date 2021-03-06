package com.jts.mediahunter.plugins.youtube.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Tony
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class YouTubeVideoList {

    @JsonProperty
    private String nextPageToken;

    private int totalResults;
    private int resultsPerPage;

    @JsonProperty("pageInfo")
    private void getPageInfo(Map<String, Integer> pageInfo) {
        this.totalResults = pageInfo.get("totalResults");
        this.resultsPerPage = pageInfo.get("resultsPerPage");
    }

    List<YouTubeVideo> videos;

    @JsonProperty("items")
    private void getItems(YouTubeVideo[] videos) {
        this.videos = new ArrayList<>();
        this.videos.addAll(Arrays.asList(videos));
    }

    public int getTotalResults() {
        return totalResults;
    }

    public int getResultsPerPage() {
        return resultsPerPage;
    }

    public List<YouTubeVideo> getVideos() {
        return this.videos;
    }

    public String getNextPageTogen() {
        return nextPageToken;
    }

}
