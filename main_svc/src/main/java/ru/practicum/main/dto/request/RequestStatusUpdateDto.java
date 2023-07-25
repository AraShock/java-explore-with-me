package ru.practicum.main.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.practicum.main.enums.RequestStatusToUpdate;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RequestStatusUpdateDto {
     List<Long> requestIds;
     RequestStatusToUpdate status;
}
