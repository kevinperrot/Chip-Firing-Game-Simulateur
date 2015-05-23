package view;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.ModelEditGraph;
import model.ModelIteration;

public class ViewIteration extends javax.swing.JFrame implements Observer {
    private ModelIteration modelIteration;

    public ViewIteration() {
        initComponents();
    }

    public ViewIteration(ModelIteration modelIteration) {
        initComponents();
        this.modelIteration = modelIteration;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setIterationPanel = new javax.swing.JPanel();
        inputPattern = new javax.swing.JFormattedTextField();
        buttonValidate = new javax.swing.JButton();
        stateTextField = new javax.swing.JTextField();
        parallelButton = new javax.swing.JButton();
        sequentialButton = new javax.swing.JButton();
        currentIterationPanel = new javax.swing.JPanel();
        currentIterationTextField = new javax.swing.JTextField();

        setIterationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Set iteration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 3, 10))); // NOI18N

        inputPattern.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

        buttonValidate.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        buttonValidate.setText("Validate");

        stateTextField.setEditable(false);
        stateTextField.setBackground(java.awt.Color.lightGray);
        stateTextField.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

        parallelButton.setText("Parallel");

        sequentialButton.setText("Sequential");

        javax.swing.GroupLayout setIterationPanelLayout = new javax.swing.GroupLayout(setIterationPanel);
        setIterationPanel.setLayout(setIterationPanelLayout);
        setIterationPanelLayout.setHorizontalGroup(
            setIterationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setIterationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(setIterationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputPattern)
                    .addGroup(setIterationPanelLayout.createSequentialGroup()
                        .addComponent(stateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(buttonValidate))
                    .addGroup(setIterationPanelLayout.createSequentialGroup()
                        .addComponent(parallelButton)
                        .addGap(18, 18, 18)
                        .addComponent(sequentialButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        setIterationPanelLayout.setVerticalGroup(
            setIterationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setIterationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputPattern, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(setIterationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sequentialButton)
                    .addComponent(parallelButton))
                .addGap(27, 27, 27)
                .addGroup(setIterationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonValidate))
                .addGap(24, 24, 24))
        );

        currentIterationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Current iteration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ubuntu", 3, 10))); // NOI18N
        currentIterationPanel.setToolTipText("");

        currentIterationTextField.setEditable(false);
        currentIterationTextField.setBackground(java.awt.Color.lightGray);
        currentIterationTextField.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

        javax.swing.GroupLayout currentIterationPanelLayout = new javax.swing.GroupLayout(currentIterationPanel);
        currentIterationPanel.setLayout(currentIterationPanelLayout);
        currentIterationPanelLayout.setHorizontalGroup(
            currentIterationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentIterationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(currentIterationTextField)
                .addContainerGap())
        );
        currentIterationPanelLayout.setVerticalGroup(
            currentIterationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, currentIterationPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(currentIterationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(setIterationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(currentIterationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(setIterationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(currentIterationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getButtonValidate() {
        return buttonValidate;
    }

    public JButton getParallelButton() {
        return parallelButton;
    }

    public JButton getSequentialButton() {
        return sequentialButton;
    }

    public JPanel getCurrentIterationPanel() {
        return currentIterationPanel;
    }

    public JTextField getCurrentIterationTextField() {
        return currentIterationTextField;
    }

    public JFormattedTextField getInputPattern() {
        return inputPattern;
    }

    public JPanel getSetIterationPanel() {
        return setIterationPanel;
    }

    public JTextField getStateTextField() {
        return stateTextField;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonValidate;
    private javax.swing.JPanel currentIterationPanel;
    private javax.swing.JTextField currentIterationTextField;
    private javax.swing.JFormattedTextField inputPattern;
    private javax.swing.JButton parallelButton;
    private javax.swing.JButton sequentialButton;
    private javax.swing.JPanel setIterationPanel;
    private javax.swing.JTextField stateTextField;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object o1) {
        if (o instanceof ModelIteration) {
            if (((ModelIteration) o1).getPattern().isValid()) {
                switch (((ModelIteration) o1).getCurrentState()) {
                    case INPUT_PATTERN_UPDATED:
                        getInputPattern().setText(((ModelIteration) o1).getPattern().getOrderedPartionText());
                        getStateTextField().setForeground(Color.black);
                        getStateTextField().setText("");
                        break;
                    case ALL_UPDATED:
                        getCurrentIterationTextField().setText(((ModelIteration) o1).getPattern().getOrderedPartionText());
                        getStateTextField().setForeground(Color.green);
                        getStateTextField().setText("Pattern is valid !");
                        break;
                    default: 
                        break;
                }
            } else {
                getStateTextField().setForeground(Color.red);
                getStateTextField().setText("Pattern is invalid !");
            }
        }
    }
}
