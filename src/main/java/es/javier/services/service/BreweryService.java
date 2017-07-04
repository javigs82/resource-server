package es.javier.services.service;

import java.util.List;

import es.javier.services.domain.Brewery;

public interface BreweryService {

    Brewery find(String id);
    List<Brewery> getAll();

}
