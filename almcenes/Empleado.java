package almcenes;

public class Empleado implements Runnable {

	private Thread hilo;
	@SuppressWarnings("unused")
	private Almacen almacen1;
	
	public Empleado(String nombre, int prioridad, ThreadGroup empleados, Almacen a1) {
		hilo = new Thread(empleados,this,nombre);
		hilo.setPriority(prioridad);
		this.almacen1 = a1;				
	}
	
	public Thread getHilo() {
		return hilo;
	}

	public void setHilo(Thread hilo) {
		this.hilo = hilo;
	}

	public Almacen getAlmacen1() {
		return almacen1;
	}

	public void setAlmacen1(Almacen almacen1) {
		this.almacen1 = almacen1;
	}

	@Override
	public void run() {
		for (int i=0; i<20; i++)
		{						
			try {
				Thread.sleep(120);
				paquete p= new paquete(String.valueOf(paquete.getNumPaquetes())," "); 
				almacen1.ponerPaquete(p);					
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();				
			}		
		}		
	}	
}
