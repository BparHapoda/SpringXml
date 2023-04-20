package ru.boronin.spring.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="cars")
public class Car {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "vin")
    private String vin;
    @Column(name = "model")
    private String model;
    @Column(name = "marka")
    private String marka;
    @Column(name = "gosNomer")
private String gosNomer;


}
