package com.epi.parkingcontrol.services;

import com.epi.parkingcontrol.models.ParkingSpotModel;
import com.epi.parkingcontrol.repositores.ParkingSpotRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ParkingSpotService {

    final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }
    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel){
        return parkingSpotRepository.save(parkingSpotModel);
    }

    public boolean existsByLicensePlateCar(String lincesePlateCar) {
        return parkingSpotRepository.existsBylincesePlateCar(lincesePlateCar);
    }

    public boolean existsByParkingSpotNumber(String parkingSportNumber) {
        return parkingSpotRepository.existsByparkingSportNumber(parkingSportNumber );
    }

    public boolean existsByApartmentAndBlock(String apartment, String block) {
        return parkingSpotRepository.existsByapartmentAndBlock(apartment ,block );
    }
    public List<ParkingSpotModel> findAll(){
        return parkingSpotRepository.findAll();
    }

    public Optional<ParkingSpotModel> findById(UUID id) {
        return parkingSpotRepository.findById(id);
    }
    @Transactional
    public void delete(ParkingSpotModel parkingSpotModel) {
        parkingSpotRepository.delete(parkingSpotModel);
    }
}
