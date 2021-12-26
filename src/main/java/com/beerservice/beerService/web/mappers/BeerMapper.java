package com.beerservice.beerService.web.mappers;

import com.beerservice.beerService.domain.Beer;
import com.beerservice.beerService.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
