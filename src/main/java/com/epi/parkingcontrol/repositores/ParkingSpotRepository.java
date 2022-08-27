package com.epi.parkingcontrol.repositores;

import com.epi.parkingcontrol.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

    boolean existsBylincesePlateCar(String licensePlateCar);
    boolean existsByparkingSportNumber(String parkingSpotNumber);

    boolean existsByapartmentAndBlock(String apartment, String block);
}
