package com.norwegiancruiseline.repository;

import com.norwegiancruiseline.entities.Bookings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingsRepository extends JpaRepository<Bookings, Long> {
    // You can add custom repository methods here if needed
}
