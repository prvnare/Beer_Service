package com.prvn.spring.ms.brew.beerservice.controller;

import com.prvn.spring.ms.brew.beerservice.model.BeerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * File    : BeerController
 * Created : 15/05/20
 * Last Changed  : 15/05/20 6:57 PM Fri
 * Author  : apple
 * History :
 * Initial impound
 */
@Validated
@RestController
@RequestMapping("/api/v1/beerService")
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable String beerId) {
        //Todo : Add Service implementations
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BeerDto> handlePost(@Valid @RequestBody BeerDto beerDto) {
        //Todo : Add Service implementations
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity handleUpdate(@PathVariable String beerId, @Valid @RequestBody BeerDto beerDto) {
        //Todo : Add Service implementations
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location" ,"/api/v1/beerService"+"BeerID goes here");
        return new ResponseEntity<>(headers, HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    public ResponseEntity<BeerDto> handleDelete(@PathVariable String beerId) {
        //Todo : Add Service implementations
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.NO_CONTENT);
    }
}
