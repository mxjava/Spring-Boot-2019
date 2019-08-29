/*
 * 
 */
package mx.com.senorpago.gaspayment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.senorpago.gaspayment.entity.Gasoline;

/**
 * The Interface GasolineRepository.
 */
@Repository
public interface GasolineRepository extends JpaRepository<Gasoline, Long> {

}
