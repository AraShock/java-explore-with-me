package ru.practicum.main.dto.compilation;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import ru.practicum.main.dto.event.EventShortDto;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CompilationDto {
     Long id;
     Boolean pinned;
     String title;
     List<EventShortDto> events;
}
