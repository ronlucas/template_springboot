package com.lron.template;

import com.lron.template.entities.ExampleData;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TemplateApplicationTests extends TemplateIntegrationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate testRestTemplate;
	@Test
	void testExampleDataGetList() {
		ExampleData[] exampleData = this.testRestTemplate.getForObject("http://localhost:" + port + "/examples", ExampleData[].class);
		Assert.assertEquals("Batman",exampleData[0].getName());
		Assert.assertEquals("The Dark Knight",exampleData[0].getDescription());
	}

}
