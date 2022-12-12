package Entities;

import Enums.VehicleType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="brand")
@AllArgsConstructor
@NoArgsConstructor
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(length = 50, nullable = false)
    private String name;
    @Column(name = "seats",length = 1)
    private int seats;
    @Column(name ="manuel_auto")
    private boolean manuelAuto;
    @Column(name="vehicle_type")
    private VehicleType vehicleType;
}
