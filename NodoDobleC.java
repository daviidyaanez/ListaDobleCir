package Lista;

public class NodoDobleC {
	
	
	
		private String elemento;
		private NodoDobleC siguiente;
		private NodoDobleC anterior;
		
		
		
		public NodoDobleC(String elemento, NodoDobleC siguiente, NodoDobleC anterior) {
			
			this.elemento = elemento;
			this.siguiente = siguiente;
			this.anterior = anterior;
			
			
		}
		public NodoDobleC(String elemento, NodoDobleC siguiente) {
		
			this.elemento = elemento;
			this.siguiente = siguiente;
			this.anterior=null;
			
		}
		public NodoDobleC(String elemento) {
			
				this.elemento = elemento;
				this.siguiente=null;
				this.anterior=null;
			}

		
		public String getElemento() {
			return elemento;
		}
		public void setElemento(String elemento) {
			this.elemento = elemento;
		}
		public NodoDobleC getSiguiente() {
			return siguiente;
		}
		public void setSiguiente(NodoDobleC siguiente) {
			this.siguiente = siguiente;
		}
		public NodoDobleC getAnterior() {
			return anterior;
		}
		public void setAnterior(NodoDobleC anterior) {
			this.anterior = anterior;
		}
		
		
		
		
		
		
		
		

	}
	
	
	
	
	
	
	
	


