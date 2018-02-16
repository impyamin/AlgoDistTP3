import jbotsim.Link;
import jbotsim.Node;

import java.awt.*;

/**
 * Created by ytricha on 16/02/18.
 */
public class TP3 extends PPNode {

    Node parent;
    @Override
    public void onStart() {
        setColor(Color.BLUE);
    }

    @Override
    public void onSelection() {
    }

    @Override
    public void interactWith(Node responder) {
        TP3 node= (TP3)responder;
        if(this.getColor() == Color.BLUE && node.getColor()==Color.black)
        {
            this.setColor(Color.BLACK);
            node.setColor(Color.BLUE);
            this.getCommonLinkWith(responder).setColor(Color.cyan);
        }

        if(this.getColor()==node.getColor())
        {
            this.setColor(Color.BLACK);
            parent = node;
        }
        if(this.getColor()==Color.black && this.getNeighbors()==null)
        {
            this.setColor(Color.BLUE);
        }


    }

    @Override
    public void onLinkRemoved(Link l)
    {
        this.setColor(Color.BLUE);
        //l.getOtherEndpoint(this).setColor(Color.black);
    }

}
