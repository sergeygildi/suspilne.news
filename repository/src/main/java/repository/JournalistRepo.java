package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import services.repository.model.Journalist;

import java.util.Optional;

@Repository
public interface JournalistRepo extends JpaRepository<Journalist, Long> {

//    @Query("select u from journalists u where u.id = ?1")
//    @Transactional(readOnly = true)
    Optional<Journalist> findById(long id);

//    @Query("select u from journalists u where u.firstName = ?1")
//    @Transactional(readOnly = true)
//    List<Journalist> findByFullName_FirstName(String firstName);
//
//    @Query(value = "SELECT * FROM journalists WHERE lastName = ?1", nativeQuery = true)
//    List<Journalist> findByFullName_LastName(String lastName);
//
//    @Query("select u from journalists u where u.lastName = :lastName or u.firstName = :firstName")
//    @Transactional(readOnly = true)
//    List<Journalist> findByLastnameOrFirstname(@Param("firstName") String firstName, @Param("lastName") String lastName);
}