package com.systemjaade.tecladosj.components;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * Clase PanelImagen.java
 *
 * @author Tarazona Marrujo Elí Gamaliel - "System JAADE S.A.C."
 * @version 07-mar-2019 14:55:53 SJ
 */
public class PanelImagen extends JPanel {

  private static final long serialVersionUID = 4225860604486894641L;

  private Image imagen;

  public PanelImagen() {
  }

  public PanelImagen(String nombreImagen) {
    if (nombreImagen != null) {
      imagen = new ImageIcon(getClass().getResource(nombreImagen)).getImage();
    }
  }

  public PanelImagen(Image imagenInicial) {
    if (imagenInicial != null) {
      imagen = imagenInicial;
    }
  }

  public void setImagen(String nombreImagen) {
    if (nombreImagen != null) {
      imagen = new ImageIcon(getClass().getResource(nombreImagen)).getImage();
    } else {
      imagen = null;
    }
    repaint();
  }

  public void setIcon(Icon nuevaImagen) {
    imagen = ((ImageIcon) nuevaImagen).getImage();
    repaint();
  }

  @Override
  public void paint(Graphics g) {
    if (imagen != null) {
      g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
      setOpaque(false);
    } else {
      setOpaque(true);
    }
    super.paint(g);
  }
}

