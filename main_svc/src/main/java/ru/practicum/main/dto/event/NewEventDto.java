package ru.practicum.main.dto.event;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.practicum.main.models.Location;
import ru.practicum.main.constants.Pattern;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NewEventDto {
    @NotNull
    @Size(min = 3, max = 500)
     String annotation;
    @NotNull
     Long category;
    @NotNull
    @Size(min = 20, max = 2000)
     String description;
    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = Pattern.DATE)
     LocalDateTime eventDate;
    @NotNull
     Location location;
     boolean paid;
     int participantLimit;
     Boolean requestModeration;
    @NotNull
    @Size(min = 3, max = 120)
     String title;
}
