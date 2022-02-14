package dev.danvega.streamsschedule.model;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

public record LiveStream(

        String id,
        @NotEmpty(message = "Stream title is required")
        String title,
        String description,
        String url,
        LocalDateTime startDate,
        LocalDateTime endDate

) {

}
