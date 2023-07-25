package ru.practicum.main.dto.event;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.practicum.main.constants.Pattern;
import ru.practicum.main.dto.user.UserShortDto;
import ru.practicum.main.dto.category.CategoryDto;
import ru.practicum.main.enums.EventState;
import ru.practicum.main.models.Location;

import java.time.LocalDateTime;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EventFullDto {
     String annotation;
     CategoryDto category;
     Integer confirmedRequests;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = Pattern.DATE)
     String createdOn;
     String description;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = Pattern.DATE)
     LocalDateTime eventDate;
     Long id;
     UserShortDto initiator;
     Location location;
     Boolean paid;
     Long participantLimit;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = Pattern.DATE)
     LocalDateTime publishedOn;
     Boolean requestModeration;
     EventState state;
     String title;
     Long views;
}
