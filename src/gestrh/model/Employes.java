package gestrh.model;

import java.io.Serializable;
import java.util.List;

import fr.epsi.localisation.domain.model.Departement;


@Entity
@Table(name = "EMPLOYES")
public class Employes implements Serializable{


	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue
    @Column(name="id_emp")
	public int id_emp;
	
	@Column(name="prenom_emp")
	public String prenom_emp;
	
	@OneToMany(targetEntity=fr.epsi.localisation.domain.model.Departement.class, cascade=CascadeType.ALL, mappedBy="pays", fetch = FetchType.EAGER )
	private List<Departement> departements;
	public List<Departement> getDepartements()
	{
		return departements;
	}


	public Pays(String nom) {
		this.nom = nom;
	}
	public Pays(){}
}
