package testing;

import components.Application;
import components.Person;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

/**
 * Created by glenn on 9/13/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebIntegrationTest("server.port:9000")
public class PersonIntegrationTests {
    static final Logger logger =
            LoggerFactory.getLogger(PersonIntegrationTests.class);
    RestTemplate restTemplate = new TestRestTemplate();

    @Test
    public void testRest() throws Exception {
        ResponseEntity<Person> personEntity = restTemplate.getForEntity("http://localhost:9000/person.json", Person.class);
        Person entityBody = personEntity.getBody();
        Assert.assertNotNull(entityBody);
        logger.info("how are you doing!!!!");
        Assert.assertEquals(entityBody.getName(), "glenn");
    }
}
