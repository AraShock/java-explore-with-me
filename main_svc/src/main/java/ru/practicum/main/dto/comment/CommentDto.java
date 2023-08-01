package ru.practicum.main.dto.comment;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import ru.practicum.main.constants.Pattern;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CommentDto {
     Long id;
     String text;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = Pattern.DATE)
     LocalDateTime created;
     String authorName;
     Long eventId;
}