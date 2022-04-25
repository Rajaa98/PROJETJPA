package ma.emsi.projetjpa.service;

import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Component;

import ma.emsi.projetjpa.entities.Livre;
import ma.emsi.projetjpa.repos.LivreRepo;
@Component
public class LivreService implements LivreRepo{
    Hashtable<Integer , Livre> livres=new Hashtable<Integer , Livre>();
	

	@Override
	public Collection<Livre> getAllLivres() {
		return livres.values();
	}

	@Override
	public Livre getLivreById(int id) {
		
		return livres.get(id);
	}

	@Override
    public Livre addLivre(Livre l) {livres.put(l.getId(), l);
    return l;
	}

	@Override
	public Livre updateLivre(Livre l) {livres.put(l.getId(), l);
	return l;
	}

	@Override
	public Livre deleteLivre(Livre l) {livres.put(l.getId(), l);
	return l;
	}

}
