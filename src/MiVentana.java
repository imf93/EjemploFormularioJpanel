import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiVentana extends JFrame {
    JButton boton;
    public MiVentana() {

        super("Titulo de ventana");

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        JPanel panelFecha = new JPanel();
        panelFecha.setLayout(new FlowLayout());
        panelFecha.add(new JTextField(2));
        panelFecha.add(new JLabel("/"));
        panelFecha.add(new JTextField(2));
        panelFecha.add(new JLabel("/"));
        panelFecha.add(new JTextField(2));
        // Panel de datos
        JPanel panelDatos = new JPanel();
        GridLayout gl = new GridLayout(3,2,0,5);
        panelDatos.setLayout(gl);
        panelDatos.add(new JLabel("Nombre:"));
        panelDatos.add(new JTextField(10));
        panelDatos.add(new JLabel("DNI:"));
        panelDatos.add(new JTextField(10));
        panelDatos.add(new JLabel("Fecha de nacimiento: "));
        panelDatos.add(panelFecha);
       // panelDatos.add(new JLabel("Genero:"));

// Panel de botones
        JRadioButton rbtn1=new JRadioButton("Hombre",false);
        JRadioButton rbtn2=new JRadioButton("Mujer",false);

        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout());
        panelBotones.add(new JButton("Aceptar"));
        panelBotones.add(new JButton("Cancelar"));

        ButtonGroup grupo1 = new ButtonGroup();
        grupo1.add(rbtn1);
        grupo1.add(rbtn2);




        cp = getContentPane();
        cp.add(panelDatos, BorderLayout.NORTH);
        cp.add(panelBotones, BorderLayout.SOUTH);
      //  cp.add(rbtn1, BorderLayout.CENTER);
        //cp.add(rbtn2, BorderLayout.SOUTH);



        }




            }







