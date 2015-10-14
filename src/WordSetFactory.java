/*
UVG
Algoritmos y Estructuras de Datos - 2011
Hoja de trabajo 7 
Autor: Eduardo Castellanos

Descripci�n: WordSetFactory. Clase  utilizada para instanciar los diferentes tipos de sets.

Modificado por:
 	  Cristhian Chilel - 12417	
  	Cristian del Carmen - 12961
*/
class WordSetFactory {
	
	// Metodo que genera un objeto que implementa WordSet
	// parametro tipo: 1 = SimpleSet
	//                         2 = implementado con Red black tree
	//                         3 = implementado con Splay Tree
	//                         4 = implementado con Hash Table
	//                         5 = implementado con TreeMap (de Java Collection Framework)
	
	public static WordSet generateSet(int tipo)
	{
	    if (tipo == 1) return new SimpleSet();
            if (tipo == 2) return new RedBlackBST();
            if (tipo == 3) return new SplayTreeWord();
            if (tipo == 4) return new HashTableWord();
            if (tipo == 5) return new TreeMapWord();
            return new SimpleSet();
	}
	
	
}
