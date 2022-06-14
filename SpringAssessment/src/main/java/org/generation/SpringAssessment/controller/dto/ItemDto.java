package org.generation.SpringAssessment.controller.dto;

import java.time.LocalDateTime;

public class ItemDto {
    private String title;
    private String description;
    private LocalDateTime targetDate;


    public ItemDto(String title, String description, LocalDateTime targetDate)
    {
        this.title = title;
        this.description = description;
        this.targetDate = targetDate;
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

    public LocalDateTime getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDateTime targetDate) {
        this.targetDate = targetDate;
    }



}
