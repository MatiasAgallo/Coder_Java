package com.coderhouse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderhouse.models.Producto;
import com.coderhouse.repository.ProductoRepository;

import jakarta.transaction.Transactional;
@Service
public class ProductoService {
	
	@Autowired
	private ProductoRepository productoRepository;
	
	public List<Producto> getAllProductos(){
		return productoRepository.findAll();
	}
	
	public Producto findById(Long id) {
		return productoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Producto no encontrado"));
				
				
	}
	
	@Transactional
	public Producto saveProducto(Producto Producto) {
		return productoRepository.save(Producto);
	}
	
	@Transactional
	public Producto updateProductoById(Long id, Producto productoDetails) {
		Producto producto = productoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Producto no encontrado"));
		producto.setNombre(productoDetails.getNombre());
		producto.setMarca(productoDetails.getMarca());
		producto.setAnio(productoDetails.getAnio());
		
		return productoRepository.save(producto);
	}
	
	
	
	
	public void deleteProductoById(Long id) {
		if(!productoRepository.existsById(id)) {
			throw new IllegalArgumentException("Producto no encontrado");
		}
		
		productoRepository.deleteById(id);
	}


}
