package ru.practicum.main.dto.event;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.practicum.main.enums.StateActionForAdmin;
import ru.practicum.main.models.Location;
import ru.practicum.main.constants.Pattern;

import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UpdateEventAdminDto {
    @Size(min = 3, max = 500)
     String annotation;
     Long category;
    @Size(min = 20, max = 2000)
     String description;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = Pattern.DATE)
     LocalDateTime eventDate;
     Location location;
     Boolean paid;
     Long participantLimit;
     Boolean requestModeration;
     StateActionForAdmin stateAction;
    @Size(min = 2, max = 120)
     String title;
}

