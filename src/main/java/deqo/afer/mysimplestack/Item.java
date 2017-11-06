package deqo.afer.mysimplestack;

/**
 * Created by frl1412a on 19/10/2017.
 */
public class Item {
    /* Un commentaire repondant a l'exigence etape 2 */
    private Object valeur;

    public Item(Object item) {
        this.valeur = item;
    }

    public Object getItem() {
        return valeur;
    }

    public void setItem(int item) {
        this.valeur = item;
    }


}
