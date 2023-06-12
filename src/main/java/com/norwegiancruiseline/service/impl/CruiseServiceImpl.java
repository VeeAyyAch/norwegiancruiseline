package com.norwegiancruiseline.service.impl;

import com.norwegiancruiseline.entities.Cruise;
import com.norwegiancruiseline.payload.CruiseSearchCriteria;
import com.norwegiancruiseline.repository.CruiseRepository;
import com.norwegiancruiseline.service.CruiseService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CruiseServiceImpl implements CruiseService {

    private final CruiseRepository cruiseRepository;

    public CruiseServiceImpl(CruiseRepository cruiseRepository) {
        this.cruiseRepository = cruiseRepository;
    }

    public List<Cruise> findCruise(CruiseSearchCriteria searchCriteria) {
        return cruiseRepository.findByDepartureCityAndArrivalCityAndDepartureDate(
                searchCriteria.getDepartureCity(),
                searchCriteria.getArrivalCity(),
                searchCriteria.getDepartureDate()
        );
    }


}
