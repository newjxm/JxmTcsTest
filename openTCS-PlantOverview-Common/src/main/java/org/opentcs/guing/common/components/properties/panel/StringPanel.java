/**
 * Copyright (c) The openTCS Authors.
 *
 * This program is free software and subject to the MIT license. (For details,
 * see the licensing information (LICENSE.txt) you should have received with
 * this copy of the software.)
 */
package org.opentcs.guing.common.components.properties.panel;

import javax.swing.JPanel;
import org.opentcs.guing.base.components.properties.type.Property;
import org.opentcs.guing.common.components.dialogs.DetailsDialogContent;

/**
 * User interface for a single line text.
 */
public class StringPanel
    extends JPanel
    implements DetailsDialogContent {

  /**
   * The title of the dialog.
   */
  private String fTitle;

  /**
   * Creates new form StringPanel.
   */
  public StringPanel() {
    this("String-Editor", "Text", "");
  }

  /**
   * Creates new form StringPanel.
   *
   * @param title The title.
   * @param labelText The text of the label.
   * @param text The text.
   */
  public StringPanel(String title, String labelText, String text) {
    initComponents();
    label.setText(labelText + ":");
    textField.setText(text);
    fTitle = title;
  }

  /**
   * Returns the text.
   *
   * @return The text.
   */
  public String getText() {
    return textField.getText();
  }

  @Override
  public void updateValues() {
  }

  @Override
  public String getTitle() {
    return fTitle;
  }

  @Override
  public void setProperty(Property property) {
  }

  @Override
  public Property getProperty() {
    return null;
  }

  // CHECKSTYLE:OFF
  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    java.awt.GridBagConstraints gridBagConstraints;

    label = new javax.swing.JLabel();
    textField = new javax.swing.JTextField();

    setLayout(new java.awt.GridBagLayout());

    label.setFont(label.getFont());
    label.setText("Text:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 0);
    add(label, gridBagConstraints);

    textField.setColumns(10);
    textField.setFont(textField.getFont());
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    add(textField, gridBagConstraints);
  }// </editor-fold>//GEN-END:initComponents

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel label;
  private javax.swing.JTextField textField;
  // End of variables declaration//GEN-END:variables
  // CHECKSTYLE:ON
}
