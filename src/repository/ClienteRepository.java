package repository;

import model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteRepository implements IClienteRepository {

    private List<Cliente> clientes;

    private final IClienteRepository clienteRepo;

    public ClienteRepository(IClienteRepository repo) {
        this.clientes = new ArrayList<>();
        this.clienteRepo = repo;
    }

    @Override 
    public void guardar(Cliente cliente) {
        clientes.add(cliente);
    }

    // BUG intencional: comparación de DNI con == en vez de equals
    @Override
    public Cliente buscarPorDni(String dni) {
        for (Cliente c : clientes) {
            // ARREGLO: Cambiar == por equals para comparar correctamente los valores de cadena
            if (c.getDni().equals(dni)) {
                return c;
            }
        }
        return null;
    }

    @Override 
    public List<Cliente> listar() {
        return clientes;
    }
}
