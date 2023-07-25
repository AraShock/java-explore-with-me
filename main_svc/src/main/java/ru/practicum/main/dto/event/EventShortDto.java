package ru.practicum.main.dto.event;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.practicum.main.dto.user.UserShortDto;
import ru.practicum.main.dto.category.CategoryDto;
import ru.practicum.main.constants.Pattern;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EventShortDto {
     Long id;
     String annotation;
     CategoryDto category;
     Long confirmedRequests;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = Pattern.DATE)
     LocalDateTime eventDate;
     UserShortDto initiator;
     Boolean paid;
     String title;
     Long views;
}
