import edu.unidad4.Producto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest {
    @Test
    void debeCalcularEltotalDelProducto(){
        //Arranque
        Producto producto= new Producto("camiseta",2,80000);
        //act
        double Total= producto.calcularTotal();
        //
        assertEquals(160000,Total,0.01);
    }

    @Test
    void debeRechazarCantidaCero(){
        assertThrows(IllegalArgumentException.class,()->new Producto("camiseta",0,200));
    }

}
