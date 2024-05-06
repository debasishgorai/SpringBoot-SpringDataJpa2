package SpringDataJpa7.Repository;

import java.io.Serializable;

//import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;
import org.springframework.data.jpa.repository.JpaRepository;

//import org.springframework.data.jpa.repository.JpaRepository;
import SpringDataJpa7.entity.*;
public interface AddressRepository extends JpaRepository <Address, Serializable>
{
	
}