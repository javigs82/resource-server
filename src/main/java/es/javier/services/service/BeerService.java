package es.javier.services.service;

import java.util.List;

import es.javier.services.domain.Beer;

public interface BeerService {

	List<Beer> getAll();
    List<Beer> getAll(int limit);
}
