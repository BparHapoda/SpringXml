package ru.boronin.spring.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="people")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Owner {
    @Id
    private int id;
    private String name;
    private String surname;
    private String sursurname;
    private String phone;
    private String city;
    private String region;
    private String street;
    private String house;
    private String korpus;
    private String flate;

    private String passportSeria;
    private String passportNumber;

}
