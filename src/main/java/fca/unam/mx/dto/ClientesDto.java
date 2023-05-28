package fca.unam.mx.dto;

import org.jdbi.v3.core.mapper.reflect.ColumnName;

public class ClientesDto {
    private Long id;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private String RFC;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ColumnName("nombre")
    public String getName() {
        return nombre;
    }

    public void setName(String nombre) {
        this.nombre = nombre;
    }

    @ColumnName("apellido_paterno")
    public String getDescription() {
        return apellido_paterno;
    }

    public void setDescription(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    @ColumnName("apellido_materno")
    public String getPrice() {
        return this.apellido_paterno;
    }

    public void setPrice(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    @ColumnName("RFC")
    public String getQuantity() {
        return RFC;
    }

    public void setQuantity(String RFC) {
        this.RFC = RFC;
    }

    public String getSku() {
        return RFC;
    }

    public void setSku(String RFC) {
        this.RFC = RFC;
    }
}
