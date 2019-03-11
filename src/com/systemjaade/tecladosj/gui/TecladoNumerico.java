package com.systemjaade.tecladosj.gui;

import com.sun.awt.AWTUtilities;
import com.systemjaade.tecladosj.components.PanelDegradado;
import com.systemjaade.tecladosj.components.PanelTranslucido;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.RoundRectangle2D;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.text.JTextComponent;

/**
 * Clase TecladoNumerico.java
 *
 * @author Tarazona Marrujo Elí Gamaliel - "System JAADE S.A.C."
 * @version 11-mar-2019 12:10:55 SJ
 */
@SuppressWarnings("serial")
public class TecladoNumerico extends JDialog implements ActionListener {

  private JTextComponent txt;
  private boolean estado = true;//true = mayuscula, false = minuscula
  int xx;
  int yy;

  // Variables declaration - do not modify     
  public static String ENTER_NUMERICO_AMARILLO = "/com/systemjaade/tecladosj/img/enterNumericoAmarillo.png";
  public static String ENTER_NUMERICO_ANARANJADO = "/com/systemjaade/tecladosj/img/enterNumericoAnaranjado.png";
  public static String ENTER_NUMERICO_AZUL = "/com/systemjaade/tecladosj/img/enterNumericoAzul.png";
  public static String ENTER_NUMERICO_CELESTE = "/com/systemjaade/tecladosj/img/enterNumericoCeleste.png";
  public static String ENTER_NUMERICO_FUCHSIA = "/com/systemjaade/tecladosj/img/enterNumericoFuchsia.png";
  public static String ENTER_NUMERICO_MORADO = "/com/systemjaade/tecladosj/img/enterNumericoMorado.png";
  public static String ENTER_NUMERICO_ROJO = "/com/systemjaade/tecladosj/img/enterNumericoRojo.png";
  public static String ENTER_NUMERICO_ROSA = "/com/systemjaade/tecladosj/img/enterNumericoRosa.png";
  public static String ENTER_NUMERICO_VERDE = "/com/systemjaade/tecladosj/img/enterNumericoVerde.png";
  private JButton btn0;
  private JButton btn1;
  private JButton btn2;
  private JButton btn3;
  private JButton btn4;
  private JButton btn5;
  private JButton btn6;
  private JButton btn7;
  private JButton btn8;
  private JButton btn9;
  private JButton btnBorrar;
  private JButton btnCloseParentesis;
  private JButton btnComa;
  public static JButton btnEnter;
  private JButton btnEntre;
  private JButton btnEspacio;
  private JButton btnIgual;
  private JButton btnMas;
  private JButton btnMenos;
  private JButton btnOpenParentesis;
  private JButton btnPor;
  private JButton btnPorcentaje;
  private JButton btnPunto;
  private JButton btnSimbolos;
  private JLabel jLabel1;
  private JLabel jLabel10;
  private JLabel jLabel11;
  private JLabel jLabel12;
  private JLabel jLabel13;
  private JLabel jLabel14;
  private JLabel jLabel15;
  private JLabel jLabel16;
  private JLabel jLabel17;
  private JLabel jLabel18;
  private JLabel jLabel19;
  private JLabel jLabel2;
  private JLabel jLabel20;
  private JLabel jLabel21;
  private JLabel jLabel22;
  private JLabel jLabel23;
  private JLabel jLabel24;
  private JLabel jLabel25;
  private JLabel jLabel26;
  private JLabel jLabel27;
  private JLabel jLabel28;
  private JLabel jLabel29;
  private JLabel jLabel3;
  private JLabel jLabel30;
  private JLabel jLabel31;
  private JLabel jLabel32;
  private JLabel jLabel4;
  private JLabel jLabel5;
  private JLabel jLabel6;
  private JLabel jLabel7;
  private JLabel jLabel8;
  private JLabel jLabel9;
  private JPanel jPanel1;
  private JPanel jPanel2;
  private JPanel jPanel3;
  private JPanel jPanel6;
  private PanelDegradado panelDegradado;
  private PanelTranslucido panelTranslucido;

