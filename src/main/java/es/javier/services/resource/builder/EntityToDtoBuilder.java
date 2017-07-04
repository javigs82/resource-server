package es.javier.services.resource.builder;

import org.springframework.stereotype.Component;

import es.javier.services.domain.Beer;
import es.javier.services.domain.Brewery;
import es.javier.services.resource.dto.BeerDto;
import es.javier.services.resource.dto.BreweryDto;

@Component("entityToDtoBuilder")
public class EntityToDtoBuilder {

	public BreweryDto buildBreweryDto(Brewery brewery) {
		BreweryDto dto = null;
		if (brewery != null) {
			dto = new BreweryDto();
			dto.setName(brewery.getName());
			dto.setDescription(brewery.getDescription());
			dto.setCity(brewery.getCity());
		}
		return dto;
	}
	
	public BeerDto buildBeerDto (Beer beer){
		BeerDto dto = null;
		if (beer!=null){
			dto = new BeerDto();
			dto.setName(beer.getName());
			dto.setDescription(beer.getDescription());
			dto.setAbv(beer.getAbv());
			dto.setBreweryId(beer.getBrewery());
		}
		return dto;
	}

}
