public class NodoLista {
int dato;
NodoLista siguiente;
NodoLista anterior;

public NodoLista(int dato) {
this.dato = dato;
this.siguiente = null;
this.anterior = null;
}
}

public class ListaDoblementeEnlazada {
NodoLista inicio;

public ListaDoblementeEnlazada() {
this.inicio = null;
}