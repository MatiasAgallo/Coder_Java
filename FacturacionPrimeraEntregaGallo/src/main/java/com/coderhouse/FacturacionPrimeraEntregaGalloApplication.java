package com.coderhouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderhouse.dao.DaoFactory;
import com.coderhouse.models.Cliente;
import com.coderhouse.models.Producto;

@SpringBootApplication
public class FacturacionPrimeraEntregaGalloApplication  implements CommandLineRunner{
	
	@Autowired
	private DaoFactory dao;
	public static void main(String[] args) {
		SpringApplication.run(FacturacionPrimeraEntregaGalloApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		try {
			
			
			
			Cliente cliente1 = new Cliente("Matias", "Gallo", 42934556,"matiasgallo@gmail.com");
			
		    Cliente cliente2 = new Cliente("Luciana", "Lomba", 41094091,"lucianalomba@gmail.com");
		    
		    Cliente cliente3 = new Cliente("Fabricio", "Carrasco", 42415512,"fabriciocarrasco.com");
		    
		    Cliente cliente4 = new Cliente("Roberto", "Gallo", 41231446,"robertogallo@gmail.com");
		    
		    
		    Producto producto1 = new Producto("Ford", "Fiesta", 2019);
		    
		    Producto producto2 = new Producto("Chevrolet","S10", 2024);
		    
		    Producto producto3 = new Producto("Toyota", "Corolla",2016);
		    
		    Producto producto4 = new Producto("Fiat","Cronos",2020);
			
		    dao.persistirCliente(cliente1);
		    
		    dao.persistirCliente(cliente2);
		    
		    dao.persistirCliente(cliente3);
		    
		    dao.persistirCliente(cliente4);
		    
		    dao.persistirProducto(producto1);
		    
		    dao.persistirProducto(producto2);
		    
		    dao.persistirProducto(producto3);
		    
		    dao.persistirProducto(producto4);
		    
			
			
			
		}catch (Exception e) {
			
			e.printStackTrace(System.err);
		}
	}

}
