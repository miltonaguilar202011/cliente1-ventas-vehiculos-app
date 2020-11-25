package pe.com.arland.cliente1.registro.entity;

import java.util.Date;
import java.util.List;

public class FacturaEntity extends ComprobanteBase {

	private Double importeIVA;
	private String idContribuyenteCliente;
	public Double getImporteIVA() {
		return importeIVA;
	}
	public void setImporteIVA(Double importeIVA) {
		this.importeIVA = importeIVA;
	}
	public String getIdContribuyenteCliente() {
		return idContribuyenteCliente;
	}
	public void setIdContribuyenteCliente(String idContribuyenteCliente) {
		this.idContribuyenteCliente = idContribuyenteCliente;
	}
	public FacturaEntity(String idContribuyente, String tipoComprobante, String serieComprobante,
			Long numeroComprobante, Double montoComprobante, String idCliente, String idEmpleado, Date fechaRegistro,
			Date fechaCancelacion, String estadoComprobante, List<ItemComprobanteEntity> items, Double importeIVA,
			String idContribuyenteCliente) {
		super(idContribuyente, tipoComprobante, serieComprobante, numeroComprobante, montoComprobante, idCliente,
				idEmpleado, fechaRegistro, fechaCancelacion, estadoComprobante, items);
		this.importeIVA = importeIVA;
		this.idContribuyenteCliente = idContribuyenteCliente;
	}

}
