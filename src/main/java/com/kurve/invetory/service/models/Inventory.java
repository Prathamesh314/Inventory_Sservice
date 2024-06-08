package com.kurve.invetory.service.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "t_inventory")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String skuCode;
    public Integer quantity;

}
