package es.javier.services;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import es.javier.services.resource.dto.BeerDto;

/**
 * Test builder class for testing beer resources
 * 
 * @author javigs82
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
public class BeerApplicationBuilderTest {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Autowired
	TestRestTemplate restTemplate;

	@Test
	public void contextLoads() {
	}

	@Test
	public void getBeerById() throws Exception {

//		ResponseEntity<BeerDto> response = restTemplate.getForEntity("/beer/1", BeerDto.class);
//		assertEquals(response.getBody().getName(),"Hello World!");
		//assertEquals("Hello World!","Hello World!");

	}

}
