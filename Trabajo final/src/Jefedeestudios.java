import javax.swing.*;
import java.awt.*;

public class Jefedeestudios extends JFrame {


        JButton listasBtn;
        JButton cuestionariosBtn;
        JButton amonestacionesBtn;
        JButton reunionesBtn;
        JButton horariosBtn;
        JButton quejasBtn;


        public Jefedeestudios() {
            super("jefeEstudios");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLayout(new FlowLayout());


            JPanel general = new JPanel();
            general.setLayout(new GridLayout(3, 2, 20, 1));


            JMenuBar mb = new JMenuBar();

            JMenu listas = new JMenu("Listas");

            JRadioButtonMenuItem curso1 = new JRadioButtonMenuItem("DAM");

            JRadioButtonMenuItem curso2 = new JRadioButtonMenuItem("CIN");

            JRadioButtonMenuItem curso3 = new JRadioButtonMenuItem("MIP");


            JMenu cuestionarios = new JMenu("Cuestionarios");

            JRadioButtonMenuItem curso11 = new JRadioButtonMenuItem("DAM");

            JRadioButtonMenuItem curso21 = new JRadioButtonMenuItem("CIN");

            JRadioButtonMenuItem curso31 = new JRadioButtonMenuItem("MIP");


            JMenu amonestaciones = new JMenu("Amonestaciones");

            JRadioButtonMenuItem curso12 = new JRadioButtonMenuItem("DAM");

            JRadioButtonMenuItem curso22 = new JRadioButtonMenuItem("CIN");

            JRadioButtonMenuItem curso32 = new JRadioButtonMenuItem("MIP");


            JMenu reuniones = new JMenu("Reuniones");

            JRadioButtonMenuItem curso13 = new JRadioButtonMenuItem("DAM");

            JRadioButtonMenuItem curso23 = new JRadioButtonMenuItem("CIN");

            JRadioButtonMenuItem curso33 = new JRadioButtonMenuItem("MIP");


            JMenu horarios = new JMenu("Horarios");

            JRadioButtonMenuItem curso14 = new JRadioButtonMenuItem("DAM");

            JRadioButtonMenuItem curso24 = new JRadioButtonMenuItem("CIN");

            JRadioButtonMenuItem curso34 = new JRadioButtonMenuItem("MIP");


            JMenu quejas = new JMenu("Quejas");

            JRadioButtonMenuItem curso15 = new JRadioButtonMenuItem("DAM");

            JRadioButtonMenuItem curso25= new JRadioButtonMenuItem("CIN");

            JRadioButtonMenuItem curso35 = new JRadioButtonMenuItem("MIP");



            listasBtn = new JButton("Crear " +
                    "listas");


            cuestionariosBtn = new JButton("Crear " +
                    "cuestionarios");


            amonestacionesBtn = new JButton("Crear " +
                    "amonestaciones");


            reunionesBtn = new JButton("Crear " +
                    "reuniones");


            horariosBtn = new JButton("Crear " +
                    "horarios");

            quejasBtn = new JButton("Resolver " +
                    "quejas");

            mb.add(listas);

            listas.add(curso1);
            listas.add(curso2);
            listas.add(curso3);

            mb.add(cuestionarios);

            cuestionarios.add(curso11);
            cuestionarios.add(curso21);
            cuestionarios.add(curso31);

            mb.add(amonestaciones);

            amonestaciones.add(curso12);
            amonestaciones.add(curso22);
            amonestaciones.add(curso32);

            mb.add(reuniones);

            reuniones.add(curso13);
            reuniones.add(curso23);
            reuniones.add(curso33);

            mb.add(horarios);

            horarios.add(curso14);
            horarios.add(curso24);
            horarios.add(curso34);

            mb.add(quejas);

            quejas.add(curso15);
            quejas.add(curso25);
            quejas.add(curso35);

            add(general);
            setJMenuBar(mb);

            general.add(new JLabel());
            general.add(new JLabel());
            general.add(new JLabel());
            general.add(new JLabel());

            general.add(listasBtn);
            general.add(cuestionariosBtn);
            general.add(amonestacionesBtn);
            general.add(new JLabel());
            general.add(reunionesBtn);
            general.add(horariosBtn);
            general.add(quejasBtn);


            setSize(600, 200);
            setVisible(true);
        }

        public static void main() {
            new Jefedeestudios();

        }
    }

