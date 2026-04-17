package samuelvalentini.u5d10p.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import samuelvalentini.u5d10p.entity.Trip;

public interface TripRepository extends JpaRepository<Trip, Long> {
}
