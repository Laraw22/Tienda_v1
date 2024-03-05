package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    
     // Se obtiene un listado de categorias en un List
    public List<Categoria> getCategorias(boolean activos); //este es el read
    
    // Se obtiene un Categoria, a partir del id de un categoria
    public Categoria getCategoria(Categoria categoria); //este es el update
    
    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Categoria categoria); //este es el create
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Categoria categoria); //este es el delete
}
