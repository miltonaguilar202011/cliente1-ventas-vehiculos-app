package pe.com.arland.ventas1.service.impl;

import pe.com.arland.cliente1.registro.entity.BoletaEntity;
import pe.com.arland.cliente1.registro.entity.ClienteEntity;
import pe.com.arland.cliente1.registro.entity.FacturaEntity;
import pe.com.arland.cliente1.registro.entity.UsuarioAplicacionEntity;
import pe.com.arland.seguridad1.autenticacion.repository.ClientesRepository;
import pe.com.arland.seguridad1.autenticacion.repository.UsuariosAplicacionRepository;
import pe.com.arland.seguridad1.autenticacion.repository.mongodb.ClientesRepositoryImpl;
import pe.com.arland.seguridad1.autenticacion.repository.mongodb.UsuariosAplicacionRepositoryImpl;
import pe.com.arland.seguridad1.autenticacion.service.AutenticacionService;
import pe.com.arland.ventas1.repository.ComprobanteRepository;
import pe.com.arland.ventas1.service.VentasService;

public class VentasServiceImpl implements VentasService {

	ComprobanteRepository comprobanteDAO;
	
	public ComprobanteRepository getComprobanteDAO() {
		return comprobanteDAO;
	}

	public void setComprobanteDAO(ComprobanteRepository comprobanteDAO) {
		this.comprobanteDAO = comprobanteDAO;
	}

	@Override
	public FacturaEntity recuperarFactura(String serieComprobante, Long numeroComprobante) {
		// TODO Auto-generated method stub
		FacturaEntity factura;
		factura = comprobanteDAO.getFacturaByKey(serieComprobante, numeroComprobante);
		if (factura!=null) {return factura;}
		return null;
		
	}

	@Override
	public BoletaEntity recuperarBoleta(String serieComprobante, Long numeroComprobante) {
		// TODO Auto-generated method stub
		return null;
	}


}
