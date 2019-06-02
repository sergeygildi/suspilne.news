package services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.JournalistRepo;
import services.JournalistService;
import services.repository.exceptions.EmployeeNotFoundException;
import services.repository.model.Journalist;

import java.util.List;

@Service
public class JournalistServiceImpl implements JournalistService {

    private final JournalistRepo repo;

    @Autowired
    public JournalistServiceImpl(JournalistRepo repo) {
        this.repo = repo;
    }

    @Override
    public Journalist createNewJournalist(Journalist journalist) {
        return repo.save(journalist);
    }

    @Override
    public void deleteJournalist(long id) {
        repo.deleteById(id);
    }

    @Override
    public Journalist getById(long id) {
        return repo.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }

//    @Override
//    public List<Journalist> getByFirstName(String firstName) {
//        return null;
////        return repo.findByFullName_FirstName(firstName);
//    }
//
//    @Override
//    public List<Journalist> getByLastName(String lastName) {
//        return null;
//    }

    @Override
    public Journalist updateJournalist(Journalist journalistDetail, long id) {
        Journalist journalist = repo.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
//        journalist.setFullName(journalistDetail.getFullName());
//        journalist.setAddress(journalistDetail.getAddress());
        journalist.setEmail(journalistDetail.getEmail());
        journalist.setPhone(journalistDetail.getPhone());
        final Journalist updatedJournalist = repo.save(journalist);
        return repo.save(updatedJournalist);
    }

    @Override
    public List<Journalist> getAll() {
        return repo.findAll();
    }
}
