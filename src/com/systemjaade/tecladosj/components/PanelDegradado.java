package com.systemjaade.tecladosj.components;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 * Clase PanelDegradado.java
 *
 * @author Tarazona Marrujo Elí Gamaliel - "System JAADE S.A.C."
 * @version 08-mar-2019 10:51:54 SJ
 */
public class PanelDegradado extends JPanel {

  private static final long serialVersionUID = 4715755217334858879L;

  private Color color1 = new Color(0x666f7f);
  private Color color2 = new Color(0x262d3d);
  private float x1 = 0;
  private float y1 = 0;
  private float x2 = getWidth();
  private float y2 = getHeight();

  public PanelDegradado() {
  }

  @Override
  protected void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g.create();

    Rectangle clip = g2.getClipBounds();
    float x = getWidth();
    float y = getHeight();
    g2.setPaint(new GradientPaint(0.0f, 0.0f, color1.brighter(),
            0.0f, getHeight(), color2.brighter()));
    g2.fillRect(clip.x, clip.y, clip.width, clip.height);
  }

  public Color getColor1() {
    return color1;
  }

  public void setColor1(Color color1) {
    this.color1 = color1;
  }

  public Color getColor2() {
    return color2;
  }

  public void setColor2(Color color2) {
    this.color2 = color2;
  }

}
