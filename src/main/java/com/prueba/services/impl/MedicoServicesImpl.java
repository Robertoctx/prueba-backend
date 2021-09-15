package com.prueba.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.dto.MedicoDto;
import com.prueba.entities.Medico;
import com.prueba.repositories.MedicoRepository;
import com.prueba.services.MedicoServices;

@Service("MedicoServices")
public class MedicoServicesImpl implements MedicoServices {

	@Autowired
	private MedicoRepository medicoRepository;

	@Override
	public List<MedicoDto> listAllMedicos() {
		List<MedicoDto> data = new ArrayList<MedicoDto>();
		try {
			List<Medico> medicos = medicoRepository.findAll();
			for (Medico medico : medicos) {
				MedicoDto dto = new MedicoDto();
				dto.setCodigo_medico(medico.getCodigo_medico());
				dto.setTipo_identificacion(medico.getTipo_identificacion());
				dto.setNumero_identificacion(medico.getNumero_identificacion());
				dto.setPrimer_nombre(medico.getPrimer_nombre());
				dto.setSegundo_nombre(medico.getSegundo_nombre());
				dto.setPrimer_apellido(medico.getPrimer_apellido());
				dto.setSegundo_apellido(medico.getSegundo_apellido());
				dto.setNombreCompleto(medico.getNombreCompleto());
				dto.setMail(medico.getMail());
				dto.setFecha_nacimiento(medico.getFecha_nacimiento());
				dto.setSueldo(medico.getSueldo());
				dto.setSexo(medico.getSexo());
				dto.setCodigo_sucursal(medico.getCodigo_sucursal());
				dto.setCodigo_empresa(medico.getCodigo_empresa());
				dto.setUsuario_registro(medico.getUsuario_registro());
				dto.setFecha_registro(medico.getFecha_registro());
				data.add(dto);
			}
		} catch (Exception e) {
			data = null;
		}
		return data;
	}

	@Override
	public List<MedicoDto> listCODIGO_EMPRESA(int codigoEmpresa) {
		List<MedicoDto> data = new ArrayList<MedicoDto>();
		try {
			List<Medico> medicos = medicoRepository.findByCODIGO_EMPRESA(codigoEmpresa);
			for (Medico medico : medicos) {
				MedicoDto dto = new MedicoDto();
				dto.setCodigo_medico(medico.getCodigo_medico());
				dto.setTipo_identificacion(medico.getTipo_identificacion());
				dto.setNumero_identificacion(medico.getNumero_identificacion());
				dto.setPrimer_nombre(medico.getPrimer_nombre());
				dto.setSegundo_nombre(medico.getSegundo_nombre());
				dto.setPrimer_apellido(medico.getPrimer_apellido());
				dto.setSegundo_apellido(medico.getSegundo_apellido());
				dto.setNombreCompleto(medico.getNombreCompleto());
				dto.setMail(medico.getMail());
				dto.setFecha_nacimiento(medico.getFecha_nacimiento());
				dto.setSueldo(medico.getSueldo());
				dto.setSexo(medico.getSexo());
				dto.setCodigo_sucursal(medico.getCodigo_sucursal());
				dto.setCodigo_empresa(medico.getCodigo_empresa());
				dto.setUsuario_registro(medico.getUsuario_registro());
				dto.setFecha_registro(medico.getFecha_registro());
				data.add(dto);
			}
		} catch (Exception e) {
			data = null;
		}
		return data;
	}

	@Override
	public List<MedicoDto> listCODIGO_SUCURSAL(int codigoEmpresa, int codigoSucursal) {
		List<MedicoDto> data = new ArrayList<MedicoDto>();
		try {
			List<Medico> medicos = medicoRepository.findByCODIGO_SUCURSAL(codigoEmpresa, codigoSucursal);
			for (Medico medico : medicos) {
				MedicoDto dto = new MedicoDto();
				dto.setCodigo_medico(medico.getCodigo_medico());
				dto.setTipo_identificacion(medico.getTipo_identificacion());
				dto.setNumero_identificacion(medico.getNumero_identificacion());
				dto.setPrimer_nombre(medico.getPrimer_nombre());
				dto.setSegundo_nombre(medico.getSegundo_nombre());
				dto.setPrimer_apellido(medico.getPrimer_apellido());
				dto.setSegundo_apellido(medico.getSegundo_apellido());
				dto.setNombreCompleto(medico.getNombreCompleto());
				dto.setMail(medico.getMail());
				dto.setFecha_nacimiento(medico.getFecha_nacimiento());
				dto.setSueldo(medico.getSueldo());
				dto.setSexo(medico.getSexo());
				dto.setCodigo_sucursal(medico.getCodigo_sucursal());
				dto.setCodigo_empresa(medico.getCodigo_empresa());
				dto.setUsuario_registro(medico.getUsuario_registro());
				dto.setFecha_registro(medico.getFecha_registro());
				data.add(dto);
			}
		} catch (Exception e) {
			data = null;
		}
		return data;
	}

