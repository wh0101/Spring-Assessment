package org.generation.SpringAssessment.repository.entity;

import java.time.LocalDateTime;

import org.generation.SpringAssessment.controller.dto.ItemDto;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String title;
    private String description;
    private LocalDateTime targetDate;

    private Integer taskId;

    public Item(){}

    public Item(ItemDto itemDto)
    {
        this.title = itemDto.getTitle();
        this.description = itemDto.getDescription();
        this.targetDate = itemDto.getTargetDate();
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

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    @Override
    public String toString() {
        return "Item{" + "title=" + title + ", description='" + description + '\'' + ", targetDate='" + targetDate + '\'' + ", taskId='"
                + taskId + '}';
    }
}
