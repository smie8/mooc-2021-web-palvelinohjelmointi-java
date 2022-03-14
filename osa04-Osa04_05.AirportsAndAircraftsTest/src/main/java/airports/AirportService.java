package airports;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirportService {

    @Autowired
    private AirportRepository airportRepository;

    public List<Airport> list() {
        return airportRepository.findAll();
    }

    public void create(String identifier, String name) {
        boolean airportNameExists = airportNameExists(name, airportRepository.findAll());
        
        if (!airportNameExists) {
            Airport a = new Airport();
            a.setIdentifier(identifier);
            a.setName(name);

            airportRepository.save(a); 
        }
    }
    
    public static boolean airportNameExists(String name, List<Airport> airports) {
        for (Airport airport : airports) {
            if (airport.getName().equals(name)) {
                return true;
            }
        }
        
        return false;
    }
}
