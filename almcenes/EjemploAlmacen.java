package almcenes;

import java.util.ArrayList;

public class EjemploAlmacen {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		ArrayList<paquete> paquetes = new ArrayList<paquete>();
		ThreadGroup empleados = new ThreadGroup("empleados");
		
		Almacen a1 = new Almacen(paquetes);
		Empleado e1 = new Empleado("e1",5,empleados,a1);
		Empleado e2 = new Empleado("e2",3,empleados,a1);
		
		ThreadGroup transportistas = new ThreadGroup("transportista");
		Transportista t1 = new Transportista("t1",5,transportistas,a1);
		Transportista t2 = new Transportista("t2",6,transportistas,a1);
		
		e1.getHilo().start();
		e2.getHilo().start();
		t1.getHilo().start(); 
		t2.getHilo().start();
		
		System.out.println(" ALMACEN LIONEL");
		System.out.println("-----------------");

	}

}
