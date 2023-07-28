package ru.practicum.main.dto.event;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.practicum.main.enums.StateActionForAdmin;
import ru.practicum.main.models.Location;
import ru.practicum.main.constants.Pattern;

import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import org.springframework.lang.Nullable;
import javax.validation.constraints.Future;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UpdateEventAdminDto {
    @Nullable
    @Size(min = 20, max = 2000)
    private String annotation;
    @Nullable
    private Long category;
    @Nullable
    @Size(min = 20, max = 7000)
    private String description;
    @Nullable
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = Pattern.DATE)
    @Future
    private LocalDateTime eventDate;
    @Nullable
    private Location location;
    @Nullable
    private Boolean paid;
    @Nullable
    private Long participantLimit;
    @Nullable
    private Boolean requestModeration;
    @Nullable
    private StateActionForAdmin stateAction;
    @Size(min = 3, max = 120)
    private String title;
}

