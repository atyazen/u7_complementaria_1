package fca.unam.mx.dao;


import fca.unam.mx.dto.ProductDto;
import fca.unam.mx.dto.ClientesDto;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;

public interface StoreDao {
   @RegisterBeanMapper(ClientesDto.class)
    @SqlQuery("SELECT * FROM clientes")
    List<ClientesDto> getClientes();
   
    @SqlUpdate("INSERT INTO clientes (nombre, apellido_paterno, apellido_materno, RFC) VALUES(:q.nombre, :q.apellido_paterno, :q.apellido_materno, :q.RFC)")
    void addCliente(@BindBean("q") ClientesDto ClientesDto);

    @RegisterBeanMapper(ProductDto.class)
    @SqlQuery("SELECT * FROM clientes")
    List<ProductDto> getProducts();

    @SqlUpdate("INSERT INTO productos (nombre, descripcion, precio, cantidad, sku) VALUES(:p.name, :p.description, :p.price, :p.quantity, :p.sku)")
    void addProduct(@BindBean("p") ProductDto productDto);

 
}
