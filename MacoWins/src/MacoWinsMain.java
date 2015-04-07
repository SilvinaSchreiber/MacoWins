import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.clases.Prenda;
import com.clases.PrendaImportada;
import com.clases.Venta;


public class MacoWinsMain {

	static List<Venta> ventasDelDia = new ArrayList<Venta>();	
	
	
	public static void main(String[] args) {
		Prenda p = new Prenda(); 
		PrendaImportada pi = new PrendaImportada();
		Date fecha = new Date();
		
		venderPrenda(pi, 5, fecha);
		venderPrenda(p, 1, fecha);
		venderPrenda(p, 2, fecha);
		venderPrenda(pi, 1, fecha);
		venderPrenda(p, 3, fecha);
		
		double ventasDelDia = getVentasDelDia();
		System.out.println(ventasDelDia);
	}
	
	private static double getVentasDelDia() {
		double valorTotalDelDIa = 0;
		for (Venta venta : ventasDelDia) {
			valorTotalDelDIa = valorTotalDelDIa + venta.getPrecioTotalVenta();
		}
		
		return valorTotalDelDIa;
	}
	
	private static void venderPrenda(Prenda p, int cantidad, Date fecha) {
		Venta v = getNuevaVenta(p, cantidad, fecha);
		ventasDelDia.add(v);
	}
	
	
	private static Venta getNuevaVenta(Prenda p, int cantidad, Date fecha) {
		Venta v = new Venta();
		v.setPrenda(p);
		v.setCantidadPrendas(cantidad);
		v.setFecha(fecha);
		return v;
	}
	
	
	
	
}
