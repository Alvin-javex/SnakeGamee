import javax.swing.JFrame;
public class GameFrame  extends JFrame {
      
    GameFrame(){
        
        this.add(new GamePanel());//mete na janela esse painel vai desenhar a comida e cobr
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();// ///
        
        this.setVisible(true);


    }

}
