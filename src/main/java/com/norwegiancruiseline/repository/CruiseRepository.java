
package com.norwegiancruiseline.repository;

import com.norwegiancruiseline.entities.Cruise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface CruiseRepository extends JpaRepository<Cruise, Long> {
    List<Cruise> findByDepartureCityAndArrivalCityAndDepartureDate(String departureCity, String arrivalCity, Date departureDate);
}

