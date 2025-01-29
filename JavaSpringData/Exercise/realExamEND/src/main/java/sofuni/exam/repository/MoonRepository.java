package sofuni.exam.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sofuni.exam.models.entity.Moon;

import java.util.List;
import java.util.Optional;

@Repository
public interface MoonRepository  extends JpaRepository<Moon, Long> {


    Optional<Moon> findByName(String name);

    List<Moon> findByRadiusBetween(double radiusAfter, double radiusBefore);

    List<Moon> findByRadiusBetweenOrderByNameAsc(double radiusAfter, double radiusBefore);
}
