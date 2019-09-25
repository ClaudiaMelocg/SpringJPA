package br.cesed.si.lsi.exemplo4;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "conta", path = "conta")
public interface ContaRepository extends PagingAndSortingRepository<Conta, Integer> {

	List<Conta> findByTitular(String titular);

	List<Conta> findByAgenciaAndTitular(int agencia, String titular);

	@Query("SELECT c FROM Conta c WHERE c.agencia = ?1")
	List<Conta> buscarContasDaAgencia123(int agencia);

	@Query(value = "SELECT * FROM BB_CONTA c WHERE c.AG = ?1", nativeQuery = true)
	List<Conta>  findUserByStatusNative(int agencia);

}
