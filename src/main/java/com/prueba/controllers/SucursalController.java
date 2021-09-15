package com.prueba.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.dto.MedicoDto;
import com.prueba.dto.SucursalDto;
import com.prueba.dto.SucursalMinDto;
import com.prueba.services.SucursalServices;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
@RestController
@RequestMapping("/api/v1/sucursales")
public class SucursalController {

	@Autowired
	private SucursalServices sucursalServices;

	@GetMapping("")
	public Map<String, Object> getSucursales() {
		return sucursalServices.listAllSucursales();
	}

	@PostMapping("")
	public ResponseEntity<?> setSucursal(@RequestBody SucursalDto sucursal) {
		Map<String, Object> resp = new HashMap<>();
		Map<String, Object> data = new HashMap<>();
		int codigo = sucursalServices.setSucursal(sucursal);
		try {
			if (!String.valueOf(codigo).equals(null)) {
				resp.put("code", 200);
				resp.put("message", "OK");
				data.put("codigoSucursal", codigo);
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

	@PutMapping("/{codigo_sucursal}")
	public ResponseEntity<?> putSucursales(@PathVariable String codigo_sucursal,
			@RequestParam(name = "codigoEmpresa", required = false) String codigoEmpresa,
			@RequestBody SucursalMinDto sucursal) {
		Map<String, Object> resp = new HashMap<>();
		try {
			if (codigo_sucursal != null) {
				resp.put("code", 200);
				resp.put("message", "OK");
				if (codigoEmpresa != null) {
					resp.put("data", sucursalServices.updateSucursal(Integer.parseInt(codigo_sucursal),
							Integer.parseInt(codigoEmpresa), sucursal));
					return new ResponseEntity<>(resp, HttpStatus.OK);
				} else {
					resp.put("code", 400);
					resp.put("message", "El campo codigo_empresa es obligatorio.");
					resp.put("data", new ArrayList());
					return new ResponseEntity<>(resp, HttpStatus.BAD_REQUEST);
				}
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

}
