package com.kelompok2.survey_backend.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequestDto {
    private String username;
    private String password;
    private String role;
    private String fullName;
    private String email;
    private String phone;
    private String address;
    private String occupation;
    private String education;
    private String birthDate;
    private String gender;
}