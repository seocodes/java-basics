import javax.swing.JOptionPane;

public class ShowInfo {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "Hello, "+name+"!");

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: ")); //showInputDialog returns a string, and parseInt changes to int
        JOptionPane.showMessageDialog(null, "You are "+age+" years old.");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height: "));
        JOptionPane.showMessageDialog(null, "You are "+height+" cm tall.");

    }
}