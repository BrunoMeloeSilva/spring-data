package github.com.brunomeloesilva.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import github.com.brunomeloesilva.orm.Cargo;

@Repository
public interface CargoRepository extends CrudRepository<Cargo, Integer>{

}
