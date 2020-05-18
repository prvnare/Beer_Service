package com.prvn.spring.ms.brew.beerservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

/**
 * File    : BeerDto
 * Created : 15/05/20
 * Last Changed  : 15/05/20 6:02 PM Fri
 * Author  : apple
 * History :
 * Initial impound
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BeerDto {

    //## Fields ##
    @Null
    private UUID id;
    @Null
    private Long version;
    @Null
    private Timestamp createdDate;
    @Null
    private Timestamp modifiedDate;
    @NotBlank
    private String beerName;
    @NotBlank
    private BeerStyle beerStyle;
    @Positive
    @NotNull
    private String upc;
    @NotNull
    @Positive
    private BigDecimal price;
    @PositiveOrZero
    private Integer quantityOnHand;
    private Integer quantityToBrew;
    private String brand;
    private String brandCode;


}
