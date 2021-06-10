package almcenes;

public class paquete {
	
	//Atributos de la clase
	private static int numPaquetes=0;
	private String id;
	private String descripcion;
	
	//constructores
	public paquete(String id, String descripcion) {
		numPaquetes++;
		this.id = id;
		this.descripcion = descripcion;
	}

	public paquete() {
		numPaquetes++;
		this.id = String.valueOf(numPaquetes);
		this.descripcion="";
	}
	
	//MEtodos getes y setter
	public static int getNumPaquetes() {
		return numPaquetes;
	}

	public static void setNumPaquetes(int numPaquetes) {
		paquete.numPaquetes = numPaquetes;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
		
	//Mostrar un paquete con toString
	@Override
	public String toString() {
		return "paquete [id=" + id + ", descripcion=" + descripcion + "]";
	}
	
//MEtodo para comparar
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		paquete other = (paquete) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