  public void setColorPrimary(Color color) {
    panelDegradado.setColor1(color);
  }

  public void setColorSecondary(Color color) {
    panelDegradado.setColor2(color);
  }

  public void setBtnEnterColor(String color) {
    btnEnter.setIcon(new ImageIcon(getClass().getResource(color))); // NOI18N
  }

  // End of variables declaration   
  public TecladoNumerico(JTextComponent txt) {
    this.txt = txt;
    this.setSize(500, 260);

    initComponents();
    this.setLocationRelativeTo(null);
    Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 50, 50);
    AWTUtilities.setWindowShape(this, forma);
    pack();
  }

  public TecladoNumerico() {
    this.setSize(500, 260);

    initComponents();
    this.setLocationRelativeTo(null);
    Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 50, 50);
    AWTUtilities.setWindowShape(this, forma);
    pack();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
  private void initComponents() {

    panelDegradado = new PanelDegradado();
    jLabel1 = new JLabel();
    jLabel2 = new JLabel();
    jLabel3 = new JLabel();
    jLabel4 = new JLabel();
    panelTranslucido = new PanelTranslucido();
    jPanel1 = new JPanel();
    jLabel11 = new JLabel();
    btnMas = new JButton();
    jLabel5 = new JLabel();
    btnMenos = new JButton();
    jLabel6 = new JLabel();
    btn1 = new JButton();
    jLabel7 = new JLabel();
    btn2 = new JButton();
    jLabel8 = new JLabel();
    btn3 = new JButton();
    jLabel9 = new JLabel();
    btnPorcentaje = new JButton();
    jLabel10 = new JLabel();
    jPanel2 = new JPanel();
    jLabel13 = new JLabel();
    btnPor = new JButton();
    jLabel18 = new JLabel();
    btnEntre = new JButton();
    jLabel19 = new JLabel();
    btn4 = new JButton();
    jLabel20 = new JLabel();
    btn5 = new JButton();
    jLabel21 = new JLabel();
    btn6 = new JButton();
    jLabel22 = new JLabel();
    btnEspacio = new JButton();
    jLabel12 = new JLabel();
    jPanel3 = new JPanel();
    jLabel15 = new JLabel();
    btnOpenParentesis = new JButton();
    jLabel23 = new JLabel();
    btnCloseParentesis = new JButton();
    jLabel24 = new JLabel();
    btn7 = new JButton();
    jLabel25 = new JLabel();
    btn8 = new JButton();
    jLabel26 = new JLabel();
    btn9 = new JButton();
    jLabel27 = new JLabel();
    btnBorrar = new JButton();
    jLabel14 = new JLabel();
    jPanel6 = new JPanel();
    jLabel17 = new JLabel();
    btnPunto = new JButton();
    jLabel28 = new JLabel();
    btnComa = new JButton();
    jLabel32 = new JLabel();
    btnSimbolos = new JButton();
    jLabel30 = new JLabel();
    btn0 = new JButton();
    jLabel31 = new JLabel();
    btnIgual = new JButton();
    jLabel29 = new JLabel();
    btnEnter = new JButton();
    jLabel16 = new JLabel();

    setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
    setUndecorated(true);
    setResizable(false);

    panelDegradado.setColor1(new Color(140, 253, 253));
    panelDegradado.setColor2(new Color(255, 153, 153));
    panelDegradado.setMaximumSize(new Dimension(500, 260));
    panelDegradado.setMinimumSize(new Dimension(500, 260));
    panelDegradado.setPreferredSize(new Dimension(500, 260));
    panelDegradado.setLayout(new BorderLayout());

    jLabel1.setMaximumSize(new Dimension(15, 15));
    jLabel1.setMinimumSize(new Dimension(15, 15));
    jLabel1.setPreferredSize(new Dimension(15, 15));
    jLabel1.addMouseMotionListener(new MouseMotionAdapter() {
      @Override
      public void mouseDragged(MouseEvent evt) {
        jLabel1MouseDragged(evt);
      }
    });
    jLabel1.addMouseListener(new MouseAdapter() {
      @Override
      public void mousePressed(MouseEvent evt) {
        jLabel1MousePressed(evt);
      }
    });
    panelDegradado.add(jLabel1, BorderLayout.PAGE_START);

    jLabel2.setMaximumSize(new Dimension(15, 15));
    jLabel2.setMinimumSize(new Dimension(15, 15));
    jLabel2.setPreferredSize(new Dimension(15, 15));
    jLabel2.addMouseMotionListener(new MouseMotionAdapter() {
      @Override
      public void mouseDragged(MouseEvent evt) {
        jLabel2MouseDragged(evt);
      }
    });
    jLabel2.addMouseListener(new MouseAdapter() {
      @Override
      public void mousePressed(MouseEvent evt) {
        jLabel2MousePressed(evt);
      }
    });
    panelDegradado.add(jLabel2, BorderLayout.PAGE_END);

    jLabel3.setText("     ");
    jLabel3.setMaximumSize(new Dimension(15, 15));
    jLabel3.setMinimumSize(new Dimension(15, 15));
    jLabel3.setPreferredSize(new Dimension(15, 15));
    jLabel3.addMouseMotionListener(new MouseMotionAdapter() {
      @Override
      public void mouseDragged(MouseEvent evt) {
        jLabel3MouseDragged(evt);
      }
    });
    jLabel3.addMouseListener(new MouseAdapter() {
      @Override
      public void mousePressed(MouseEvent evt) {
        jLabel3MousePressed(evt);
      }
    });
    panelDegradado.add(jLabel3, BorderLayout.LINE_START);

    jLabel4.setMaximumSize(new Dimension(15, 15));
    jLabel4.setMinimumSize(new Dimension(15, 15));
    jLabel4.setPreferredSize(new Dimension(15, 15));
    jLabel4.addMouseMotionListener(new MouseMotionAdapter() {
      @Override
      public void mouseDragged(MouseEvent evt) {
        jLabel4MouseDragged(evt);
      }
    });
    jLabel4.addMouseListener(new MouseAdapter() {
      @Override
      public void mousePressed(MouseEvent evt) {
        jLabel4MousePressed(evt);
      }
    });
    panelDegradado.add(jLabel4, BorderLayout.LINE_END);

    panelTranslucido.setMaximumSize(new Dimension(270, 260));
    panelTranslucido.setMinimumSize(new Dimension(270, 260));
    panelTranslucido.setPreferredSize(new Dimension(270, 260));
    panelTranslucido.setLayout(new GridLayout(4, 1));

    jPanel1.setOpaque(false);
    jPanel1.setLayout(new BoxLayout(jPanel1, BoxLayout.LINE_AXIS));

    jLabel11.setMaximumSize(new Dimension(9, 9));
    jLabel11.setMinimumSize(new Dimension(9, 9));
    jLabel11.setPreferredSize(new Dimension(9, 9));
    jPanel1.add(jLabel11);

    btnMas.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnMas.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
    btnMas.setText("+");
    btnMas.setBorder(null);
    btnMas.setBorderPainted(false);
    btnMas.setContentAreaFilled(false);
    btnMas.setHorizontalTextPosition(SwingConstants.CENTER);
    btnMas.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnMasActionPerformed(evt);
      }

      private void btnMasActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel1.add(btnMas);

    jLabel5.setMaximumSize(new Dimension(9, 9));
    jLabel5.setMinimumSize(new Dimension(9, 9));
    jLabel5.setPreferredSize(new Dimension(9, 9));
    jPanel1.add(jLabel5);

    btnMenos.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnMenos.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
    btnMenos.setText("-");
    btnMenos.setBorder(null);
    btnMenos.setBorderPainted(false);
    btnMenos.setContentAreaFilled(false);
    btnMenos.setHorizontalTextPosition(SwingConstants.CENTER);
    btnMenos.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnMenosActionPerformed(evt);
      }

      private void btnMenosActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel1.add(btnMenos);

    jLabel6.setMaximumSize(new Dimension(9, 9));
    jLabel6.setMinimumSize(new Dimension(9, 9));
    jLabel6.setPreferredSize(new Dimension(9, 9));
    jPanel1.add(jLabel6);

    btn1.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btn1.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/blanco.png"))); // NOI18N
    btn1.setText("1");
    btn1.setBorder(null);
    btn1.setBorderPainted(false);
    btn1.setContentAreaFilled(false);
    btn1.setHorizontalTextPosition(SwingConstants.CENTER);
    btn1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btn1ActionPerformed(evt);
      }

      private void btn1ActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel1.add(btn1);

    jLabel7.setMaximumSize(new Dimension(9, 9));
    jLabel7.setMinimumSize(new Dimension(9, 9));
    jLabel7.setPreferredSize(new Dimension(9, 9));
    jPanel1.add(jLabel7);

    btn2.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btn2.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/blanco.png"))); // NOI18N
    btn2.setText("2");
    btn2.setBorder(null);
    btn2.setBorderPainted(false);
    btn2.setContentAreaFilled(false);
    btn2.setHorizontalTextPosition(SwingConstants.CENTER);
    btn2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btn2ActionPerformed(evt);
      }

      private void btn2ActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel1.add(btn2);

    jLabel8.setMaximumSize(new Dimension(9, 9));
    jLabel8.setMinimumSize(new Dimension(9, 9));
    jLabel8.setPreferredSize(new Dimension(9, 9));
    jPanel1.add(jLabel8);

    btn3.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btn3.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/blanco.png"))); // NOI18N
    btn3.setText("3");
    btn3.setBorder(null);
    btn3.setBorderPainted(false);
    btn3.setContentAreaFilled(false);
    btn3.setHorizontalTextPosition(SwingConstants.CENTER);
    btn3.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btn3ActionPerformed(evt);
      }

      private void btn3ActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel1.add(btn3);

    jLabel9.setMaximumSize(new Dimension(9, 9));
    jLabel9.setMinimumSize(new Dimension(9, 9));
    jLabel9.setPreferredSize(new Dimension(9, 9));
    jPanel1.add(jLabel9);

    btnPorcentaje.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnPorcentaje.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
    btnPorcentaje.setText("%");
    btnPorcentaje.setBorder(null);
    btnPorcentaje.setBorderPainted(false);
    btnPorcentaje.setContentAreaFilled(false);
    btnPorcentaje.setHorizontalTextPosition(SwingConstants.CENTER);
    btnPorcentaje.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnPorcentajeActionPerformed(evt);
      }

      private void btnPorcentajeActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel1.add(btnPorcentaje);

    jLabel10.setMaximumSize(new Dimension(9, 9));
    jLabel10.setMinimumSize(new Dimension(9, 9));
    jLabel10.setPreferredSize(new Dimension(9, 9));
    jPanel1.add(jLabel10);

    panelTranslucido.add(jPanel1);

    jPanel2.setOpaque(false);
    jPanel2.setLayout(new BoxLayout(jPanel2, BoxLayout.LINE_AXIS));

    jLabel13.setMaximumSize(new Dimension(9, 9));
    jLabel13.setMinimumSize(new Dimension(9, 9));
    jLabel13.setPreferredSize(new Dimension(9, 9));
    jPanel2.add(jLabel13);

    btnPor.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnPor.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
    btnPor.setText("*");
    btnPor.setBorder(null);
    btnPor.setBorderPainted(false);
    btnPor.setContentAreaFilled(false);
    btnPor.setHorizontalTextPosition(SwingConstants.CENTER);
    btnPor.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnPorActionPerformed(evt);
      }

      private void btnPorActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel2.add(btnPor);

    jLabel18.setMaximumSize(new Dimension(9, 9));
    jLabel18.setMinimumSize(new Dimension(9, 9));
    jLabel18.setPreferredSize(new Dimension(9, 9));
    jPanel2.add(jLabel18);

    btnEntre.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnEntre.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
    btnEntre.setText("/");
    btnEntre.setBorder(null);
    btnEntre.setBorderPainted(false);
    btnEntre.setContentAreaFilled(false);
    btnEntre.setHorizontalTextPosition(SwingConstants.CENTER);
    btnEntre.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnEntreActionPerformed(evt);
      }

      private void btnEntreActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel2.add(btnEntre);

    jLabel19.setMaximumSize(new Dimension(9, 9));
    jLabel19.setMinimumSize(new Dimension(9, 9));
    jLabel19.setPreferredSize(new Dimension(9, 9));
    jPanel2.add(jLabel19);

    btn4.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btn4.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/blanco.png"))); // NOI18N
    btn4.setText("4");
    btn4.setBorder(null);
    btn4.setBorderPainted(false);
    btn4.setContentAreaFilled(false);
    btn4.setHorizontalTextPosition(SwingConstants.CENTER);
    btn4.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btn4ActionPerformed(evt);
      }

      private void btn4ActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel2.add(btn4);

    jLabel20.setMaximumSize(new Dimension(9, 9));
    jLabel20.setMinimumSize(new Dimension(9, 9));
    jLabel20.setPreferredSize(new Dimension(9, 9));
    jPanel2.add(jLabel20);

    btn5.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btn5.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/blanco.png"))); // NOI18N
    btn5.setText("5");
    btn5.setBorder(null);
    btn5.setBorderPainted(false);
    btn5.setContentAreaFilled(false);
    btn5.setHorizontalTextPosition(SwingConstants.CENTER);
    btn5.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btn5ActionPerformed(evt);
      }

      private void btn5ActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel2.add(btn5);

    jLabel21.setMaximumSize(new Dimension(9, 9));
    jLabel21.setMinimumSize(new Dimension(9, 9));
    jLabel21.setPreferredSize(new Dimension(9, 9));
    jPanel2.add(jLabel21);

    btn6.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btn6.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/blanco.png"))); // NOI18N
    btn6.setText("6");
    btn6.setBorder(null);
    btn6.setBorderPainted(false);
    btn6.setContentAreaFilled(false);
    btn6.setHorizontalTextPosition(SwingConstants.CENTER);
    btn6.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btn6ActionPerformed(evt);
      }

      private void btn6ActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel2.add(btn6);

    jLabel22.setMaximumSize(new Dimension(9, 9));
    jLabel22.setMinimumSize(new Dimension(9, 9));
    jLabel22.setPreferredSize(new Dimension(9, 9));
    jPanel2.add(jLabel22);

    btnEspacio.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnEspacio.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/espacioN.png"))); // NOI18N
    btnEspacio.setText(" ");
    btnEspacio.setBorder(null);
    btnEspacio.setBorderPainted(false);
    btnEspacio.setContentAreaFilled(false);
    btnEspacio.setHorizontalTextPosition(SwingConstants.CENTER);
    btnEspacio.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnEspacioActionPerformed(evt);
      }

      private void btnEspacioActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel2.add(btnEspacio);

    jLabel12.setMaximumSize(new Dimension(9, 9));
    jLabel12.setMinimumSize(new Dimension(9, 9));
    jLabel12.setPreferredSize(new Dimension(9, 9));
    jPanel2.add(jLabel12);

    panelTranslucido.add(jPanel2);

    jPanel3.setOpaque(false);
    jPanel3.setLayout(new BoxLayout(jPanel3, BoxLayout.LINE_AXIS));

    jLabel15.setMaximumSize(new Dimension(9, 9));
    jLabel15.setMinimumSize(new Dimension(9, 9));
    jLabel15.setPreferredSize(new Dimension(9, 9));
    jPanel3.add(jLabel15);

    btnOpenParentesis.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnOpenParentesis.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
    btnOpenParentesis.setText("(");
    btnOpenParentesis.setBorder(null);
    btnOpenParentesis.setBorderPainted(false);
    btnOpenParentesis.setContentAreaFilled(false);
    btnOpenParentesis.setHorizontalTextPosition(SwingConstants.CENTER);
    btnOpenParentesis.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnOpenParentesisActionPerformed(evt);
      }

      private void btnOpenParentesisActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel3.add(btnOpenParentesis);

    jLabel23.setMaximumSize(new Dimension(9, 9));
    jLabel23.setMinimumSize(new Dimension(9, 9));
    jLabel23.setPreferredSize(new Dimension(9, 9));
    jPanel3.add(jLabel23);

    btnCloseParentesis.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnCloseParentesis.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
    btnCloseParentesis.setText(")");
    btnCloseParentesis.setBorder(null);
    btnCloseParentesis.setBorderPainted(false);
    btnCloseParentesis.setContentAreaFilled(false);
    btnCloseParentesis.setHorizontalTextPosition(SwingConstants.CENTER);
    btnCloseParentesis.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnCloseParentesisActionPerformed(evt);
      }

      private void btnCloseParentesisActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel3.add(btnCloseParentesis);

    jLabel24.setMaximumSize(new Dimension(9, 9));
    jLabel24.setMinimumSize(new Dimension(9, 9));
    jLabel24.setPreferredSize(new Dimension(9, 9));
    jPanel3.add(jLabel24);

    btn7.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btn7.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/blanco.png"))); // NOI18N
    btn7.setText("7");
    btn7.setBorder(null);
    btn7.setBorderPainted(false);
    btn7.setContentAreaFilled(false);
    btn7.setHorizontalTextPosition(SwingConstants.CENTER);
    btn7.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btn7ActionPerformed(evt);
      }

      private void btn7ActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel3.add(btn7);

    jLabel25.setMaximumSize(new Dimension(9, 9));
    jLabel25.setMinimumSize(new Dimension(9, 9));
    jLabel25.setPreferredSize(new Dimension(9, 9));
    jPanel3.add(jLabel25);

    btn8.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btn8.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/blanco.png"))); // NOI18N
    btn8.setText("8");
    btn8.setBorder(null);
    btn8.setBorderPainted(false);
    btn8.setContentAreaFilled(false);
    btn8.setHorizontalTextPosition(SwingConstants.CENTER);
    btn8.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btn8ActionPerformed(evt);
      }

      private void btn8ActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel3.add(btn8);

    jLabel26.setMaximumSize(new Dimension(9, 9));
    jLabel26.setMinimumSize(new Dimension(9, 9));
    jLabel26.setPreferredSize(new Dimension(9, 9));
    jPanel3.add(jLabel26);

    btn9.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btn9.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/blanco.png"))); // NOI18N
    btn9.setText("9");
    btn9.setBorder(null);
    btn9.setBorderPainted(false);
    btn9.setContentAreaFilled(false);
    btn9.setHorizontalTextPosition(SwingConstants.CENTER);
    btn9.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btn9ActionPerformed(evt);
      }

      private void btn9ActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel3.add(btn9);

    jLabel27.setMaximumSize(new Dimension(9, 9));
    jLabel27.setMinimumSize(new Dimension(9, 9));
    jLabel27.setPreferredSize(new Dimension(9, 9));
    jPanel3.add(jLabel27);

    btnBorrar.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnBorrar.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/borrarN.png"))); // NOI18N
    btnBorrar.setBorder(null);
    btnBorrar.setBorderPainted(false);
    btnBorrar.setContentAreaFilled(false);
    btnBorrar.setHorizontalTextPosition(SwingConstants.CENTER);
    btnBorrar.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnBorrarActionPerformed(evt);
      }

      private void btnBorrarActionPerformed(ActionEvent evt) {
        txt.setText(txt.getText().substring(0, txt.getText().length() - 1));
      }
    });
    jPanel3.add(btnBorrar);

    jLabel14.setMaximumSize(new Dimension(9, 9));
    jLabel14.setMinimumSize(new Dimension(9, 9));
    jLabel14.setPreferredSize(new Dimension(9, 9));
    jPanel3.add(jLabel14);

    panelTranslucido.add(jPanel3);

    jPanel6.setOpaque(false);
    jPanel6.setLayout(new BoxLayout(jPanel6, BoxLayout.LINE_AXIS));

    jLabel17.setMaximumSize(new Dimension(9, 9));
    jLabel17.setMinimumSize(new Dimension(9, 9));
    jLabel17.setPreferredSize(new Dimension(9, 9));
    jPanel6.add(jLabel17);

    btnPunto.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnPunto.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
    btnPunto.setText(".");
    btnPunto.setBorder(null);
    btnPunto.setBorderPainted(false);
    btnPunto.setContentAreaFilled(false);
    btnPunto.setHorizontalTextPosition(SwingConstants.CENTER);
    btnPunto.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnPuntoActionPerformed(evt);
      }

      private void btnPuntoActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel6.add(btnPunto);

    jLabel28.setMaximumSize(new Dimension(9, 9));
    jLabel28.setMinimumSize(new Dimension(9, 9));
    jLabel28.setPreferredSize(new Dimension(9, 9));
    jPanel6.add(jLabel28);

    btnComa.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnComa.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
    btnComa.setText(",");
    btnComa.setBorder(null);
    btnComa.setBorderPainted(false);
    btnComa.setContentAreaFilled(false);
    btnComa.setHorizontalTextPosition(SwingConstants.CENTER);
    btnComa.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnComaActionPerformed(evt);
      }

      private void btnComaActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel6.add(btnComa);

    jLabel32.setMaximumSize(new Dimension(9, 9));
    jLabel32.setMinimumSize(new Dimension(9, 9));
    jLabel32.setPreferredSize(new Dimension(9, 9));
    jPanel6.add(jLabel32);

    btnSimbolos.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnSimbolos.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/blanco.png"))); // NOI18N
    btnSimbolos.setText("!?#");
    btnSimbolos.setBorder(null);
    btnSimbolos.setBorderPainted(false);
    btnSimbolos.setContentAreaFilled(false);
    btnSimbolos.setHorizontalTextPosition(SwingConstants.CENTER);
    btnSimbolos.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnSimbolosActionPerformed(evt);
      }

      private void btnSimbolosActionPerformed(ActionEvent evt) {
        estado = !estado;
        if (estado == false) {
          btnMas.setText("!");
          btnMenos.setText("¡");
          btn1.setText("$");
          btn2.setText("&");
          btn3.setText("\\");
          btnPorcentaje.setText("|");
          btnPor.setText("¿");
          btnEntre.setText("?");
          btn4.setText("<");
          btn5.setText(">");
          btn6.setText("[");
          btnEspacio.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
          btnEspacio.setText("^");
          btnOpenParentesis.setText("(");
          btnCloseParentesis.setText(")");
          btn7.setText("{");
          btn8.setText("}");
          btn9.setText("]");
          btnPunto.setText("π");
          btnComa.setText("º");
          btnSimbolos.setText("123");
          btn0.setText("‘");
          btnIgual.setText("x");
        } else {
          btnMas.setText("+");
          btnMenos.setText("-");
          btn1.setText("1");
          btn2.setText("2");
          btn3.setText("3");
          btnPorcentaje.setText("%");
          btnPor.setText("*");
          btnEntre.setText("/");
          btn4.setText("4");
          btn5.setText("5");
          btn6.setText("6");
          btnEspacio.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/espacioN.png"))); // NOI18N
          btnEspacio.setText(" ");
          btnOpenParentesis.setText("(");
          btnCloseParentesis.setText(")");
          btn7.setText("7");
          btn8.setText("8");
          btn9.setText("9");
          btnPunto.setText(".");
          btnComa.setText(",");
          btnSimbolos.setText("!?#");
          btn0.setText("0");
          btnIgual.setText("=");
        }
      }
    });
    jPanel6.add(btnSimbolos);

    jLabel30.setMaximumSize(new Dimension(9, 9));
    jLabel30.setMinimumSize(new Dimension(9, 9));
    jLabel30.setPreferredSize(new Dimension(9, 9));
    jPanel6.add(jLabel30);

    btn0.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btn0.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/blanco.png"))); // NOI18N
    btn0.setText("0");
    btn0.setBorder(null);
    btn0.setBorderPainted(false);
    btn0.setContentAreaFilled(false);
    btn0.setHorizontalTextPosition(SwingConstants.CENTER);
    btn0.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btn0ActionPerformed(evt);
      }

      private void btn0ActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel6.add(btn0);

    jLabel31.setMaximumSize(new Dimension(9, 9));
    jLabel31.setMinimumSize(new Dimension(9, 9));
    jLabel31.setPreferredSize(new Dimension(9, 9));
    jPanel6.add(jLabel31);

    btnIgual.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnIgual.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/blanco.png"))); // NOI18N
    btnIgual.setText("=");
    btnIgual.setBorder(null);
    btnIgual.setBorderPainted(false);
    btnIgual.setContentAreaFilled(false);
    btnIgual.setHorizontalTextPosition(SwingConstants.CENTER);
    btnIgual.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnIgualActionPerformed(evt);
      }

      private void btnIgualActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel6.add(btnIgual);

    jLabel29.setMaximumSize(new Dimension(9, 9));
    jLabel29.setMinimumSize(new Dimension(9, 9));
    jLabel29.setPreferredSize(new Dimension(9, 9));
    jPanel6.add(jLabel29);

    btnEnter.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnEnter.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/enterNumericoCeleste.png"))); // NOI18N
    btnEnter.setBorder(null);
    btnEnter.setBorderPainted(false);
    btnEnter.setContentAreaFilled(false);
    btnEnter.setHorizontalTextPosition(SwingConstants.CENTER);
    btnEnter.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnEnterActionPerformed(evt);
      }

      private void btnEnterActionPerformed(ActionEvent evt) {
        txt.setText(txt.getText() + "\n\r");
      }
    });
    jPanel6.add(btnEnter);

    jLabel16.setMaximumSize(new Dimension(9, 9));
    jLabel16.setMinimumSize(new Dimension(9, 9));
    jLabel16.setPreferredSize(new Dimension(9, 9));
    jPanel6.add(jLabel16);
    panelTranslucido.add(jPanel6);
    panelDegradado.add(panelTranslucido, BorderLayout.CENTER);
    getContentPane().add(panelDegradado, BorderLayout.CENTER);

  }// </editor-fold>  

  @Override
  public void actionPerformed(ActionEvent e) {
    String actionCommand = e.getActionCommand();
    txt.setText(txt.getText() + actionCommand);
  }

  private void jLabel1MousePressed(MouseEvent evt) {
    pressed(evt);
  }

  private void jLabel4MousePressed(MouseEvent evt) {
    pressed(evt);
  }

  private void jLabel2MousePressed(MouseEvent evt) {
    pressed(evt);
  }

  private void jLabel3MousePressed(MouseEvent evt) {
    pressed(evt);
  }

  private void jLabel1MouseDragged(MouseEvent evt) {
    dragged(evt);
  }

  private void jLabel4MouseDragged(MouseEvent evt) {
    dragged(evt);
  }

  private void jLabel2MouseDragged(MouseEvent evt) {
    dragged(evt);
  }

  private void jLabel3MouseDragged(MouseEvent evt) {
    dragged(evt);
  }

  /**
   * Mueve el cuadro por el delta del ratón
   *
   * @param evt
   */
  private void pressed(MouseEvent evt) {
    xx = evt.getX();
    yy = evt.getY();
  }

  /**
   * Arrastrar y soltar
   *
   * @param evt
   */
  private void dragged(MouseEvent evt) {
    int x = evt.getXOnScreen();
    int y = evt.getYOnScreen();
    TecladoNumerico.this.setLocation(x - xx, y - yy);
  }
}
