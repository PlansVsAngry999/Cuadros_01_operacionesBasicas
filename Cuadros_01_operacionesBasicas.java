package cuadros_01_operacionesbasicas;
/**
 * Programa que suma, resta, multiplica y divide dos numeros a traves de cuadros de dialogo.
 * 06 programa -- Jueves 14/09/2023
 * @author Ricardo Daniel Hernandez Sosa G301
 */
import javax.swing.JOptionPane;
public class Cuadros_01_operacionesBasicas {
    public static void main(String[] args) {
        double num1,num2,a,s,m,d;
        String ops1,ops2;
        JOptionPane.showMessageDialog(null,"Operaciones Aritmeticas"); //Imprime un cuadro con un solo boton.
        
        ops1=JOptionPane.showInputDialog("Ingresa el primer numero: ");
        num1=Double.parseDouble(ops1); //Conversion de tipos (String -> Double)
        //-------------------------
        ops2=JOptionPane.showInputDialog("Ingresa el segundo numero: ");
        num2=Double.parseDouble(ops2); //Conversion de tipos (String -> Double)
        a = num1+num2;
        s = num1-num2;
        m = num1*num2;
        d = num1/num2;
        
        JOptionPane.showMessageDialog(null,num1+" + "+num2+"="+a);
        JOptionPane.showMessageDialog(null,num1+" - "+num2+"="+s);
        JOptionPane.showMessageDialog(null,num1+" x "+num2+"="+m);
        JOptionPane.showMessageDialog(null,num1+" / "+num2+"="+d);
    }
}
