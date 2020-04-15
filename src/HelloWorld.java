import javax.swing.JOptionPane;

public class HelloWorld {
public static void main(String[] args) {
	System.out.println(" hello world! ");
	JOptionPane.showMessageDialog(null, "HELLO WORLD!");
	String name = JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showMessageDialog(null, "Hello " + name + "!");
}
}
