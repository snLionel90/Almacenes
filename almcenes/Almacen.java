package almcenes;

import java.util.ArrayList;

public class Almacen {
	
	private ArrayList<paquete> paquetes;

	//CONSTRUCTORES
	public Almacen(ArrayList<paquete> paquetes) 
	{
		this.paquetes = paquetes;
		
	}	
	public Almacen() 
	{
		this.paquetes=new ArrayList<paquete>();
	}
	
	//GEtter y setter
	public synchronized ArrayList<paquete> getPaquetes() 
	{
		return paquetes;
	}
	public synchronized void setPaquetes(ArrayList<paquete> paquetes)
	{
		this.paquetes = paquetes;
	}
	//Hilos para el arrayList
	
	public synchronized void ponerPaquete(paquete p)
	{
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.paquetes.add(p);
		notify();
		System.out.println("El Empleado " +Thread.currentThread().getName() +" ha puesto el paquete "+p.getId());
	}
	public synchronized paquete quitarPaquete() 
	{
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (this.paquetes.isEmpty()) 
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		paquete p = this.paquetes.remove(0);
		System.out.println("El Transportista " +Thread.currentThread().getName() +" se ha llevado el paquete "+p.getId());
		return p;	
	}
	
}
