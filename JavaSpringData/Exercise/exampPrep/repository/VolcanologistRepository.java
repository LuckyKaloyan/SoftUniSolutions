package softuni.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softuni.exam.models.entity.Volcanologist;

import java.util.Optional;

@Repository
public interface VolcanologistRepository extends JpaRepository<Volcanologist, Integer> {


    Optional<Volcanologist> findByFirstName(String firstName);

    Optional<Volcanologist> findByLastName(String lastName);
}
