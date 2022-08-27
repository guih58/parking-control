package com.epi.parkingcontrol.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ParkingSportDTO {

    @NotBlank
    private String parkingSportNumber;

    @NotBlank
    @Size(max = 7)
    private String lincesePlateCar;

    @NotBlank
    private String brandCar;

    @NotBlank
    private String modelCar;

    @NotBlank
    private String colorCar;

    @NotBlank
    private String responsibleName;

    @NotBlank
    private String apartment;

    @NotBlank
    private String block;

    public String getParkingSportNumber() {
        return parkingSportNumber;
    }

    public void setParkingSportNumber(String parkingSportNumber) {
        this.parkingSportNumber = parkingSportNumber;
    }

    public String getLincesePlateCar() {
        return lincesePlateCar;
    }

    public void setLincesePlateCar(String lincesePlateCar) {
        this.lincesePlateCar = lincesePlateCar;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public String getResponsibleName() {
        return responsibleName;
    }

    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }
}
