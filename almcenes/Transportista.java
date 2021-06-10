package almcenes;

public class Transportista implements Runnable{
	
	private Thread hilo;
	@SuppressWarnings("unused")
	private Almacen almacen1;
	
	public Transportista(String nombre, int prioridad, ThreadGroup transportistas, Almacen a1) {
		hilo = new Thread(transportistas,this,nombre);
		hilo.setPriority(prioridad);
		this.almacen1 = a1;		
		
	}

	@Override
	public void run() {
		for (int i=0; i<20; i++)
		{						
			try {
				Thread.sleep(120);				
				@SuppressWarnings("unused")
				paquete p = almacen1.quitarPaquete();					
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();				
			}
			
		}		
		
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
	
}
