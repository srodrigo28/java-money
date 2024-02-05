package com.java100.domain.activity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.java100.domain.activity.type.Type.ActivityType;
import com.java100.manager.utils.InstantUtils;

public class ActivityTest {
    
    // Given
    // When
    // Then
    @Test
    public void givenActivity(){

        final var aDescription = "A description";
        final var aValue = 3.55f;
        final var aDate = InstantUtils.now();
        final var aType = ActivityType.REVENUE;

        final var anActivity = Activity.newActivity(null, null, 0, null);

        assertNotNull(anActivity);
        assertNotNull(anActivity.getId());
        assertTrue(anActivity.getId().length() == 36);
        assertEquals(aDescription, anActivity.getDescription());
        assertEquals(aDate, anActivity.getDate());
        assertEquals(aValue, anActivity.getValue(), 0.001);
        assertEquals(aType, anActivity.getType());
        assertNotNull(anActivity.getCreatAt());
        assertNotNull(anActivity.getUpdateAt());
    }
}