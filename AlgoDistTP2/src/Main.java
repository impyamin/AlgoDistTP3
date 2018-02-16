

import jbotsim.Topology;
import jbotsim.ui.JViewer;

public class Main {
    public static void main(String[] args) {
        Topology tp = new Topology();
        tp.setDefaultNodeModel(TP3.class);
        tp.setClockSpeed(150);
        new PPScheduler(tp);
        new JViewer(tp);
    }
}