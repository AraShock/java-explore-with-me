package ru.practicum.main.models;


import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.practicum.main.enums.RequestStatus;

import javax.persistence.*;
import java.time.LocalDateTime;


@Getter
@Setter
@Entity
@Table(name = "requests", schema = "public")
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;
     LocalDateTime created;
     Long event;
     Long requester;
    @Enumerated(EnumType.STRING)
     RequestStatus status;

}
