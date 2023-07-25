package ru.practicum.main.dto.user;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserDto {
     Long id;
    @NotBlank
     String name;
    @Email
     String email;
}
