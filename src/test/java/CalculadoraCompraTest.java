import edu.unidad4.CalculadoraCompra;
import edu.unidad4.Producto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraCompraTest {
    @Test
    void debeCalcularElSubtotal(){
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("camiseta",2,80000 ));
        productos.add(new Producto("termo",1,60000 ));
        CalculadoraCompra calculadora= new CalculadoraCompra();
        double subtotal = calculadora.calcularSubtotal(productos);
        assertEquals(220000,subtotal,0.01);

    }
    @Test
    void debeAplicarElDescuentoDel10Porciento(){
        CalculadoraCompra calculadora= new CalculadoraCompra();
        double descuento =calculadora.calcularDescuento(220000);
        assertEquals(22000,descuento,0.01);


    }
    @Test
    void noDebeAplicarElDescuentoPorDebajo200000() {
        CalculadoraCompra calculadora = new CalculadoraCompra();
        assertEquals(0, calculadora.calcularDescuento(190000));
    }
}
