/**
 * Created by ytricha on 07/02/18.
 */

import jbotsim.*;


public  abstract class PPNode extends Node{

    public abstract void onStart();
    public abstract void onSelection();
    public abstract void interactWith(Node responder);
    public abstract void onLinkRemoved(Link l);




}
