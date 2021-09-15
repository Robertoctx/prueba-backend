package com.prueba.services;

import java.util.Map;
import java.util.Optional;

import com.prueba.dto.SucursalDto;
import com.prueba.dto.SucursalMinDto;

public interface SucursalServices {
	
	public abstract Map<String, Object> listAllSucursales();
	
	public int setSucursal(SucursalDto data);
	
	public abstract Map<String, Object> updateSucursal(int codigoSucursal, int codigoEmpresa, SucursalMinDto data);

}
