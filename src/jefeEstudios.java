import javax.swing.*;
import java.awt.*;

public class jefeEstudios extends JFrame {


    JButton listasBtn;
    JButton cuestionariosBtn;
    JButton amonestacionesBtn;
    JButton reunionesBtn;
    JButton horariosBtn;
    JButton quejasBtn;


    public jefeEstudios() {
        super("jefeEstudios");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());


        JPanel general = new JPanel();
        general.setLayout(new GridLayout(3, 2, 20, 1));

        JPanel principal = new JPanel();

        JMenuBar mb = new JMenuBar();

        JMenu listas = new JMenu("Listas");


        JRadioButtonMenuItem listasDam = new JRadioButtonMenuItem("DAM");

        JRadioButtonMenuItem listasCin = new JRadioButtonMenuItem("CIN");

        JRadioButtonMenuItem listasMip = new JRadioButtonMenuItem("MIP");


        JMenu cuestionarios = new JMenu("Cuestionarios");

        JRadioButtonMenuItem cuestionarioDam = new JRadioButtonMenuItem("DAM");

        JRadioButtonMenuItem cuestionarioCin = new JRadioButtonMenuItem("CIN");

        JRadioButtonMenuItem cuestionarioMip = new JRadioButtonMenuItem("MIP");


        JMenu amonestaciones = new JMenu("Amonestaciones");

        JRadioButtonMenuItem amonestacionesDam = new JRadioButtonMenuItem("DAM");

        JRadioButtonMenuItem amonestacionesCin = new JRadioButtonMenuItem("CIN");

        JRadioButtonMenuItem amonestacionesMip = new JRadioButtonMenuItem("MIP");


        JMenu reuniones = new JMenu("Reuniones");

        JRadioButtonMenuItem reunionesDam = new JRadioButtonMenuItem("DAM");

        JRadioButtonMenuItem reunionesCin = new JRadioButtonMenuItem("CIN");

        JRadioButtonMenuItem reunionesMip = new JRadioButtonMenuItem("MIP");


        JMenu horarios = new JMenu("Horarios");

        JRadioButtonMenuItem horariosDam = new JRadioButtonMenuItem("DAM");

        JRadioButtonMenuItem horariosCin = new JRadioButtonMenuItem("CIN");

        JRadioButtonMenuItem horariosMip = new JRadioButtonMenuItem("MIP");


        JMenu quejas = new JMenu("Quejas");

        JRadioButtonMenuItem quejasDam = new JRadioButtonMenuItem("DAM");

        JRadioButtonMenuItem quejasCin = new JRadioButtonMenuItem("CIN");

        JRadioButtonMenuItem quejasMip = new JRadioButtonMenuItem("MIP");


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

        listas.add(listasDam);
        listas.add(listasCin);
        listas.add(listasMip);

        mb.add(cuestionarios);

        cuestionarios.add(cuestionarioDam);
        cuestionarios.add(cuestionarioCin);
        cuestionarios.add(cuestionarioMip);

        mb.add(amonestaciones);

        amonestaciones.add(amonestacionesDam);
        amonestaciones.add(amonestacionesCin);
        amonestaciones.add(amonestacionesMip);

        mb.add(reuniones);

        reuniones.add(reunionesDam);
        reuniones.add(reunionesCin);
        reuniones.add(reunionesMip);

        mb.add(horarios);

        horarios.add(horariosDam);
        horarios.add(horariosCin);
        horarios.add(horariosMip);

        mb.add(quejas);

        quejas.add(quejasDam);
        quejas.add(quejasCin);
        quejas.add(quejasMip);

        add(general);
        general.add(principal);
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

    public static void main(String[] args) {
        new jefeEstudios();

    }
}

