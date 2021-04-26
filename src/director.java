import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class director extends JFrame {

    private static WebDriver driver;
    JButton listasBtn;
    JButton cuestionariosBtn;
    JButton amonestacionesBtn;
    JButton reunionesBtn;
    JButton horariosBtn;
    JButton quejasBtn;


    public director() {
        super("director");
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

        cuestionarioDam.addActionListener(new cuestDam());

        cuestionarioCin.addActionListener(new cuestCin());

        cuestionarioMip.addActionListener(new cuestMip());

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


        listasBtn = new JButton("Listado Alumnos");


        cuestionariosBtn = new JButton("Ver cuestionarios");


        amonestacionesBtn = new JButton("Ver amonestaciones");


        reunionesBtn = new JButton("Crear reuniones");


        horariosBtn = new JButton("Ver horarios");

        quejasBtn = new JButton("Ver quejas");


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


        setSize(650, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new director();

    }

    public static void Busqueda1() {

        String exePath = "..\\proyecto-final\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);

        ChromeOptions options = new ChromeOptions();
        ChromeOptions chromeOptions = options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.get("https://www.google.es/intl/es/forms/about/");

    }

    private class cuestDam implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Busqueda1();

        }
    }

    private class cuestCin implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Busqueda1();

        }
    }

    private class cuestMip implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Busqueda1();
        }
    }
}

