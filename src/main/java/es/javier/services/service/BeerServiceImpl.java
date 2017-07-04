package es.javier.services.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.javier.services.domain.Beer;
import es.javier.services.repository.BeerRepository;

@Component("beerService")
public class BeerServiceImpl implements BeerService {

	private static final int DEFAULT_LIMIT = 100;

	@Autowired
	private BeerRepository beerRepository;

	@Override
	public List<Beer> getAll() {
		return getAll(DEFAULT_LIMIT);
	}

	@Override
	public List<Beer> getAll(int limit) {
		return this.beerRepository.getAll(limit);
	}

}
