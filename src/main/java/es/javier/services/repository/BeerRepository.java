package es.javier.services.repository;

import java.util.List;

import org.springframework.data.couchbase.core.query.Query;
import org.springframework.data.repository.CrudRepository;

import es.javier.services.domain.Beer;

public interface BeerRepository extends CrudRepository<Beer, String> {
	
	  @Query ("#{#n1ql.selectEntity}  where category LIKE '%American%' limit 1000")
	  List<Beer> getAll(int limit);
	  
	  List<Beer> findBy(int limit);
 
}
