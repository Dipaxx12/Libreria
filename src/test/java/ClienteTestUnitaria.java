import com.distribuida.entities.Cliente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTestUnitaria {

    private Cliente cliente;

    @BeforeEach
    public void setUp() {
        cliente = new Cliente(1, "1755564901", "Diego", "Hidalgo", "Av.puembo", "0979272218", "dieg0stax12@gmail.com");
    }

    @Test
    public void testClienteConstructorAndGetters() {
        assertAll("Validar valores iniciales del constructor",
                () -> assertEquals(1, cliente.getIdCliente()),
                () -> assertEquals("1755564901", cliente.getCedula()),
                () -> assertEquals("Diego", cliente.getNombre()),
                () -> assertEquals("Hidalgo", cliente.getApellido()),
                () -> assertEquals("Av.puembo", cliente.getDireccion()),
                () -> assertEquals("0979272218", cliente.getTelefono()),
                () -> assertEquals("dieg0stax12@gmail.com", cliente.getCorreo())
        );
    }

    @Test
    public void testClienteSetters() {
        cliente.setIdCliente(2);
        cliente.setCedula("1104689053");
        cliente.setNombre("Carlos");
        cliente.setApellido("Perez");
        cliente.setDireccion("Av. Amazonas");
        cliente.setTelefono("0999999999");
        cliente.setCorreo("carlos.perez@email.com");

        assertAll("Validar cambios con setters",
                () -> assertEquals(2, cliente.getIdCliente()),
                () -> assertEquals("1104689053", cliente.getCedula()),
                () -> assertEquals("Carlos", cliente.getNombre()),
                () -> assertEquals("Perez", cliente.getApellido()),
                () -> assertEquals("Av. Amazonas", cliente.getDireccion()),
                () -> assertEquals("0999999999", cliente.getTelefono()),
                () -> assertEquals("carlos.perez@email.com", cliente.getCorreo())
        );
    }

    @Test
    public void testToString() {
        String toStringResult = cliente.toString();
        assertTrue(toStringResult.contains("Diego"));
        assertTrue(toStringResult.contains("1755564901"));
    }
}
