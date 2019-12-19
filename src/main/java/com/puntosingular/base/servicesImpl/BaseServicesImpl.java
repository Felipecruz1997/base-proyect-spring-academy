package com.puntosingular.base.servicesImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.puntosingular.base.services.BaseServices;
@Service
public class BaseServicesImpl implements BaseServices {
	private final static Logger LOG = Logger.getLogger(" com.puntosingular.base.servicesImpl.BaseServicesImpl");
	@Override
	public ResponseEntity<?> getHolaMundo() {
		Map<String, Object> respuesta = new HashMap<>();
		//System.aout.println("HolaMundo");
		LOG.info("Hola Mundo desde Srping boot donde no me quedaba  - getHolaMundo");
		respuesta.put("respuesta","Hola Mundo desde Srping boot donde no me quedaba -getHolaMundo - 202Accepted");
		return new ResponseEntity<Map<String,Object>>(respuesta,HttpStatus.ACCEPTED);
	}

}
