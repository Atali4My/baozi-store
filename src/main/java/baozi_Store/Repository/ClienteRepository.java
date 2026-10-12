package baozi_Store.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import baozi_Store.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}