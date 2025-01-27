package fr.cch.blagues_carambar.repository;

import fr.cch.blagues_carambar.entity.Blagues;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface BlaguesRepository extends JpaRepository<Blagues, Long> {

    /**
     * Requête pour afficher une blague aléatoirement
     * @return une blague aléatoire
     */
    @Query(value = "SELECT * FROM blagues ORDER BY RANDOM() LIMIT 1", nativeQuery = true)
    Optional<Blagues> findRandomBlague();

}
