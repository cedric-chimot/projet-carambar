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
     * @param content la blague à ajouter
     * @return la nouvelle blague
     */
    public Blagues save(String content) {
        Blagues blague = new Blagues(content);
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
        // Récupérer toutes les blagues de la base de données
        List<Blagues> blagues = blaguesRepository.findAll();

        // Vérifier si la liste des blagues n'est pas vide
        if (!blagues.isEmpty()) {
            // Générer un index aléatoire entre 0 et la taille de la liste
            int randomIndex = (int) (Math.random() * blagues.size());

            // Retourner l'élément de la liste à l'index généré
            return Optional.of(blagues.get(randomIndex));
        }

        // Si la liste est vide, retourner un Optional vide
        return Optional.empty();
    }

}
