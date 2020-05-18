package com.prvn.spring.ms.brew.beerservice.bootstarp;

import com.prvn.spring.ms.brew.beerservice.domain.Beer;
import com.prvn.spring.ms.brew.beerservice.model.BeerStyle;
import com.prvn.spring.ms.brew.beerservice.repository.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * File    : BeerLoader
 * Created : 16/05/20
 * Last Changed  : 16/05/20 8:06 PM Sat
 * Author  : apple
 * History :
 * Initial impound
 */

// Loads the data on context loading time
@Component
public class BeerLoaderCommandLineRunner implements CommandLineRunner {

    private final BeerRepository repository;

    public BeerLoaderCommandLineRunner(BeerRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (repository.count() == 0) {
            repository.save(Beer.builder()
                    .beerName("KINGFISHER EXTRA STRONG BEER")
                    .beerStyle(BeerStyle.LARGE)
                    .price(new BigDecimal(12.93))
                    .upc("8901020142324")
                    .quantityToBrew(200)
                    .brand("KingFisher")
                    .brandCode("KFESC")
                    .build());
            repository.save(Beer.builder()
                    .beerName("KINGFISHER PREMIER LAGER BEER")
                    .beerStyle(BeerStyle.MEDIUM)
                    .price(new BigDecimal(17.93))
                    .upc("8901020141006")
                    .quantityToBrew(100)
                    .brand("KingFisher")
                    .brandCode("KFPB")
                    .build());
        }
        System.out.println("LoadOn startUp : " + repository.count()  );
    }
}
