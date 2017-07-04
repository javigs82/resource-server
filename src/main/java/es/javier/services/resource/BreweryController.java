/*
 * Copyright 2012-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package es.javier.services.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.javier.services.domain.Brewery;
import es.javier.services.resource.builder.EntityToDtoBuilder;
import es.javier.services.resource.dto.BreweryDto;
import es.javier.services.service.BreweryService;

/**
 * Restful class controller to manage Brewery API
 * 
 * @author j.garcia.sanchez
 * 
 */
@RestController
@RequestMapping("/brewery")
public class BreweryController {

	@Autowired
	private EntityToDtoBuilder dtoBuilder;

	@Autowired
	private BreweryService breweryService;

	/**
	 * This method returns a brewery JSON by id given
	 * 
	 * @param id
	 * @return BreweryDto
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<BreweryDto> getById(@PathVariable("id") String id) {
		Brewery brewery = this.breweryService.find(id);
		if (brewery == null) {
			return new ResponseEntity<BreweryDto>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<BreweryDto>(this.dtoBuilder.buildBreweryDto(brewery), HttpStatus.OK);
	}
	
	@RequestMapping( method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<BreweryDto>> getAll() {
		List<Brewery> breweryList = this.breweryService.getAll();
		List<BreweryDto> dtoList = new ArrayList<>();
		for (Brewery brewery : breweryList){
			dtoList.add(this.dtoBuilder.buildBreweryDto(brewery));
		}

		return new ResponseEntity<List<BreweryDto>>(dtoList, HttpStatus.OK);
	}


}
