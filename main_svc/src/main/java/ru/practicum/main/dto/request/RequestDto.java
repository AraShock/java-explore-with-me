package ru.practicum.main.dto.request;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.practicum.main.constants.Pattern;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RequestDto {
     Long id;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = Pattern.DATE)
     LocalDateTime created;
     Long event;
     Long requester;
     String status;
}
