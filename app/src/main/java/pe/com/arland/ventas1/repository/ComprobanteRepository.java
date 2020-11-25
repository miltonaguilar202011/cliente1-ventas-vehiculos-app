package pe.com.arland.ventas1.repository;

import pe.com.arland.cliente1.registro.entity.BoletaEntity;
import pe.com.arland.cliente1.registro.entity.ClienteEntity;
import pe.com.arland.cliente1.registro.entity.FacturaEntity;

public interface ComprobanteRepository {
	FacturaEntity getFacturaByKey(String serieComprobante , Long numeroComprobante);
	BoletaEntity getBoletaByKey(String serieComprobante, Long numeroComprobante) ;
}
