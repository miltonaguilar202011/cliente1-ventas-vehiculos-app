package pe.com.arland.ventas1.service;

import pe.com.arland.cliente1.registro.entity.BoletaEntity;
import pe.com.arland.cliente1.registro.entity.ClienteEntity;
import pe.com.arland.cliente1.registro.entity.FacturaEntity;
import pe.com.arland.cliente1.registro.entity.UsuarioAplicacionEntity;

public interface VentasService {
	FacturaEntity recuperarFactura(String serieComprobante , Long numeroComprobante);
	BoletaEntity recuperarBoleta(String serieComprobante , Long numeroComprobante);
}
