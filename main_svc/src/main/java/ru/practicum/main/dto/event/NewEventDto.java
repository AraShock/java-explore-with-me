package ru.practicum.main.dto.event;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.practicum.main.models.Location;
import ru.practicum.main.constants.Pattern;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NewEventDto {
    @NotNull
    @Size(min = 20, max = 200)
    private String annotation;
    @NotNull
    private Long category;
    @NotNull
    @Size(min = 20, max = 7000)
    private String description;
    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = Pattern.DATE)
    @Future
    private LocalDateTime eventDate;
    @NotNull
    private Location location;
    private Boolean paid = false;
    private Long participantLimit = 0L;
    private Boolean requestModeration = true;
    @NotNull
    @Size(min = 3, max = 120)
    private String title;
}
