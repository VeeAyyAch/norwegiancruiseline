package com.norwegiancruiseline.service;

import com.norwegiancruiseline.entities.Cruise;
import com.norwegiancruiseline.payload.CruiseSearchCriteria;

import java.util.Date;
import java.util.List;

public interface CruiseService {
    List<Cruise> findCruise(CruiseSearchCriteria searchCriteria);

}

