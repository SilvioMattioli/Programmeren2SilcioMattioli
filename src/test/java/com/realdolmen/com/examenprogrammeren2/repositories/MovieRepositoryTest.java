package com.realdolmen.com.examenprogrammeren2.repositories;

import com.realdolmen.com.examenprogrammeren2.repositories.MovieRepository;
import com.realdolmen.com.examenprogrammeren2.domain.Movie;
import com.realdolmen.com.examenprogrammeren2.exceptions.NoQueryPossibleException;
import com.realdolmen.com.examenprogrammeren2.services.QueryHelper;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class MovieRepositoryTest extends QueryHelper {
    
    private static String URL = "jdbc:mysql://localhost:3306/movie_db_test?autoReconnect=true&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private MovieRepository repository;
    
    @Before
    public void init() {
        repository = new MovieRepository(URL);
    }
    
    @Test
    public void findTestSucces() throws Exception {
        MovieRepository movieRepository = new MovieRepository();
        List<Movie> movies = movieRepository.find(QueryHelper.findAll());
        assertFalse(movies.isEmpty());
    }
    
    
    //TODO maak een test voor MovieRepository.find()
    
    public void findTestWrongQueryThrowsNoQueryPossibleException() throws NoQueryPossibleException {
         String qry="SELECT tieeel FROM movies";
        MovieRepository movieRepository = new MovieRepository();
        List<Movie> movies = movieRepository.find(qry);
        //Geef als parameter de String "SELECT tieeel FROM movies" mee
        
        //Doe de nodige check om een succesvolle test te krijgen indien nodig
    }
    
}
