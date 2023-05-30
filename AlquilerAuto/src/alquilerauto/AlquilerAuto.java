package alquilerauto;
import javax.swing.JOptionPane;

public class AlquilerAuto {

    public static void main(String[] args) {

        int Montofj = 300000, MontoAd = 15000, Kilometros = 0, KimAd = 0, Valor = 0, Vtotal = 0;

        Kilometros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de kilometros recorridos"));

        if (Kilometros <= 300)
        {
           JOptionPane.showMessageDialog(null,"El valor a pagar es: " + Montofj );

        }

        else if (Kilometros > 300)

        {
           KimAd = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de kilometros adicionales"));

           Valor = KimAd * MontoAd;

           JOptionPane.showMessageDialog(null, "El valor a pagar por kilometros adicionales es: " + Valor);


            Vtotal = Valor + Montofj;


            JOptionPane.showMessageDialog(null, "El valor total a pagar es: " + Vtotal);

        }

    }

}
