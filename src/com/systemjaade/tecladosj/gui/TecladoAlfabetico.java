package com.systemjaade.tecladosj.gui;

import com.systemjaade.tecladosj.components.PanelDegradado;
import com.systemjaade.tecladosj.components.PanelTranslucido;
import com.sun.awt.AWTUtilities;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
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
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.text.JTextComponent;

/**
 * Clase TecladoAlfabetico.java
 *
 * @author Tarazona Marrujo Elí Gamaliel - "System JAADE S.A.C."
 * @version 08-mar-2019 16:45:12 SJ
 */
@SuppressWarnings("serial")
public class TecladoAlfabetico extends JDialog implements ActionListener {

  private JTextComponent txt;
  private boolean estado = true;//true = mayuscula, false = minuscula
  int xx;
  int yy;

  // Variables declaration - do not modify
  public static String ENTER_ALFABETICO_AMARILLO = "/com/systemjaade/tecladosj/img/enterAlfabeticoAmarillo.png";
  public static String ENTER_ALFABETICO_ANARANJADO = "/com/systemjaade/tecladosj/img/enterAlfabeticoAnaranjado.png";
  public static String ENTER_ALFABETICO_AZUL = "/com/systemjaade/tecladosj/img/enterAlfabeticoAzul.png";
  public static String ENTER_ALFABETICO_CELESTE = "/com/systemjaade/tecladosj/img/enterAlfabeticoCeleste.png";
  public static String ENTER_ALFABETICO_FUCHSIA = "/com/systemjaade/tecladosj/img/enterAlfabeticoFuchsia.png";
  public static String ENTER_ALFABETICO_MORADO = "/com/systemjaade/tecladosj/img/enterAlfabeticoMorado.png";
  public static String ENTER_ALFABETICO_ROJO = "/com/systemjaade/tecladosj/img/enterAlfabeticoRojo.png";
  public static String ENTER_ALFABETICO_ROSA = "/com/systemjaade/tecladosj/img/enterAlfabeticoRosa.png";
  public static String ENTER_ALFABETICO_VERDE = "/com/systemjaade/tecladosj/img/enterAlfabeticoVerde.png";
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
  private JButton btnA;
  private JButton btnArroba;
  private JButton btnB;
  private JButton btnBorrar;
  private JButton btnC;
  private JButton btnComa;
  private JButton btnD;
  private JButton btnE;
  public static JButton btnEnter;
  private JButton btnEspacio;
  private JButton btnF;
  private JButton btnG;
  private JButton btnGuion;
  private JButton btnH;
  private JButton btnI;
  private JButton btnJ;
  private JButton btnK;
  private JButton btnL;
  private JButton btnM;
  private JButton btnN;
  private JButton btnO;
  private JButton btnP;
  private JButton btnPunto;
  private JButton btnQ;
  private JButton btnR;
  private JButton btnS;
  private JButton btnShift;
  private JButton btnT;
  private JButton btnU;
  private JButton btnV;
  private JButton btnW;
  private JButton btnX;
  private JButton btnY;
  private JButton btnZ;
  private JButton btnÑ;
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
  private JLabel jLabel3;
  private JLabel jLabel4;
  private JLabel jLabel5;
  private JLabel jLabel6;
  private JLabel jLabel7;
  private JLabel jLabel8;
  private JLabel jLabel9;
  private JPanel jPanel1;
  private JPanel jPanel2;
  private JPanel jPanel3;
  private JPanel jPanel4;
  private JPanel jPanel5;
  private JLabel lbl5;
  private JLabel lbl6;
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

