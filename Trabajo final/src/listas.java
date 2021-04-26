import net.sourceforge.jdatepicker.JDatePicker;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class listas  extends JFrame {
    conexionbasedatos SQL = new conexionbasedatos();
    // Llamas al método que tiene la clase y te devuelve una conexión
    Connection conn = SQL.conectarMySQL();

    // Query que usarás para hacer lo que necesites

    Statement st = conn.createStatement();

    static ArrayList<String> resultadosdam = new ArrayList<>();

    private JLabel titulop;
    private JComboBox asignatura;
    private JTable table;
    private DefaultTableModel model;
    private  JFrame f;
    String[][] data = {
            { "4031", "CSE"},
            {"Anand Jha", "6014", "IT"}
    };




    public listas() throws SQLException {
        super("Listas");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //this.setResizable(false);
        setLayout(new FlowLayout()); // Cuando creas la ventana,defines la plantilla/distribucion

        JPanel general = new JPanel();
        general.setLayout(new GridLayout(3, 1));

        JPanel titulo = new JPanel();
        titulop = new JLabel("Bienvenido");
        titulo.add(titulop);

        JPanel opciones = new JPanel();
        opciones.setLayout(new GridLayout(1, 4, 12, 0));
        opciones.add(new JLabel(" "));
        opciones.add(new JLabel(" "));

        DatePicker fecha = new DatePicker(LocalDate.now());
        UtilDateModel model = new UtilDateModel();
        model.setDate(2021, 3, 23);
        model.setSelected(true);
        JDatePanelImpl datePanel = new JDatePanelImpl(model);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
        opciones.add(datePicker);
        asignatura = new JComboBox();
        asignatura.addItem("Programacion");
        asignatura.addItem("Bases de datos");
        opciones.add(asignatura);

        fecha.setEditable(false);
        JPanel tabla = new JPanel();
        JFrame f;
        // Table
        JTable j;
        f = new JFrame();
        String nombresxasignatura="select * from  listaDam" ;
        PreparedStatement abrir= conn.prepareStatement(nombresxasignatura);
        ResultSet resultadosxasignatura= abrir.executeQuery();
        while(resultadosxasignatura.next()) {
            System.out.print("ID: " + resultadosxasignatura.getInt(1));
            System.out.print("\tClase: " + resultadosxasignatura.getString(2));
            System.out.println("\tCurso: " + resultadosxasignatura.getString(3));

            resultadosdam.add(resultadosxasignatura.getString(1));
            resultadosdam.add(resultadosxasignatura.getString(2));
            resultadosdam.add(resultadosxasignatura.getString(3));

            System.out.println(resultadosdam);
        }

        String[][] datoslista= {
                {resultadosdam.get(1) , resultadosdam.get(2)},
                { resultadosdam.get(4), resultadosdam.get(5) },
        };

        // Column Names
        String[] listaalumnos = { "Nombre", "Apellidos" };

        // Initializing the JTable

        j = new JTable(datoslista, listaalumnos);
        j.setBounds(30, 40, 200, 300);

        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        // Frame Size
        f.setSize(500, 200);
        // Frame Visible = true
        f.setVisible(true);

        //JButton btnAadirLnea = new JButton("Meter contenido");
        //btnAadirLnea.addActionListener(new listenerbtn());
        tabla.add(table);



            // Data to be displayed in the JTable

        //JPanel tabla = new JPanel();
            // Column Names
        //String[] listaalumnos = {"Nombre", "Apellidos", "Curso"};

            // Initializing the JTable

            //table = new JTable( data , listaalumnos);

            //table.setBounds(30, 40, 200, 300);

            // adding it to JScrollPane
            //JScrollPane sp = new JScrollPane(table);
            //f.add(sp);
//tabla.add(table);


        //JScrollPane scrollPane = new JScrollPane();
        //scrollPane.setBounds(10, 11, 560, 227);
        //tabla.add(scrollPane);
        //table = new JTable((TableModel) model);
        //scrollPane.setViewportView(table);
        //JButton btnAadirLnea = new JButton("Meter contenido");
        //btnAadirLnea.addActionListener(new listenerbtn());
        //tabla.add(table);


        general.add(titulo);
        general.add(opciones);
        //general.add(tabla);
        add(general);
        setSize(1280, 720);

        setVisible(true);
    }

    public static void main() throws SQLException {
        listas v1 = new listas();
    }


    private class DatePicker {
        public DatePicker(LocalDate now) {

        }

        public DatePicker() {

        }

        public void setEditable(boolean b) {
        }
    }

    private class listenerbtn implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < 100; i++) {

            }
        }
    }
}
