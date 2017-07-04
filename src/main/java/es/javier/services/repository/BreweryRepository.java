package es.javier.services.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import es.javier.services.domain.Brewery;

public interface BreweryRepository extends PagingAndSortingRepository<Brewery, String> {
}
