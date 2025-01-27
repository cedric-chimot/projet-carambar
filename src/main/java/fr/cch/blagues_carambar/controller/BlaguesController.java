package fr.cch.blagues_carambar.controller;


import fr.cch.blagues_carambar.entity.Blagues;
import fr.cch.blagues_carambar.service.BlaguesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@RestController
@RequestMapping("/api/blagues")
@CrossOrigin
public class BlaguesController {

    private final BlaguesService blaguesService;

    public BlaguesController(BlaguesService blaguesService) {
        this.blaguesService = blaguesService;
    }

    /**
     * Méthode pour ajouter une blague
     * @param blague la blague à ajouter
     * @return la nouvelle blague
     */
    @PostMapping("/create")
    public Blagues ajouterBlague(@RequestBody Blagues blague) {
        return blaguesService.save(blague);
    }

    /**
     * Méthode pour trouver toutes les blagues
     * @return la liste des blagues
     */
    @GetMapping("/all")
    public List<Blagues> consulterBlagues() {
        return blaguesService.findAllBlagues();
    }

    /**
     * Méthode pour trouver une blague par son id
     * @param id l'id recherché
     * @return la blague trouvée
     */
    @GetMapping("/{id}")
    public Blagues findById(@PathVariable Long id) {
        return blaguesService.findBlagueById(id);
    }

    /**
     * Méthode pour afficher une blague aléatoirement
     * @return une blague aléatoire
     */
    @GetMapping("/random")
    public ResponseEntity<Blagues> getRandomBlague() {
        Optional<Blagues> blague = blaguesService.findRandom();
        return blague.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

}
