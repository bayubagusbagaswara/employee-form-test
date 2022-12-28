package com.bayu.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserRequest {

    @Email(message = "Email must be formatted")
    private String email;

    @Size(min = 5, message = "Password minimum length is 5")
    private String password;
}
