package com.prvn.spring.ms.brew.beerservice.domain;

import com.prvn.spring.ms.brew.beerservice.model.BeerStyle;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * File    : Beer
 * Created : 16/05/20
 * Last Changed  : 16/05/20 7:46 PM Sat
 * Author  : apple
 * History :
 * Initial impound
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class Beer {

    //## Fields ##
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(length = 36, columnDefinition = "varchar", updatable = false, nullable = false)
    private UUID id;
    @Version
    private Long version;
    @CreationTimestamp
    @Column(updatable = false)
    private OffsetDateTime createdDate;
    @UpdateTimestamp
    private OffsetDateTime modifiedDate;
    private String beerName;
    private BeerStyle beerStyle;
    @Column(unique = true)
    private String upc;
    private BigDecimal price;
    private Integer quantityOnHand;
    private Integer quantityToBrew;
    private String brand;
    private String brandCode;
}
