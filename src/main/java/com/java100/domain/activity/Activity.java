package com.java100.domain.activity;

import com.java100.domain.activity.type.Type;
import com.java100.manager.utils.InstantUtils;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

public class Activity {
    
    private String id;
    private Instant date;
    private String description;
    private float value;
    private Type type;
    private Instant creatAt;
    private Instant updateAt;

    private Activity(
        final String anId,
        final Instant aDate,
        final String aDescription,
        final float aValue,
        final Type aType,
        final Instant aCreatedAt,
        final Instant anUpdatedAt
    ){
        this.id = anId;
        this.date = aDate;
        this.description = aDescription;
        this.value = aValue;
        this.type = aType;
        this.creatAt = aCreatedAt;
        this.creatAt = anUpdatedAt;
    }

    public static Activity newActivity(
        final Instant aDate, 
        final String aDescription, 
        final float aValue,
        final Type aType
    ) {
        return new Activity(
            UUID.randomUUID().toString().toLowerCase(),
            aDate,
            aDescription,
            aValue,
            aType,
            InstantUtils.now(),
            Instant.now().truncatedTo(ChronoUnit.MICROS)
        );
    } 

    public static Activity with(
        final String anId,
        final Instant aDate,
        final String aDescription,
        final float aValue,
        final Type aType,
        final Instant aCreatedAt,
        final Instant anUpdatedAt
    ) {
        return new Activity(
            anId, 
            aDate, 
            aDescription, 
            aValue, aType, 
            aCreatedAt, 
            anUpdatedAt
        );
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Instant getCreatAt() {
        return creatAt;
    }

    public void setCreatAt(Instant creatAt) {
        this.creatAt = creatAt;
    }

    public Instant getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Instant updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "Activity [id=" + id + ", date=" + date + ", description=" + 
            description + ", value=" + value + ", type="
            + type + ", creatAt=" + creatAt + ", updateAt=" + updateAt + "]"
        ;
    }
    
}
