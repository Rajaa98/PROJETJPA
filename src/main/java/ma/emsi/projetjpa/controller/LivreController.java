package ma.emsi.projetjpa.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import  ma.emsi.projetjpa.entities.Livre;
import ma.emsi.projetjpa.repos.LivreRepo;
@RestController
public class LivreController {
	@Autowired
	LivreRepo livrerepo;
	@PostMapping("/Livre")
	public Livre addLivre(@RequestBody Livre L) {
	return livrerepo.addLivre(L);
	}
	@GetMapping("/Livre")
public Collection<Livre> getAllLivre( ) {
	return livrerepo.getAllLivres() ;
	}
	@GetMapping("/Livre/{id}")
public Livre getLivreById( @PathVariable int id) {
	return livrerepo.getLivreById(id);
	}
	@PutMapping("/Livre")
public Livre updateLivre( @RequestBody Livre L) {
	return livrerepo.updateLivre(L);
	}
	@GetMapping("/Livre")
public Livre deleteLivre( @RequestBody Livre L) {
	return livrerepo.deleteLivre(L);
	}
	

}
