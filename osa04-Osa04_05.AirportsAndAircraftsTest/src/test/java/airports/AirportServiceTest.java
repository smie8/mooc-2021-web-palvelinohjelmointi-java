/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airports;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author samie
 */
@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest
public class AirportServiceTest {
    
    @Autowired
    private AirportService airportService;
    
    @Autowired
    private AirportRepository airportRepository;
    
    @Test
    public void testCreateAirport() throws Exception {
        Airport airport = new Airport("Air Port", "AIR");
        airportService.create(airport.getIdentifier(), airport.getName());
        
        assertTrue(airportRepository.findAll().contains(airport));
    }
    
    @Test
    public void testListAirportsTest() throws Exception {
        airportService.create("AIR1", "Air Port 1");
        airportService.create("AIR2", "Air Port 2");
        airportService.create("AIR3", "Air Port 3");

        assertEquals(3, airportService.list().size());
    }
    
    @Test
    public void testAirportAlreadyExistsWithSameName() throws Exception {
        String airportName = "AIR";
        airportService.create("Air Port 1", airportName);
        airportService.create("Air Port 2", airportName);
        System.out.println("_----------" + airportService.list());

        assertEquals(1, airportService.list().size());
    }
}
