package com.prvn.spring.ms.brew.beerservice.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * File    : BeerPagedList
 * Created : 15/05/20
 * Last Changed  : 15/05/20 6:27 PM Fri
 * Author  : apple
 * History :
 * Initial impound
 */

public class BeerPagedList extends PageImpl<BeerDto> {

    public BeerPagedList(List<BeerDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public BeerPagedList(List<BeerDto> content) {
        super(content);
    }
}
