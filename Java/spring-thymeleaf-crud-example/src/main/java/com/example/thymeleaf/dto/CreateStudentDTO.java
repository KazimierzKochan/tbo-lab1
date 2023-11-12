package com.example.thymeleaf.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;

import java.time.LocalDate;

@Getter
@Setter
public class CreateStudentDTO {

    @NotEmpty(message = "{NotEmpty.name}")
	@Pattern(regexp = "[a-zA-Z -]+", message = "Name contains forbidden characters")
    @Size(min = 2, max = 100, message = "Name can be up to 100 characters long")
    private String name;

    @Email
    @NotEmpty(message = "{NotEmpty.email}")
    private String email;

    @NotNull(message = "{NotNull.birthday}")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    @NotEmpty(message = "{NotEmpty.zipCode}")
	@Pattern(regexp = "[d-]+", message = "ZIP Code contains forbidden characters")
	@Size(min = 8, max = 8, message = "ZIP Code can be up to 8 characters long")
    private String zipCode;

    @NotEmpty(message = "{NotEmpty.street}")
	@Pattern(regexp = "[a-zA-Z0-9 ]+", message = "Street contains forbidden characters")
	@Size(min = 2, max = 40, message = "Street can be up to 40 characters long")
    private String street;

    @NotEmpty(message = "{NotEmpty.number}")
    private String number;

    private String complement;

    @NotEmpty(message = "{NotEmpty.district}")
	@Pattern(regexp = "[a-zA-Z -]+", message = "District contains forbidden characters")
    @Size(min = 2, max = 40, message = "District can be up to 40 characters long")
    private String district;

    @NotEmpty(message = "{NotEmpty.city}")
	@Pattern(regexp = "[a-zA-Z -]+", message = "City contains forbidden characters")
    @Size(min = 2, max = 40, message = "City can be up to 40 characters long")
    private String city;

    @NotEmpty(message = "{NotEmpty.state}")
	@Pattern(regexp = "[a-zA-Z ]+", message = "City contains forbidden characters")
    @Size(min = 2, max = 40, message = "City can be up to 40 characters long")
    private String state;

}
