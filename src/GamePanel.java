import javax.swing.JPanel;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class GamePanel extends JPanel implements AncestorListener {



    GamePanel(){
        
    }




    @Override
    public void ancestorAdded(AncestorEvent event) {
        
        throw new UnsupportedOperationException("Unimplemented method 'ancestorAdded'");
    }

    @Override
    public void ancestorRemoved(AncestorEvent event) {
       
        throw new UnsupportedOperationException("Unimplemented method 'ancestorRemoved'");
    }

    @Override
    public void ancestorMoved(AncestorEvent event) {
        
        throw new UnsupportedOperationException("Unimplemented method 'ancestorMoved'");
    }
    
}
