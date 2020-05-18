package com.prvn.spring.ms.brew.beerservice.mapper;

import com.prvn.spring.ms.brew.beerservice.domain.Beer;
import com.prvn.spring.ms.brew.beerservice.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * File    : BeerMapper
 * Created : 18/05/20
 * Last Changed  : 18/05/20 3:42 PM Mon
 * Author  : apple
 * History :
 * Initial impound
 */
@Mapper(uses = DateMapper.class)
public interface BeerMapper {

    BeerDto beetToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto beerDto);

}