	@Override
	public List<MedicoDto> listREGION(int codigoEmpresa, String region) {
		List<MedicoDto> data = new ArrayList<MedicoDto>();
		try {
			List<Medico> medicos = medicoRepository.findByREGION(codigoEmpresa, region);
			for (Medico medico : medicos) {
				MedicoDto dto = new MedicoDto();
				dto.setCodigo_medico(medico.getCodigo_medico());
				dto.setTipo_identificacion(medico.getTipo_identificacion());
				dto.setNumero_identificacion(medico.getNumero_identificacion());
				dto.setPrimer_nombre(medico.getPrimer_nombre());
				dto.setSegundo_nombre(medico.getSegundo_nombre());
				dto.setPrimer_apellido(medico.getPrimer_apellido());
				dto.setSegundo_apellido(medico.getSegundo_apellido());
				dto.setNombreCompleto(medico.getNombreCompleto());
				dto.setMail(medico.getMail());
				dto.setFecha_nacimiento(medico.getFecha_nacimiento());
				dto.setSueldo(medico.getSueldo());
				dto.setSexo(medico.getSexo());
				dto.setCodigo_sucursal(medico.getCodigo_sucursal());
				dto.setCodigo_empresa(medico.getCodigo_empresa());
				dto.setUsuario_registro(medico.getUsuario_registro());
				dto.setFecha_registro(medico.getFecha_registro());
				data.add(dto);
			}
		} catch (Exception e) {
			data = null;
		}
		return data;
	}

	@Override
	public List<MedicoDto> listNOMBRE_MEDICO(int codigoEmpresa, String nombreMedico) {
		List<MedicoDto> data = new ArrayList<MedicoDto>();
		try {
			List<Medico> medicos = medicoRepository.findByNOMBRE_MEDICO(codigoEmpresa, nombreMedico);
			for (Medico medico : medicos) {
				MedicoDto dto = new MedicoDto();
				dto.setCodigo_medico(medico.getCodigo_medico());
				dto.setTipo_identificacion(medico.getTipo_identificacion());
				dto.setNumero_identificacion(medico.getNumero_identificacion());
				dto.setPrimer_nombre(medico.getPrimer_nombre());
				dto.setSegundo_nombre(medico.getSegundo_nombre());
				dto.setPrimer_apellido(medico.getPrimer_apellido());
				dto.setSegundo_apellido(medico.getSegundo_apellido());
				dto.setNombreCompleto(medico.getNombreCompleto());
				dto.setMail(medico.getMail());
				dto.setFecha_nacimiento(medico.getFecha_nacimiento());
				dto.setSueldo(medico.getSueldo());
				dto.setSexo(medico.getSexo());
				dto.setCodigo_sucursal(medico.getCodigo_sucursal());
				dto.setCodigo_empresa(medico.getCodigo_empresa());
				dto.setUsuario_registro(medico.getUsuario_registro());
				dto.setFecha_registro(medico.getFecha_registro());
				data.add(dto);
			}
		} catch (Exception e) {
			data = null;
		}
		return data;
	}

	@Override
	public int setMedico(MedicoDto data) {
		Medico medico = new Medico();
		medico.setTipo_identificacion(data.getTipo_identificacion());
		medico.setNumero_identificacion(data.getNumero_identificacion());
		medico.setPrimer_nombre(data.getPrimer_nombre());
		medico.setSegundo_nombre(data.getSegundo_nombre());
		medico.setPrimer_apellido(data.getPrimer_apellido());
		medico.setSegundo_apellido(data.getSegundo_apellido());
		medico.setNombreCompleto(data.getNombreCompleto());
		medico.setMail(data.getMail());
		medico.setFecha_nacimiento(data.getFecha_nacimiento());
		medico.setSueldo(data.getSueldo());
		medico.setSexo(data.getSexo());
		medico.setCodigo_sucursal(data.getCodigo_sucursal());
		medico.setCodigo_empresa(data.getCodigo_empresa());
		medico.setUsuario_registro(data.getUsuario_registro());
		medico.setFecha_registro(data.getFecha_registro());
		Medico resp = medicoRepository.save(medico);
		return resp.getCodigo_medico();
	}

}
