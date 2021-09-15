package com.prueba.services.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.dto.SucursalDto;
import com.prueba.dto.SucursalMinDto;
import com.prueba.entities.Sucursal;
import com.prueba.repositories.SucursalRepository;
import com.prueba.services.SucursalServices;

@Service("SucursalServices")
public class SucursalServicesImpl implements SucursalServices {

	@Autowired
	private SucursalRepository sucursalRepository;

	@Override
	public Map<String, Object> listAllSucursales() {
		Map<String, Object> data = new HashMap<>();
		List<SucursalDto> resp = new ArrayList<SucursalDto>();
		try {
			List<Sucursal> sucursales = sucursalRepository.findAll();
			for (Sucursal sucursal : sucursales) {
				SucursalDto dto = new SucursalDto();
				dto.setCodigo_empresa(sucursal.getCodigo_empresa());
				dto.setCodigo_sucursal(sucursal.getCodigo_sucursal());
				dto.setNombre_sucursal(sucursal.getNombre_sucursal());
				dto.setRegion(sucursal.getRegion());
				dto.setUsuario_registro(sucursal.getUsuario_registro());
				dto.setFecha_registro(sucursal.getFecha_registro());
				resp.add(dto);
			}
			data.put("code", 200);
			data.put("message", "OK");
			data.put("data", resp);
		} catch (Exception e) {
			data.put("code", 500);
			data.put("message", "Errores no controlados");
			data.put("errorData", resp);
		}
		return data;
	}

	@Override
	public Map<String, Object> updateSucursal(int codigoSucursal, int codigoEmpresa, SucursalMinDto data) {
		Optional<Sucursal> sucursal = sucursalRepository.findById(codigoSucursal);
		sucursal.get().setNombre_sucursal(data.getNombre_sucursal());
		sucursal.get().setRegion(data.getRegion());
		sucursalRepository.save(sucursal.get());
		return new HashMap<>();
	}

	@Override
	public int setSucursal(SucursalDto data) {
		Sucursal sucursal = new Sucursal();
		sucursal.setCodigo_empresa(data.getCodigo_empresa());
		sucursal.setCodigo_sucursal(data.getCodigo_sucursal());
		sucursal.setNombre_sucursal(data.getNombre_sucursal());
		sucursal.setRegion(data.getRegion());
		sucursal.setUsuario_registro(data.getUsuario_registro());
		sucursal.setFecha_registro(data.getFecha_registro());
		Sucursal resp = sucursalRepository.save(sucursal);
		return resp.getCodigo_sucursal();
	}

}
