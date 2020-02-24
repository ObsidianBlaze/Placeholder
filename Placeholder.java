/*
    Code written and maintained by Osas/ObsidianBlaze
*/

package placeholder;

//importing the needed swing components.
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.event.MouseListener;
import java.awt.Color;

public class Placeholder extends JFrame {

    JLabel label;
    JButton button;
    JTextField textField;

    //Creating a constructor for the class
    public Placeholder() {
        //Adding the label's constructor.
        label = new JLabel("Enter a text:");
        //Setting the label's size and position
        label.setBounds(100, 70, 200, 200);

        //Adding the button's constructor.
        button = new JButton("Submit.");
        //Setting the label's size and position
        button.setBounds(350, 200, 100, 30);

        //Adding the label's constructor.
        textField = new JTextField("Input a text:");
        //Setting the label's size and position
        textField.setBounds(100, 200, 200, 200);

        //Using Focus Listeners.
        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textField.setForeground(Color.BLACK);
                if (textField.getText().equals("Input a text:")) {
                    textField.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (textField.getText().equals("")) {
                    textField.setText("Input a text:");
                    textField.setForeground(Color.gray);
                }
            }
        });

        /*
        
        Uncomment this to use mouse and key listeners.
        
        //Adding events to handle the logic of the placeholder.
        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (textField.getText().equals("Input a text:")) {
                    textField.setText("");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

        });
        textField.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (textField.getText().equals("Input a text:")) {
                    textField.setText("");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (textField.getText().equals("")) {
                    textField.setText("Input a text:");
                }
            }
        });

         */
        //Setting the layout.
        setLayout(null);
        //Adding the title of the frame.
        setTitle("Placeholder");
        //Closing the frame when the exit button is clicked.
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Displaying the frame.
        setVisible(true);
        //Setting the size of the frame.
        setSize(500, 500);
        //Adding the components to the frame.
        add(label);
        add(button);
        add(textField);

    }

    public static void main(String[] args) {
//        Creating the instance of the class.
        Placeholder p = new Placeholder();

    }
}
