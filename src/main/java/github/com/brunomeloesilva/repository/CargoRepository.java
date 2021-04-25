package github.com.brunomeloesilva.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import github.com.brunomeloesilva.orm.Cargo;

@Repository
public interface CargoRepository extends CrudRepository<Cargo, Integer>{
	
	@Query(value = "SELECT * FROM CARGOS WHERE DESCRICAO LIKE :nome", nativeQuery = true)
	public List<Cargo> getListCargos(String nome);
}
