package pe.com.arland.ventas1.repository.mongodb;

import java.util.Date;
import java.util.List;

import pe.com.arland.cliente1.registro.entity.BoletaEntity;
import pe.com.arland.cliente1.registro.entity.ClienteEntity;
import pe.com.arland.cliente1.registro.entity.FacturaEntity;
import pe.com.arland.cliente1.registro.entity.ItemComprobanteEntity;
import pe.com.arland.ventas1.repository.ComprobanteRepository;

public class ComprobanteRepositoryImpl implements ComprobanteRepository {

	@Override
	public FacturaEntity getFacturaByKey(String serieComprobante, Long numeroComprobante) {

		 if (serieComprobante.equals("0020") && numeroComprobante.equals((long) 345) ) {
			 return  new FacturaEntity("20100010202","01","0020",
						(long) 345 , 14850.0 , "CLI0002" , "EMP0023" , new Date(),
						new Date() ,"01" , null, 14850*0.18,
						"10299293999") ;
		 }
	
		 if (serieComprobante.equals("0020") && numeroComprobante.equals((long) 346) ) {
			 return  new FacturaEntity("20100010202","01","0020",
						(long) 346 , 10500.00 , "CLI0003" , "EMP0023" , new Date(),
						new Date() ,"01" , null, 10500.00*0.18,
						"20100010202") ;
		 }
		 
		 if (serieComprobante.equals("0020") && numeroComprobante.equals((long) 347) ) {
			 return  new FacturaEntity("20100010202","01","0020",
						(long) 347 , 23456.00 , "CLI0004" , "EMP0023" , new Date(),
						new Date() ,"01" , null, 23456.00*0.18,
						"20199283344") ;
		 }
		 
		 
		 if (serieComprobante.equals("0020") && numeroComprobante.equals((long) 348) ) {
			 return  new FacturaEntity("20100010202","01","0020",
						(long) 348 , 253434.00 , "CLI023" , "EMP0012" , new Date(),
						new Date() ,"01" , null, 253434.00*0.18,
						"10203934332") ;
		 }
		 
		return null;
	}


	public BoletaEntity getBoletaByKey(String serieComprobante, Long numeroComprobante) {

		 if (serieComprobante.equals("0001") && numeroComprobante.equals((long) 3005) ) {
			 return  new BoletaEntity("20100010202","03","0001",(long) 3005 ,
					 400.0 , "CLI0002" , "EMP0098" , new Date(),new Date() ,
						"01" , null) ;
		 }
	
		 if (serieComprobante.equals("0001") && numeroComprobante.equals((long) 3006) ) {
			 return  new BoletaEntity("20100010202","03","0001",(long) 3005 ,
					 370.0 , "CLI03444" , "EMP0077" , new Date(),new Date() ,
						"01" , null) ;
		 }		
		 
		 if (serieComprobante.equals("0001") && numeroComprobante.equals((long) 3007) ) {
			 return  new BoletaEntity("20100010202","03","0001",(long) 3005 ,
					 370.0 , "CLI03344" , "EMP0077" , new Date(),new Date() ,
						"01" , null) ;
		 }		
		 
		 
		 if (serieComprobante.equals("0001") && numeroComprobante.equals((long) 3008) ) {
			 return  new BoletaEntity("20100010202","03","0001",(long) 3005 ,
					 370.0 , "CLI0344" , "EMP0045" , new Date(),new Date() ,
						"01" , null) ;
		 }		
		 
		return null;
	}
	
}
