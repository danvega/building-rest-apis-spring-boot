package dev.danvega.streamsschedule.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class MutableLiveStream {

    private String id;
    private String title;
    private String description;
    private String url;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public MutableLiveStream() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MutableLiveStream that = (MutableLiveStream) o;
        return id.equals(that.id) && title.equals(that.title) && Objects.equals(description, that.description) && Objects.equals(url, that.url) && Objects.equals(startDate, that.startDate) && Objects.equals(endDate, that.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, url, startDate, endDate);
    }

    @Override
    public String toString() {
        return "LiveStream{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                ", startDate=" + startDate +
                ", endTime=" + endDate +
                '}';
    }
}
