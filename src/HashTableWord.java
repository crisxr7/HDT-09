/*
 * Universidad del Valle de Guatemala
 *
 * Implementacion de mapeo
 * 
 * Autores:
 * 	Cristhian Chilel - 12417	
 * 	Cristian del Carmen - 12961
 */



import java.util.Hashtable;
import java.util.Iterator;


public class HashTableWord implements WordSet{
    private Hashtable<Integer,Word> base;
    private int i = 0;
	
    public HashTableWord()
    {
        base = new Hashtable<>();
    }    

    @Override
    public void add(Word wordObject) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        base.put(i,wordObject);
        i++;
    }

    @Override
    public Word get(Word word) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Iterator<Integer> it = base.keySet().iterator();
        while(it.hasNext()){
            Integer key = it.next();
            if (base.get(key).equals(word)) return base.get(key);
        }
        return null;        
    }
    
}
