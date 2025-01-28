package fr.cch.blagues_carambar.repository;

import fr.cch.blagues_carambar.entity.Blagues;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlaguesRepository extends JpaRepository<Blagues, Long> {

}
