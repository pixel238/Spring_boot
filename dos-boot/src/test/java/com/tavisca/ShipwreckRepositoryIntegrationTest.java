package com.tavisca;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tavisca.model.Shipwreck;
import com.tavisca.repository.ShipwreckRepository;

@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(App.class) 
//Depreciated annotation please use the below one. 
@SpringBootTest(classes = App.class)
public class ShipwreckRepositoryIntegrationTest {

	@Autowired
	private ShipwreckRepository shipwreckRepository;

	@Test
	public void testFindAll() {
		List<Shipwreck> wrecks = shipwreckRepository.findAll();
		assertThat(wrecks.size(), is(greaterThanOrEqualTo(0)));
	}
}
