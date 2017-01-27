package Lista;

public class ListaCir {
	
	
	protected NodoDobleC cabeza;  
	protected long tamaño;	
	protected NodoDobleC ultimo;

	
	public ListaCir(){
		cabeza = null;
		ultimo =null;
		tamaño =0;
	}	
	
	// Pregunta si la lista esta vacia
	public boolean esVacia(){
	    return cabeza == null;
	}
	
	
	// insertar un elemento al inicio de la lista 
	
	public void insertarInicio(String dato){
        NodoDobleC nuevo= new NodoDobleC (dato);
        if(cabeza==null){
                  cabeza=nuevo;
        } else{
                  NodoDobleC aux=cabeza;
                  while(aux.getSiguiente()!=cabeza)
                           aux=aux.getSiguiente();
                  
                  aux.setSiguiente(nuevo);
                  nuevo.setAnterior(aux);
                  nuevo.setSiguiente(cabeza);
                  cabeza.setAnterior(nuevo);
                  cabeza=nuevo;
                 
        }
      }
	
// insertar un elemento al final de la lista 
	
	
	public void insertarFinal(String dato){
        NodoDobleC nuevo=new NodoDobleC(dato);
        if(cabeza==null){
                  cabeza=nuevo;
	} else{
                  NodoDobleC aux=cabeza;
                  while(aux.getSiguiente()!=cabeza)
                           aux=aux.getSiguiente();
                  aux.setSiguiente(nuevo);
                  nuevo.setAnterior(aux);
                  nuevo.setSiguiente(cabeza);
                  cabeza.setAnterior(nuevo);
        }
      }

	
	
	
	 public void buscar(String dato){
	        NodoDobleC aux=cabeza;
	        int con=1;
	        
	            while(aux!=null){
	                if (aux.getElemento().equalsIgnoreCase(dato)){
	                  
	                	
	                	  System.out.println("Elemento encontrado: "+aux.getElemento());
	                    System.out.println	("Su posicion es: "+ con );

	                }
	                con ++;
	                aux=aux.getSiguiente();
	                
	                
	                 
	            }
	        }
	 
	 
	 
	//Cuenta el numero de elementos 
	 
		 public long tamañooo(){
		     NodoDobleC aux;
		     tamaño=0;
		     aux = cabeza;

		     while(aux != null){
		         tamaño++;
		         aux = aux.getSiguiente();
		     }
		   //  System.out.println("El tamaño de la lista es: "+tamaño);
		     return tamaño;
		 }
	 
	 
	 
	 
//Buscar Elemento por posicion 
	 
public void buscarPos(int pos){
		 
	     NodoDobleC aux= cabeza;
	     int contador=1;

	     if(pos<1 || pos>=tamañooo()){
	         System.out.println("Posicion Incorrecta");
	     }else{
	         while(aux!=null){
	             if (pos == contador){
	                 System.out.println("Elemento encontrado: "+aux.getElemento());
	                 System.out.println	("Su posicion es: "+ pos);
	                 aux=null;
	                 }
	                 
	             else{                 
	                 aux=aux.getSiguiente();
	                 contador++;
	             }
	         }
	     }
	 }



// Eliminar por Dato 

public void eliminarElemento(String dato){
    if (cabeza != null){
               NodoDobleC aux = cabeza;
               NodoDobleC ant = null;
               while (aux != null){
                           if (aux.getElemento().equals(dato)  ){
                                       if (ant == null){
                                                   cabeza = cabeza.getSiguiente();
                                                   aux.setSiguiente(null);
                                                   aux= cabeza;
                                      
                                       }else {
                                                   ant.setSiguiente(aux.getSiguiente());
                                                   aux.setSiguiente(null);
                                                   aux = ant.getSiguiente();
                                       }                                             
                                       }else{
                                                   ant = aux;
                                                   aux = aux.getSiguiente();
                                       }
                           }
               }
              
    }


	
	// Imprime la lista 
	
public void imprimir()
{
       System.out.println(" << LISTA ASCENDENTE >> ");
   NodoDobleC actual = cabeza;
  
   while(actual!=ultimo)
   {
       System.out.println(actual.getElemento());
       actual=actual.getSiguiente();
   }
        //  System.out.println(actual.getElemento());
            
}





}
