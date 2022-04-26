package com.hcl.canceltrx.swagger;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(path = "/doc",name="swagger",produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
public class SwaggerController{


	@Value("${server.port}")
    int randomServerPort;

	@RequestMapping(path = "/swagger.json", method = RequestMethod.GET)
	public String getJson()
	{
	    RestTemplate restTemplate = new RestTemplate();
	    final String baseUrl = "http://localhost:" + randomServerPort + "/v2/swagger.json";
	    URI uri = null;
		try {
			uri = new URI(baseUrl);
		} catch (URISyntaxException e) {
		}
	 
	    ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
	    String json=result.getBody().replace("<Json>", "").replace("</Json>", "");
		return json;
	}
}
