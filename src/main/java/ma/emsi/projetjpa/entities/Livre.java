package ma.emsi.projetjpa.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;
@Data 

@Entity
public class Livre {
	public Livre(Integer id, String titre, String maisonEd, Date sortie, String auteur, Integer page, Integer iSBN,
			Date conslt, Boolean disponible) {
		super();
		this.id = id;
		Titre = titre;
		this.maisonEd = maisonEd;
		this.sortie = sortie;
		Auteur = auteur;
		Page = page;
		ISBN = iSBN;
		Conslt = conslt;
		Disponible = disponible;
	}

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Integer id;
	@Column(length =50, nullable= false)
	private String Titre;
	@Column( name= "MAISON D'EDITION",length =30, nullable= false)
	private String maisonEd;
	@Temporal(TemporalType.DATE)
	private Date sortie;
	private String Auteur;
	@Column( name= "NUMERO DE PAGE")
	private Integer Page;
	@Column(unique = true)
	private Integer ISBN;
	@Temporal(TemporalType.DATE) @CreationTimestamp
	private Date Conslt;
	
	private Boolean Disponible;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitre() {
		return Titre;
	}

	public void setTitre(String titre) {
		Titre = titre;
	}

	public String getMaisonEd() {
		return maisonEd;
	}

	public void setMaisonEd(String maisonEd) {
		this.maisonEd = maisonEd;
	}

	public Date getSortie() {
		return sortie;
	}

	public void setSortie(Date sortie) {
		this.sortie = sortie;
	}

	public String getAuteur() {
		return Auteur;
	}

	public void setAuteur(String auteur) {
		Auteur = auteur;
	}

	public Integer getPage() {
		return Page;
	}

	public void setPage(Integer page) {
		Page = page;
	}

	public Integer getISBN() {
		return ISBN;
	}

	public void setISBN(Integer iSBN) {
		ISBN = iSBN;
	}

	public Date getConslt() {
		return Conslt;
	}

	public void setConslt(Date conslt) {
		Conslt = conslt;
	}

	public Boolean getDisponible() {
		return Disponible;
	}

	public void setDisponible(Boolean disponible) {
		Disponible = disponible;
	}
	

}
