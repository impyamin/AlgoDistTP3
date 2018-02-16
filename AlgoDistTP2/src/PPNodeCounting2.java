import jbotsim.Link;
import jbotsim.Node;

import java.awt.*;

/**
 * Created by ytricha on 07/02/18.
 */
public class PPNodeCounting2 extends PPNode {

    int cpt ;
    @Override
    public void onStart() {
    cpt =1;
    }
    @Override
    public void onSelection() {
       // setColor(Color.red);
    }
    @Override
    public void interactWith(Node responder) {
        PPNodeCounting2 Node = (PPNodeCounting2)responder;
        if(this.cpt >= Node.cpt )
        {
            this.cpt = this.cpt +Node.cpt;
            Node.cpt = 0 ;
        }
        else
        {
            Node.cpt = this.cpt +Node.cpt;
            this.cpt = 0;
        }
    }
    @Override
    public void onLinkRemoved(Link l)
    {

    }

    public String toString()
    {
        return Integer.toString(this.cpt);
    }


}
