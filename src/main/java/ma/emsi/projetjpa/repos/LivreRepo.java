package ma.emsi.projetjpa.repos;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import antlr.collections.List;
import ma.emsi.projetjpa.entities.Livre;

public interface LivreRepo  {
public Collection<Livre> getAllLivres();
public Livre getLivreById(int id);
public Livre addLivre(Livre l);
public Livre updateLivre(Livre l);
public Livre deleteLivre(Livre l);
}
