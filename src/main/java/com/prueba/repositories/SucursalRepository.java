package com.prueba.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.prueba.entities.Sucursal;

@Repository("SucursalRepository")
public interface SucursalRepository extends JpaRepository<Sucursal, Integer> {
	
	@Query(value = "SELECT * FROM SUCURSAL", nativeQuery = true)
	public abstract List<Sucursal> findAll();
	
	@Query(value = "UPDATE SUCURSAL SET NOMBRE_SUCURSAL = :nombreSucursal, REGION = :region WHERE CODIGO_SUCURSAL = :codigoSucursal", nativeQuery = true)
	public abstract List<Sucursal> updateSucursal(@Param("nombreSucursal") String nombreSucursal, @Param("region") String region);

}
