import jbotsim.Link;
import jbotsim.Node;

import java.awt.*;

/**
 * Created by ytricha on 07/02/18.
 */
public class PPNodeCounting1 extends PPNode {

    int cpt ;
    @Override
    public void onStart() {
        setColor(Color.blue);
    }
    @Override
    public void onSelection() {
        setColor(Color.red);
        cpt = 0 ;
    }
    @Override
    public void interactWith(Node responder) {

        if(this.getColor()==Color.red && responder.getColor() == Color.blue)
        {
            responder.setColor(Color.YELLOW);
            cpt ++ ;
        }
        if(this.getColor()==Color.yellow && responder.getColor() == Color.red)
        {
            responder.setColor(Color.YELLOW);
            cpt++;
        }
    }


    public String toString()
    {
        return Integer.toString(cpt);
    }
    @Override
    public void onLinkRemoved(Link l)
    {

    }

}
