package github.com.brunomeloesilva;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import github.com.brunomeloesilva.orm.Cargo;
import github.com.brunomeloesilva.repository.CargoRepository;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner {
	
	private final CargoRepository cargoRepository;

	public SpringDataApplication(CargoRepository cargoRepository) {
		this.cargoRepository = cargoRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}

	//Este método é executado logo após o método main
	@Override
	public void run(String... args) throws Exception {
		Cargo cargo = new Cargo();
		cargo.setDescricao("Desenvolvedor de Software");
		cargoRepository.save(cargo);
		
		//TESTE COM QUERY NATIVAS
		List<Cargo> listCargos = cargoRepository.getListCargos("DES%");
		listCargos.forEach(System.out::println);
	}

}
