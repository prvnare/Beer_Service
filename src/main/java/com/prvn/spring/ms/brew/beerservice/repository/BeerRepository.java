package com.prvn.spring.ms.brew.beerservice.repository;

import com.prvn.spring.ms.brew.beerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * File    : BeerRepository
 * Created : 16/05/20
 * Last Changed  : 16/05/20 7:56 PM Sat
 * Author  : apple
 * History :
 * Initial impound
 */
public interface BeerRepository  extends PagingAndSortingRepository<Beer,UUID> {
}
