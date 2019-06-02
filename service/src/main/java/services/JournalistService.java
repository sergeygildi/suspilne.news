package services;

import org.springframework.stereotype.Service;
import services.repository.model.Journalist;

import java.util.List;

@Service
public interface JournalistService {

    Journalist createNewJournalist(Journalist journalist);

    void deleteJournalist(long id);

    Journalist getById(long id);

//    Iterable<Journalist> getByFirstName(String firstName);

//    Iterable<Journalist> getByLastName(String lastName);

    Journalist updateJournalist(Journalist journalist, long id);

    List<Journalist> getAll();
}
