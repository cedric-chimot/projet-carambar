package fr.cch.blagues_carambar.service;

import fr.cch.blagues_carambar.entity.Blagues;
import fr.cch.blagues_carambar.repository.BlaguesRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BlaguesService {

    private final BlaguesRepository blaguesRepository;

    public BlaguesService(BlaguesRepository blaguesRepository) {
        this.blaguesRepository = blaguesRepository;
    }

    /**
     * Méthode pour ajouter une blague
     * @param blague la blague à ajouter
     * @return la nouvelle blague
     */
    public Blagues save(Blagues blague) {
        return blaguesRepository.save(blague);
    }

    /**
     * Méthode pour trouver toutes les blagues
     * @return la liste des blagues
     */
    public List<Blagues> findAllBlagues() {
        return blaguesRepository.findAll();
    }

    /**
     * Méthode pour trouver une blague par son id
     * @param id l'id recherché
     * @return la blague trouvée
     */
    public Blagues findBlagueById(Long id) {
        return blaguesRepository.findById(id)
                .orElseThrow(() -> new NullPointerException("Blague non trouvée ou inexistante" + id));
    }

    /**
     * Méthode pour afficher une blague aléatoirement
     * @return une blague aléatoire
     */
    public Optional<Blagues> findRandom() {
        return blaguesRepository.findRandomBlague();
    }
}
