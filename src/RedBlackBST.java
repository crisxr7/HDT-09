/*
 * Universidad del Valle de Guatemala
 *
 * Implementacion de mapeo
 * 
 * Autores:
 * 	Cristhian Chilel - 12417	
 * 	Cristian del Carmen - 12961
 */

public class RedBlackBST implements WordSet {
    /**
     * Construct the tree.
     */
    private RBTree<Integer,Word> base;
    private int i = 0;
    
    public RedBlackBST( ) {
        base = new RBTree<Integer,Word>();
    }

    @Override
    public void add(Word wordObject) {
        base.insert(i,wordObject);
        i++;
        
    }

    @Override
    public Word get(Word word) {
        for (int j=0;j<i;j++){
            Word temp = base.lookup(j);
            if (temp.equals(word)) return temp;
        }
        return null; 
    }
      
}
