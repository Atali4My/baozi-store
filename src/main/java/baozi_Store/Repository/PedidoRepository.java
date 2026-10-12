package baozi_Store.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import baozi_Store.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}