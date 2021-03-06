
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class ToolBar extends JFrame{
    
    JToolBar tb;
    JButton exit;
    
    public ToolBar(){
        
        setSize(400,400);
        setTitle("ToolBar test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        tb=new JToolBar();
        exit=new JButton("Exit");
        
        tb.add(exit);
        //tb.setFloatable(false);
        add(tb, BorderLayout.NORTH);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ToolBar t=new ToolBar();
        t.setVisible(true);
    }
    
}
