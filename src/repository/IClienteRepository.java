package repository;

import java.util.List;

import model.Cliente;

public interface IClienteRepository {
    
    void guardar(Cliente cliente);
    Cliente buscarPorDni(String dni);
    // SE AGREGO EL METODO listar() PARA OBTENER LA LISTA DE CLIENTES
    public List<Cliente> listar();
}
