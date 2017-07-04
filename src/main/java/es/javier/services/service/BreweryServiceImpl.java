package es.javier.services.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.javier.services.domain.Beer;
import es.javier.services.domain.Brewery;
import es.javier.services.repository.BreweryRepository;

@Component("breweryService")
public class BreweryServiceImpl implements BreweryService {

    @Autowired
    private BreweryRepository breweryRepository;

    @Override
    public Brewery find(String id) {
        return breweryRepository.findOne(id);
    }

	@Override
	public List<Brewery> getAll() {
		Iterator<Brewery> breweryIt = (Iterator<Brewery>) this.breweryRepository.findAll(); 
		List<Brewery> beerList = new ArrayList<>();
		breweryIt.forEachRemaining(beerList::add);
	    return beerList;
	}
}