  public TecladoAlfabetico(JTextComponent txt) {
    this.txt = txt;
    this.setSize(691, 323);

    initComponents();
    this.setLocationRelativeTo(null);
    Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 50, 50);
    AWTUtilities.setWindowShape(this, forma);
    pack();
  }

  public TecladoAlfabetico() {
    this.setSize(691, 323);

    initComponents();
    this.setLocationRelativeTo(null);
    Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 50, 50);
    AWTUtilities.setWindowShape(this, forma);
    pack();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
  private void initComponents() {
    GridBagConstraints gridBagConstraints;

    panelDegradado = new PanelDegradado();
    jLabel1 = new JLabel();
    jLabel2 = new JLabel();
    jLabel3 = new JLabel();
    jLabel4 = new JLabel();
    panelTranslucido = new PanelTranslucido();
    jPanel1 = new JPanel();
    btn1 = new JButton();
    btn2 = new JButton();
    btn3 = new JButton();
    btn4 = new JButton();
    btn5 = new JButton();
    btn6 = new JButton();
    btn7 = new JButton();
    btn8 = new JButton();
    btn9 = new JButton();
    btn0 = new JButton();
    jPanel2 = new JPanel();
    btnQ = new JButton();
    btnW = new JButton();
    btnE = new JButton();
    btnR = new JButton();
    btnT = new JButton();
    btnY = new JButton();
    btnU = new JButton();
    btnI = new JButton();
    btnO = new JButton();
    btnP = new JButton();
    jPanel3 = new JPanel();
    btnA = new JButton();
    btnS = new JButton();
    btnD = new JButton();
    btnF = new JButton();
    btnG = new JButton();
    btnH = new JButton();
    btnJ = new JButton();
    btnK = new JButton();
    btnL = new JButton();
    btnÑ = new JButton();
    jPanel4 = new JPanel();
    jLabel14 = new JLabel();
    btnShift = new JButton();
    jLabel5 = new JLabel();
    btnZ = new JButton();
    jLabel6 = new JLabel();
    btnX = new JButton();
    jLabel7 = new JLabel();
    btnC = new JButton();
    jLabel8 = new JLabel();
    btnV = new JButton();
    jLabel9 = new JLabel();
    btnB = new JButton();
    jLabel11 = new JLabel();
    btnN = new JButton();
    jLabel12 = new JLabel();
    btnM = new JButton();
    jLabel13 = new JLabel();
    btnBorrar = new JButton();
    jLabel10 = new JLabel();
    jPanel5 = new JPanel();
    lbl6 = new JLabel();
    btnArroba = new JButton();
    jLabel15 = new JLabel();
    btnComa = new JButton();
    jLabel16 = new JLabel();
    btnGuion = new JButton();
    jLabel17 = new JLabel();
    btnEspacio = new JButton();
    jLabel18 = new JLabel();
    btnPunto = new JButton();
    jLabel19 = new JLabel();
    btnEnter = new JButton();
    lbl5 = new JLabel();

    setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
    setUndecorated(true);
    setResizable(false);

    panelDegradado.setColor1(new Color(140, 253, 253));
    panelDegradado.setColor2(new Color(255, 153, 153));
    panelDegradado.setMaximumSize(new Dimension(690, 320));
    panelDegradado.setMinimumSize(new Dimension(690, 320));
    panelDegradado.setPreferredSize(new Dimension(690, 320));
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

    panelTranslucido.setMaximumSize(new Dimension(300, 290));
    panelTranslucido.setMinimumSize(new Dimension(300, 290));
    panelTranslucido.setPreferredSize(new Dimension(300, 290));
    panelTranslucido.setLayout(new GridLayout(5, 1));

    jPanel1.setOpaque(false);
    jPanel1.setLayout(new GridLayout(1, 0));

    btn1.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btn1.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
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

    btn2.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btn2.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
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

    btn3.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btn3.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
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

    btn4.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btn4.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
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
    jPanel1.add(btn4);

    btn5.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btn5.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
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
    jPanel1.add(btn5);

    btn6.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btn6.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
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
    jPanel1.add(btn6);

    btn7.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btn7.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
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
    jPanel1.add(btn7);

    btn8.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btn8.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
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
    jPanel1.add(btn8);

    btn9.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btn9.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
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
    jPanel1.add(btn9);

    btn0.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btn0.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
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
    jPanel1.add(btn0);

    panelTranslucido.add(jPanel1);

    jPanel2.setOpaque(false);
    jPanel2.setLayout(new GridLayout(1, 0));

    btnQ.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnQ.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
    btnQ.setText("Q");
    btnQ.setBorder(null);
    btnQ.setBorderPainted(false);
    btnQ.setContentAreaFilled(false);
    btnQ.setHorizontalTextPosition(SwingConstants.CENTER);
    btnQ.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnQActionPerformed(evt);
      }

      private void btnQActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel2.add(btnQ);

    btnW.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnW.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
    btnW.setText("W");
    btnW.setBorder(null);
    btnW.setBorderPainted(false);
    btnW.setContentAreaFilled(false);
    btnW.setHorizontalTextPosition(SwingConstants.CENTER);
    btnW.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnWActionPerformed(evt);
      }

      private void btnWActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel2.add(btnW);

    btnE.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnE.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
    btnE.setText("E");
    btnE.setBorder(null);
    btnE.setBorderPainted(false);
    btnE.setContentAreaFilled(false);
    btnE.setHorizontalTextPosition(SwingConstants.CENTER);
    btnE.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnEActionPerformed(evt);
      }

      private void btnEActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel2.add(btnE);

    btnR.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnR.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
    btnR.setText("R");
    btnR.setBorder(null);
    btnR.setBorderPainted(false);
    btnR.setContentAreaFilled(false);
    btnR.setHorizontalTextPosition(SwingConstants.CENTER);
    btnR.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnRActionPerformed(evt);
      }

      private void btnRActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel2.add(btnR);

    btnT.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnT.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
    btnT.setText("T");
    btnT.setBorder(null);
    btnT.setBorderPainted(false);
    btnT.setContentAreaFilled(false);
    btnT.setHorizontalTextPosition(SwingConstants.CENTER);
    btnT.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnTActionPerformed(evt);
      }

      private void btnTActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel2.add(btnT);

    btnY.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnY.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
    btnY.setText("Y");
    btnY.setBorder(null);
    btnY.setBorderPainted(false);
    btnY.setContentAreaFilled(false);
    btnY.setHorizontalTextPosition(SwingConstants.CENTER);
    btnY.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnYActionPerformed(evt);
      }

      private void btnYActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel2.add(btnY);

    btnU.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnU.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
    btnU.setText("U");
    btnU.setBorder(null);
    btnU.setBorderPainted(false);
    btnU.setContentAreaFilled(false);
    btnU.setHorizontalTextPosition(SwingConstants.CENTER);
    btnU.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnUActionPerformed(evt);
      }

      private void btnUActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel2.add(btnU);

    btnI.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnI.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
    btnI.setText("I");
    btnI.setBorder(null);
    btnI.setBorderPainted(false);
    btnI.setContentAreaFilled(false);
    btnI.setHorizontalTextPosition(SwingConstants.CENTER);
    btnI.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnIActionPerformed(evt);
      }

      private void btnIActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel2.add(btnI);

    btnO.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnO.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
    btnO.setText("O");
    btnO.setBorder(null);
    btnO.setBorderPainted(false);
    btnO.setContentAreaFilled(false);
    btnO.setHorizontalTextPosition(SwingConstants.CENTER);
    btnO.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnOActionPerformed(evt);
      }

      private void btnOActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel2.add(btnO);

    btnP.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnP.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
    btnP.setText("P");
    btnP.setBorder(null);
    btnP.setBorderPainted(false);
    btnP.setContentAreaFilled(false);
    btnP.setHorizontalTextPosition(SwingConstants.CENTER);
    btnP.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnPActionPerformed(evt);
      }

      private void btnPActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel2.add(btnP);

    panelTranslucido.add(jPanel2);

    jPanel3.setOpaque(false);
    jPanel3.setLayout(new GridLayout(1, 0));

    btnA.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnA.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
    btnA.setText("A");
    btnA.setBorder(null);
    btnA.setBorderPainted(false);
    btnA.setContentAreaFilled(false);
    btnA.setHorizontalTextPosition(SwingConstants.CENTER);
    btnA.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnAActionPerformed(evt);
      }

      private void btnAActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel3.add(btnA);

    btnS.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnS.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
    btnS.setText("S");
    btnS.setBorder(null);
    btnS.setBorderPainted(false);
    btnS.setContentAreaFilled(false);
    btnS.setHorizontalTextPosition(SwingConstants.CENTER);
    btnS.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnSActionPerformed(evt);
      }

      private void btnSActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel3.add(btnS);

    btnD.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnD.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
    btnD.setText("D");
    btnD.setBorder(null);
    btnD.setBorderPainted(false);
    btnD.setContentAreaFilled(false);
    btnD.setHorizontalTextPosition(SwingConstants.CENTER);
    btnD.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnDActionPerformed(evt);
      }

      private void btnDActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel3.add(btnD);

    btnF.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnF.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
    btnF.setText("F");
    btnF.setBorder(null);
    btnF.setBorderPainted(false);
    btnF.setContentAreaFilled(false);
    btnF.setHorizontalTextPosition(SwingConstants.CENTER);
    btnF.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnFActionPerformed(evt);
      }

      private void btnFActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel3.add(btnF);

    btnG.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnG.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
    btnG.setText("G");
    btnG.setBorder(null);
    btnG.setBorderPainted(false);
    btnG.setContentAreaFilled(false);
    btnG.setHorizontalTextPosition(SwingConstants.CENTER);
    btnG.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnGActionPerformed(evt);
      }

      private void btnGActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel3.add(btnG);

    btnH.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnH.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
    btnH.setText("H");
    btnH.setBorder(null);
    btnH.setBorderPainted(false);
    btnH.setContentAreaFilled(false);
    btnH.setHorizontalTextPosition(SwingConstants.CENTER);
    btnH.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnHActionPerformed(evt);
      }

      private void btnHActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel3.add(btnH);

    btnJ.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnJ.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
    btnJ.setText("J");
    btnJ.setBorder(null);
    btnJ.setBorderPainted(false);
    btnJ.setContentAreaFilled(false);
    btnJ.setHorizontalTextPosition(SwingConstants.CENTER);
    btnJ.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnJActionPerformed(evt);
      }

      private void btnJActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel3.add(btnJ);

    btnK.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnK.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
    btnK.setText("K");
    btnK.setBorder(null);
    btnK.setBorderPainted(false);
    btnK.setContentAreaFilled(false);
    btnK.setHorizontalTextPosition(SwingConstants.CENTER);
    btnK.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnKActionPerformed(evt);
      }

      private void btnKActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel3.add(btnK);

    btnL.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnL.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
    btnL.setText("L");
    btnL.setBorder(null);
    btnL.setBorderPainted(false);
    btnL.setContentAreaFilled(false);
    btnL.setHorizontalTextPosition(SwingConstants.CENTER);
    btnL.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnLActionPerformed(evt);
      }

      private void btnLActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel3.add(btnL);

    btnÑ.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnÑ.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
    btnÑ.setText("Ñ");
    btnÑ.setBorder(null);
    btnÑ.setBorderPainted(false);
    btnÑ.setContentAreaFilled(false);
    btnÑ.setHorizontalTextPosition(SwingConstants.CENTER);
    btnÑ.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnÑActionPerformed(evt);
      }

      private void btnÑActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel3.add(btnÑ);

    panelTranslucido.add(jPanel3);

    jPanel4.setOpaque(false);
    jPanel4.setLayout(new GridBagLayout());

    jLabel14.setMaximumSize(new Dimension(5, 5));
    jLabel14.setMinimumSize(new Dimension(5, 5));
    jLabel14.setPreferredSize(new Dimension(5, 5));
    jPanel4.add(jLabel14, new GridBagConstraints());

    btnShift.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnShift.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/shiftMayus.png"))); // NOI18N
    btnShift.setBorder(null);
    btnShift.setBorderPainted(false);
    btnShift.setContentAreaFilled(false);
    btnShift.setHorizontalTextPosition(SwingConstants.CENTER);
    btnShift.setMaximumSize(new Dimension(90, 49));
    btnShift.setMinimumSize(new Dimension(90, 49));
    btnShift.setPreferredSize(new Dimension(90, 49));
    btnShift.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnShiftActionPerformed(evt);
      }

      private void btnShiftActionPerformed(ActionEvent evt) {
        estado = !estado;
        if (estado == false) {
          btnShift.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/shiftMinus.png"))); // NOI18N
          btn1.setText("1");
          btn2.setText("2");
          btn3.setText("3");
          btn4.setText("4");
          btn5.setText("5");
          btn6.setText("6");
          btn7.setText("7");
          btn8.setText("8");
          btn9.setText("9");
          btn0.setText("0");
          btnQ.setText("q");
          btnW.setText("w");
          btnE.setText("e");
          btnR.setText("r");
          btnT.setText("t");
          btnY.setText("y");
          btnU.setText("u");
          btnI.setText("i");
          btnO.setText("o");
          btnP.setText("p");
          btnA.setText("a");
          btnS.setText("s");
          btnD.setText("d");
          btnF.setText("f");
          btnG.setText("g");
          btnH.setText("h");
          btnJ.setText("j");
          btnK.setText("k");
          btnL.setText("l");
          btnÑ.setText("ñ");
          btnZ.setText("z");
          btnX.setText("x");
          btnC.setText("c");
          btnV.setText("v");
          btnB.setText("b");
          btnN.setText("n");
          btnM.setText("m");
          btnComa.setText(";");
          btnGuion.setText("_");
          btnPunto.setText(":");
        } else {
          btnShift.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/shiftMayus.png"))); // NOI18N
          btn1.setText("1");
          btn2.setText("2");
          btn3.setText("3");
          btn4.setText("4");
          btn5.setText("5");
          btn6.setText("6");
          btn7.setText("7");
          btn8.setText("8");
          btn9.setText("9");
          btn0.setText("0");
          btnQ.setText("Q");
          btnW.setText("W");
          btnE.setText("E");
          btnR.setText("R");
          btnT.setText("T");
          btnY.setText("Y");
          btnU.setText("U");
          btnI.setText("I");
          btnO.setText("O");
          btnP.setText("P");
          btnA.setText("A");
          btnS.setText("S");
          btnD.setText("D");
          btnF.setText("F");
          btnG.setText("G");
          btnH.setText("H");
          btnJ.setText("J");
          btnK.setText("K");
          btnL.setText("L");
          btnÑ.setText("Ñ");
          btnZ.setText("Z");
          btnX.setText("X");
          btnC.setText("C");
          btnV.setText("V");
          btnB.setText("B");
          btnN.setText("N");
          btnM.setText("M");
          btnComa.setText(",");
          btnGuion.setText("-");
          btnPunto.setText(".");
        }
      }
    });
    jPanel4.add(btnShift, new GridBagConstraints());

    jLabel5.setMaximumSize(new Dimension(9, 9));
    jLabel5.setMinimumSize(new Dimension(9, 9));
    jLabel5.setPreferredSize(new Dimension(9, 9));
    jPanel4.add(jLabel5, new GridBagConstraints());

    btnZ.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnZ.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
    btnZ.setText("Z");
    btnZ.setBorder(null);
    btnZ.setBorderPainted(false);
    btnZ.setContentAreaFilled(false);
    btnZ.setHorizontalTextPosition(SwingConstants.CENTER);
    btnZ.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnZActionPerformed(evt);
      }

      private void btnZActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.anchor = GridBagConstraints.LINE_START;
    jPanel4.add(btnZ, gridBagConstraints);

    jLabel6.setMaximumSize(new Dimension(9, 9));
    jLabel6.setMinimumSize(new Dimension(9, 9));
    jLabel6.setPreferredSize(new Dimension(9, 9));
    jPanel4.add(jLabel6, new GridBagConstraints());

    btnX.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnX.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
    btnX.setText("X");
    btnX.setBorder(null);
    btnX.setBorderPainted(false);
    btnX.setContentAreaFilled(false);
    btnX.setHorizontalTextPosition(SwingConstants.CENTER);
    btnX.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnXActionPerformed(evt);
      }

      private void btnXActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel4.add(btnX, new GridBagConstraints());

    jLabel7.setMaximumSize(new Dimension(9, 9));
    jLabel7.setMinimumSize(new Dimension(9, 9));
    jLabel7.setPreferredSize(new Dimension(9, 9));
    jPanel4.add(jLabel7, new GridBagConstraints());

    btnC.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnC.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
    btnC.setText("C");
    btnC.setBorder(null);
    btnC.setBorderPainted(false);
    btnC.setContentAreaFilled(false);
    btnC.setHorizontalTextPosition(SwingConstants.CENTER);
    btnC.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnCActionPerformed(evt);
      }

      private void btnCActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel4.add(btnC, new GridBagConstraints());

    jLabel8.setMaximumSize(new Dimension(9, 9));
    jLabel8.setMinimumSize(new Dimension(9, 9));
    jLabel8.setPreferredSize(new Dimension(9, 9));
    jPanel4.add(jLabel8, new GridBagConstraints());

    btnV.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnV.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
    btnV.setText("V");
    btnV.setBorder(null);
    btnV.setBorderPainted(false);
    btnV.setContentAreaFilled(false);
    btnV.setHorizontalTextPosition(SwingConstants.CENTER);
    btnV.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnVActionPerformed(evt);
      }

      private void btnVActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel4.add(btnV, new GridBagConstraints());

    jLabel9.setMaximumSize(new Dimension(9, 9));
    jLabel9.setMinimumSize(new Dimension(9, 9));
    jLabel9.setPreferredSize(new Dimension(9, 9));
    jPanel4.add(jLabel9, new GridBagConstraints());

    btnB.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnB.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
    btnB.setText("B");
    btnB.setBorder(null);
    btnB.setBorderPainted(false);
    btnB.setContentAreaFilled(false);
    btnB.setHorizontalTextPosition(SwingConstants.CENTER);
    btnB.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnBActionPerformed(evt);
      }

      private void btnBActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel4.add(btnB, new GridBagConstraints());

    jLabel11.setMaximumSize(new Dimension(9, 9));
    jLabel11.setMinimumSize(new Dimension(9, 9));
    jLabel11.setPreferredSize(new Dimension(9, 9));
    jPanel4.add(jLabel11, new GridBagConstraints());

    btnN.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnN.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
    btnN.setText("N");
    btnN.setBorder(null);
    btnN.setBorderPainted(false);
    btnN.setContentAreaFilled(false);
    btnN.setHorizontalTextPosition(SwingConstants.CENTER);
    btnN.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnNActionPerformed(evt);
      }

      private void btnNActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel4.add(btnN, new GridBagConstraints());

    jLabel12.setMaximumSize(new Dimension(9, 9));
    jLabel12.setMinimumSize(new Dimension(9, 9));
    jLabel12.setPreferredSize(new Dimension(9, 9));
    jPanel4.add(jLabel12, new GridBagConstraints());

    btnM.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnM.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
    btnM.setText("M");
    btnM.setBorder(null);
    btnM.setBorderPainted(false);
    btnM.setContentAreaFilled(false);
    btnM.setHorizontalTextPosition(SwingConstants.CENTER);
    btnM.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnMActionPerformed(evt);
      }

      private void btnMActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel4.add(btnM, new GridBagConstraints());

    jLabel13.setMaximumSize(new Dimension(9, 9));
    jLabel13.setMinimumSize(new Dimension(9, 9));
    jLabel13.setPreferredSize(new Dimension(9, 9));
    jPanel4.add(jLabel13, new GridBagConstraints());

    btnBorrar.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnBorrar.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/borrar.png"))); // NOI18N
    btnBorrar.setBorder(null);
    btnBorrar.setBorderPainted(false);
    btnBorrar.setContentAreaFilled(false);
    btnBorrar.setHorizontalTextPosition(SwingConstants.CENTER);
    btnBorrar.setMaximumSize(new Dimension(91, 49));
    btnBorrar.setMinimumSize(new Dimension(91, 49));
    btnBorrar.setPreferredSize(new Dimension(91, 49));
    btnBorrar.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnBorrarActionPerformed(evt);
      }

      private void btnBorrarActionPerformed(ActionEvent evt) {
        txt.setText(txt.getText().substring(0, txt.getText().length() - 1));
      }
    });
    jPanel4.add(btnBorrar, new GridBagConstraints());

    jLabel10.setMaximumSize(new Dimension(5, 5));
    jLabel10.setMinimumSize(new Dimension(5, 5));
    jLabel10.setPreferredSize(new Dimension(5, 5));
    jPanel4.add(jLabel10, new GridBagConstraints());

    panelTranslucido.add(jPanel4);

    jPanel5.setOpaque(false);
    jPanel5.setLayout(new BoxLayout(jPanel5, BoxLayout.LINE_AXIS));

    lbl6.setMaximumSize(new Dimension(5, 5));
    lbl6.setMinimumSize(new Dimension(5, 5));
    lbl6.setPreferredSize(new Dimension(5, 5));
    jPanel5.add(lbl6);

    btnArroba.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnArroba.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
    btnArroba.setText("@");
    btnArroba.setBorder(null);
    btnArroba.setBorderPainted(false);
    btnArroba.setContentAreaFilled(false);
    btnArroba.setHorizontalTextPosition(SwingConstants.CENTER);
    btnArroba.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnArrobaActionPerformed(evt);
      }

      private void btnArrobaActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel5.add(btnArroba);

    jLabel15.setMaximumSize(new Dimension(8, 8));
    jLabel15.setMinimumSize(new Dimension(8, 8));
    jLabel15.setPreferredSize(new Dimension(8, 8));
    jPanel5.add(jLabel15);

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
    jPanel5.add(btnComa);

    jLabel16.setMaximumSize(new Dimension(8, 8));
    jLabel16.setMinimumSize(new Dimension(8, 8));
    jLabel16.setPreferredSize(new Dimension(8, 8));
    jPanel5.add(jLabel16);

    btnGuion.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnGuion.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/tecla.png"))); // NOI18N
    btnGuion.setText("-");
    btnGuion.setBorder(null);
    btnGuion.setBorderPainted(false);
    btnGuion.setContentAreaFilled(false);
    btnGuion.setHorizontalTextPosition(SwingConstants.CENTER);
    btnGuion.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        btnGuionActionPerformed(evt);
      }

      private void btnGuionActionPerformed(ActionEvent evt) {
        String actionCommand = evt.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
      }
    });
    jPanel5.add(btnGuion);

    jLabel17.setMaximumSize(new Dimension(8, 8));
    jLabel17.setMinimumSize(new Dimension(8, 8));
    jLabel17.setPreferredSize(new Dimension(8, 8));
    jPanel5.add(jLabel17);

    btnEspacio.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnEspacio.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/espacio.png"))); // NOI18N
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
    jPanel5.add(btnEspacio);

    jLabel18.setMaximumSize(new Dimension(8, 8));
    jLabel18.setMinimumSize(new Dimension(8, 8));
    jLabel18.setPreferredSize(new Dimension(8, 8));
    jPanel5.add(jLabel18);

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
    jPanel5.add(btnPunto);

    jLabel19.setMaximumSize(new Dimension(8, 8));
    jLabel19.setMinimumSize(new Dimension(8, 8));
    jLabel19.setPreferredSize(new Dimension(8, 8));
    jPanel5.add(jLabel19);

    btnEnter.setFont(new Font("Trebuchet MS", 1, 18)); // NOI18N
    btnEnter.setIcon(new ImageIcon(getClass().getResource("/com/systemjaade/tecladosj/img/enterAlfabeticoCeleste.png"))); // NOI18N
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
    jPanel5.add(btnEnter);

    lbl5.setMaximumSize(new Dimension(5, 5));
    lbl5.setMinimumSize(new Dimension(5, 5));
    lbl5.setPreferredSize(new Dimension(5, 5));
    jPanel5.add(lbl5);
    panelTranslucido.add(jPanel5);
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
    TecladoAlfabetico.this.setLocation(x - xx, y - yy);
  }
}
