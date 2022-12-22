package com.project.rentACar.business.response;

import com.project.rentACar.enums.VehicleType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetBrandResponse {

    private String name;
    private int seats;
    private boolean manuelAuto;
    private VehicleType vehicleType;
}
