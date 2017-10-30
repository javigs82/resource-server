package es.javier.services.resource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.javier.services.domain.Beer;
import es.javier.services.resource.builder.EntityToDtoBuilder;
import es.javier.services.resource.dto.BeerDto;
import es.javier.services.service.BeerService;

/**
 * Restful class controller
 * 
 * @author javigs82
 * 
 */
@RestController
@RequestMapping("/beer")
public class BeerController {

	@Autowired
	private EntityToDtoBuilder dtoBuilder;

	@Autowired
	private BeerService beerService;

	/**
	 * This method returns all beers
	 * 
	 * @return List<BeerDto>
	 */
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<BeerDto>> getAllBeers(@RequestParam (name = "limit") int limit) {
		Date start = new Date();
		List<Beer> beerList = this.beerService.getAll(limit);
		System.out.println("--Querylimit: " + limit);
		Date endQ = new Date();
		System.out.println("--Querytime: " + (endQ.getTime()-start.getTime() + " ms"));
		List<BeerDto> dtoList = new ArrayList<>();
		for (Beer beer : beerList) {
			dtoList.add(this.dtoBuilder.buildBeerDto(beer));
		}
		Date endAll = new Date();
		System.out.println("--Servicetime: " + (endAll.getTime()-start.getTime() + " ms"));
		return new ResponseEntity<>(dtoList, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<BeerDto>> getBeerTree(@RequestParam (name = "limit") int limit) {
		Date start = new Date();
		List<Beer> beerList = this.beerService.getAll(limit);
		System.out.println("--BeerTreeQuerylimit: " + limit);
		Date endQ = new Date();
		System.out.println("--BeerTreeQuerytime: " + (endQ.getTime()-start.getTime() + " ms"));
		List<BeerDto> dtoList = new ArrayList<>();
		for (Beer beer : beerList) {
			dtoList.add(this.dtoBuilder.buildBeerDto(beer));
		}
		Date endAll = new Date();
		System.out.println("--BeerTreeServicetime: " + (endAll.getTime()-start.getTime() + " ms"));
		return new ResponseEntity<>(dtoList, HttpStatus.OK);
	}

}
