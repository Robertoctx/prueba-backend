package com.prueba.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.dto.MedicoDto;
import com.prueba.repositories.MedicoRepository;
import com.prueba.services.MedicoServices;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
@RestController
@RequestMapping("/api/v1/medicos")
public class MedicoController {

	@Autowired
	private MedicoServices medicoServices;

	@Autowired
	private MedicoRepository rep;

	@GetMapping("")
	public ResponseEntity<?> getMedicos(@RequestParam(name = "codigoEmpresa", required = false) String codigoEmpresa,
			@RequestParam(name = "codigoSucursal", required = false) String codigoSucursal,
			@RequestParam(name = "region", required = false) String region,
			@RequestParam(name = "tipoFiltro", required = false) String tipoFiltro,
			@RequestParam(name = "valorFiltro", required = false) String valorFiltro) {
		Map<String, Object> resp = new HashMap<>();
		try {
			if (codigoEmpresa != null) {
				resp.put("code", 200);
				resp.put("message", "OK");
				if (codigoSucursal != null) {
					resp.put("data", medicoServices.listCODIGO_SUCURSAL(Integer.parseInt(codigoEmpresa), Integer.parseInt(codigoSucursal)));
				} else if (region != null) {
					resp.put("data", medicoServices.listREGION(Integer.parseInt(codigoEmpresa), region));
				} else if (tipoFiltro != null && valorFiltro != null) {
					switch (tipoFiltro) {
						case "nombreMedico":
							resp.put("data", medicoServices.listNOMBRE_MEDICO(Integer.parseInt(codigoEmpresa), valorFiltro));
							break;
						default:
							resp.put("code", 400);
							resp.put("message", "El campo valorFiltro es obligatorio.");
							resp.put("data", new ArrayList());
							return new ResponseEntity<>(resp, HttpStatus.BAD_REQUEST);
					}
				} else {
					resp.put("data", medicoServices.listCODIGO_EMPRESA(Integer.parseInt(codigoEmpresa)));
				}
				return new ResponseEntity<>(resp, HttpStatus.OK);
			} else {
				resp.put("code", 400);
				resp.put("message", "El campo codigoSucursal es obligatorio.");
				resp.put("data", new ArrayList());
				return new ResponseEntity<>(resp, HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			resp.put("code", 500);
			resp.put("message", "Error no controlado");
			resp.put("errorData", e);
			return new ResponseEntity<>(resp, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping("")
	public ResponseEntity<?> setMedicos(@RequestBody MedicoDto medico){
		Map<String, Object> resp = new HashMap<>();
		Map<String, Object> data = new HashMap<>();
		int codigo = medicoServices.setMedico(medico);
		try {
			if(!String.valueOf(codigo).equals(null)) {
				resp.put("code", 200);
				resp.put("message", "OK");
				data.put("codigoMedico", codigo);
				resp.put("data", data);
				return new ResponseEntity<>(resp, HttpStatus.OK);
			} else {
				resp.put("code", 400);
				resp.put("message", "Validaciones");
				resp.put("data", new ArrayList());
				return new ResponseEntity<>(resp, HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			resp.put("code", 500);
			resp.put("message", "Error no controlado");
			resp.put("errorData", new ArrayList());
			return new ResponseEntity<>(resp, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
