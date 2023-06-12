package com.norwegiancruiseline.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Cruise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cruiseName;
    private String departureCity;
    private String arrivalCity;

    @Temporal(TemporalType.DATE)
    private Date departureDate;

    private int cruiseDuration;

    // Constructors

    public Cruise(String cruiseName, String departureCity, String arrivalCity, Date departureDate, int cruiseDuration) {
        this.cruiseName = cruiseName;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.departureDate = departureDate;
        this.cruiseDuration = cruiseDuration;
    }
}

