package com.prueba.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.prueba.entities.Medico;

@Repository("MedicoRepository")
public interface MedicoRepository extends JpaRepository<Medico, Integer> {

	@Query(value = "SELECT * FROM MEDICO", nativeQuery = true)
	public abstract List<Medico> findAllMedicos();
	
	@Query(value = "SELECT * FROM MEDICO WHERE CODIGO_EMPRESA = :codigoEmpresa", nativeQuery = true)
	public abstract List<Medico> findByCODIGO_EMPRESA(@Param("codigoEmpresa") int codigoEmpresa);
	
	@Query(value = "SELECT * FROM MEDICO WHERE CODIGO_EMPRESA = :codigoEmpresa AND CODIGO_SUCURSAL = :codigoSucursal", nativeQuery = true)
	public abstract List<Medico> findByCODIGO_SUCURSAL(@Param("codigoEmpresa") int codigoEmpresa, @Param("codigoSucursal") int codigoSucursal);
	
	@Query(value = "SELECT DISTINCT * FROM medico m JOIN sucursal S ON m.codigo_sucursal = s.codigo_sucursal WHERE m.codigo_sucursal = s.codigo_sucursal AND m.codigo_empresa = :codigoEmpresa AND s.region LIKE :region", nativeQuery = true)
	public abstract List<Medico> findByREGION(@Param("codigoEmpresa") int codigoEmpresa, @Param("region") String region);
	
	@Query(value = "SELECT * FROM MEDICO WHERE CODIGO_EMPRESA = :codigoEmpresa AND NOMBRE_COMPLETO LIKE :valorFiltro", nativeQuery = true)
	public abstract List<Medico> findByNOMBRE_MEDICO(@Param("codigoEmpresa") int codigoEmpresa, @Param("valorFiltro") String valorFiltro);
	

}