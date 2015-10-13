/*
 * Universidad del Valle de Guatemala
 *
 * Implementacion de mapeo
 * 
 * Autores:
 * 	Cristhian Chilel - 12417	
 * 	Cristian del Carmen - 12961
 */

public class SplayTreeWord implements WordSet {
    private SplayTree base;
    private int i = 0;
    
    public SplayTreeWord( ) {
        base = new SplayTree();
    }

    @Override
    public void add(Word wordObject) {
        base.insert(wordObject);
        i++;
        
    }

    @Override
    public Word get(Word word) {
        return base.find(word);
    }
    
}
