package com.prueba.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.prueba.dto.MedicoDto;

@Service
public interface MedicoServices {
	
	public abstract int setMedico(MedicoDto data);
	
	public abstract List<MedicoDto> listAllMedicos();
	
	public abstract List<MedicoDto> listCODIGO_EMPRESA(int codigoEmpresa);
	
	public abstract List<MedicoDto> listCODIGO_SUCURSAL(int codigoEmpresa, int codigoSucursal);
	
	public abstract List<MedicoDto> listREGION(int codigoEmpresa, String region);
	
	public abstract List<MedicoDto> listNOMBRE_MEDICO(int codigoEmpresa, String nombreMedico);

}
