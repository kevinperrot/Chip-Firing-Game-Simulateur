package view;

import java.util.Observable;
import java.util.Observer;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import model.ModelMainFrame;

public class ViewMainFrame extends javax.swing.JFrame implements Observer {
    // L'instance de notre objet contrôleur
    private ModelMainFrame modelMailFrame;

    public ViewMainFrame() {
        initComponents();
    }

    public ViewMainFrame(ModelMainFrame modelMainFrame) {
        initComponents();
        this.modelMailFrame = modelMainFrame;
        
        viewGraph.add(modelMainFrame.getViewer().addDefaultView(false));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iterationMode = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        playCFG = new javax.swing.JPanel();
        viewGraph = new javax.swing.JPanel();
        optionsControl = new javax.swing.JPanel();
        iterationModeParallel = new javax.swing.JRadioButton();
        iterationModeSeqentiel = new javax.swing.JRadioButton();
        separator4 = new javax.swing.JSeparator();
        optionControlRun = new javax.swing.JButton();
        optionControlForward = new javax.swing.JButton();
        optionControlBegin = new javax.swing.JButton();
        optionControlBackward = new javax.swing.JButton();
        optionControlEnd = new javax.swing.JButton();
        optionControlTime = new javax.swing.JTextField();
        optionControlTimeLabel = new javax.swing.JLabel();
        iterationButton = new javax.swing.JButton();
        graphTransButton = new javax.swing.JButton();
        editGraphButton = new javax.swing.JButton();
        infoGraphButton = new javax.swing.JButton();
        logButton = new javax.swing.JButton();
        validateTime = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        optionsChips = new javax.swing.JPanel();
        inputNbChips = new javax.swing.JTextField();
        modeRemoveChips = new javax.swing.JRadioButton();
        modeAddChips = new javax.swing.JRadioButton();
        valideOptionChips = new javax.swing.JButton();
        selectedNode = new javax.swing.JScrollPane();
        selectedNodeText = new javax.swing.JTextArea();
        nbChipsLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        separator5 = new javax.swing.JSeparator();
        modeSetChips = new javax.swing.JRadioButton();
        selectAllVerticesButton = new javax.swing.JButton();
        resetSelectedVerticesButton = new javax.swing.JButton();
        InformationsPanel = new javax.swing.JPanel();
        labelCycleLimit = new javax.swing.JLabel();
        labelSizeCycleLimit = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        open = new javax.swing.JMenuItem();
        separator1 = new javax.swing.JPopupMenu.Separator();
        Save = new javax.swing.JMenuItem();
        saveas = new javax.swing.JMenuItem();
        separator2 = new javax.swing.JPopupMenu.Separator();
        import_ = new javax.swing.JMenuItem();
        separator3 = new javax.swing.JPopupMenu.Separator();
        quit = new javax.swing.JMenuItem();
        about = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CFG Simulator v1.4.1");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(800, 600));

        viewGraph.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        viewGraph.setLayout(new java.awt.BorderLayout());

        iterationMode.add(iterationModeParallel);
        iterationModeParallel.setSelected(true);
        iterationModeParallel.setText("Bloc-Seq");
        iterationModeParallel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/Unicast Filled-32.png"))); // NOI18N
        iterationModeParallel.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/Unicast Filled-32red.png"))); // NOI18N
        iterationModeParallel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iterationModeParallelActionPerformed(evt);
            }
        });

        iterationMode.add(iterationModeSeqentiel);
        iterationModeSeqentiel.setText("Async");
        iterationModeSeqentiel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/Broadcasting Filled-32.png"))); // NOI18N
        iterationModeSeqentiel.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/Broadcasting Filled-32red.png"))); // NOI18N

        separator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        optionControlRun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/Play-32.png"))); // NOI18N
        optionControlRun.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/Play-32grey.png"))); // NOI18N

        optionControlForward.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/Fast Forward-32.png"))); // NOI18N
        optionControlForward.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/Fast Forward-32grey.png"))); // NOI18N

        optionControlBegin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/Skip To Start-32.png"))); // NOI18N
        optionControlBegin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/Skip To Start-32grey.png"))); // NOI18N

        optionControlBackward.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/Rewind-32.png"))); // NOI18N
        optionControlBackward.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/Rewind-32grey.png"))); // NOI18N

        optionControlEnd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/End-32.png"))); // NOI18N
        optionControlEnd.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/End-32grey.png"))); // NOI18N

        optionControlTimeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/Watch-32.png"))); // NOI18N
        optionControlTimeLabel.setText("ms");
        optionControlTimeLabel.setToolTipText("");

        iterationButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/Plus-25.png"))); // NOI18N
        iterationButton.setText("Iteration");
        iterationButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/Plus-25grey.png"))); // NOI18N

        graphTransButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/Active Directory-25.png"))); // NOI18N
        graphTransButton.setText("Graph trans");
        graphTransButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/Active Directory-25grey.png"))); // NOI18N

        editGraphButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/Settings3-25.png"))); // NOI18N
        editGraphButton.setText("Edit Graph");
        editGraphButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/Settings3-25grey.png"))); // NOI18N

        infoGraphButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/Info-25.png"))); // NOI18N
        infoGraphButton.setText("Info Graph");
        infoGraphButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/Info-25grey.png"))); // NOI18N

        logButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/System Task-25.png"))); // NOI18N
        logButton.setText("Log");
        logButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/System Task-25grey.png"))); // NOI18N

        validateTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/valid-black.png"))); // NOI18N
        validateTime.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/valid-grey.png"))); // NOI18N
        validateTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validateTimeActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setText("ms");

        javax.swing.GroupLayout optionsControlLayout = new javax.swing.GroupLayout(optionsControl);
        optionsControl.setLayout(optionsControlLayout);
        optionsControlLayout.setHorizontalGroup(
            optionsControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsControlLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(optionControlBegin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionControlBackward)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionControlRun, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionControlForward)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionControlEnd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator4, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iterationModeParallel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(iterationModeSeqentiel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionControlTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionControlTime, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(validateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iterationButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(graphTransButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editGraphButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoGraphButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logButton)
                .addGap(0, 0, 0))
        );
        optionsControlLayout.setVerticalGroup(
            optionsControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(separator4)
            .addComponent(graphTransButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(editGraphButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(infoGraphButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(optionsControlLayout.createSequentialGroup()
                .addGroup(optionsControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(optionsControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(iterationModeParallel)
                        .addComponent(iterationModeSeqentiel))
                    .addComponent(optionControlBackward, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(optionControlRun, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(optionControlEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(optionControlForward, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optionControlBegin, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(optionsControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(optionControlTimeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(optionControlTime, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(validateTime)
                .addComponent(jLabel1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionsControlLayout.createSequentialGroup()
                .addComponent(jSeparator2)
                .addGap(4, 4, 4))
            .addComponent(iterationButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        optionsChips.setBorder(javax.swing.BorderFactory.createTitledBorder("Options Chip"));

        buttonGroup1.add(modeRemoveChips);
        modeRemoveChips.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/minus-black.png"))); // NOI18N
        modeRemoveChips.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/minus-red.png"))); // NOI18N

        buttonGroup1.add(modeAddChips);
        modeAddChips.setSelected(true);
        modeAddChips.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/plus-black.png"))); // NOI18N
        modeAddChips.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/plus-red.png"))); // NOI18N

        valideOptionChips.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/valid-black.png"))); // NOI18N
        valideOptionChips.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/valid-grey.png"))); // NOI18N

        selectedNodeText.setEditable(false);
        selectedNodeText.setColumns(20);
        selectedNodeText.setRows(5);
        selectedNode.setViewportView(selectedNodeText);

        nbChipsLabel.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        nbChipsLabel.setText("Nb Chip");

        jLabel2.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        jLabel2.setText("Mode");

        separator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        buttonGroup1.add(modeSetChips);
        modeSetChips.setToolTipText("");
        modeSetChips.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/equalst-black.png"))); // NOI18N
        modeSetChips.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/Equal Sign-32red.png"))); // NOI18N
        modeSetChips.setVerifyInputWhenFocusTarget(false);
        modeSetChips.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeSetChipsActionPerformed(evt);
            }
        });

        selectAllVerticesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/To Do-32.png"))); // NOI18N
        selectAllVerticesButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/To Do-32grey.png"))); // NOI18N

        resetSelectedVerticesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/Restart-32.png"))); // NOI18N
        resetSelectedVerticesButton.setToolTipText("reset nb chips");
        resetSelectedVerticesButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/Restart-32grey.png"))); // NOI18N
        resetSelectedVerticesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetSelectedVerticesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout optionsChipsLayout = new javax.swing.GroupLayout(optionsChips);
        optionsChips.setLayout(optionsChipsLayout);
        optionsChipsLayout.setHorizontalGroup(
            optionsChipsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsChipsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(optionsChipsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(optionsChipsLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separator5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(optionsChipsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modeRemoveChips)
                            .addComponent(modeSetChips)
                            .addComponent(modeAddChips)))
                    .addGroup(optionsChipsLayout.createSequentialGroup()
                        .addComponent(nbChipsLabel)
                        .addGap(18, 18, 18)
                        .addComponent(inputNbChips, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(optionsChipsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(selectedNode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionsChipsLayout.createSequentialGroup()
                        .addComponent(selectAllVerticesButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetSelectedVerticesButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(valideOptionChips, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        optionsChipsLayout.setVerticalGroup(
            optionsChipsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsChipsLayout.createSequentialGroup()
                .addGroup(optionsChipsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(optionsChipsLayout.createSequentialGroup()
                        .addGroup(optionsChipsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nbChipsLabel)
                            .addComponent(inputNbChips, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(optionsChipsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(optionsChipsLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(optionsChipsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(separator5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(optionsChipsLayout.createSequentialGroup()
                                        .addComponent(modeAddChips)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(modeRemoveChips)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(optionsChipsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(modeSetChips)
                                            .addComponent(selectAllVerticesButton)
                                            .addComponent(resetSelectedVerticesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(optionsChipsLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(optionsChipsLayout.createSequentialGroup()
                        .addComponent(selectedNode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(valideOptionChips, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        InformationsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Informations")));

        labelCycleLimit.setText("Cycle limite :");

        labelSizeCycleLimit.setText("0");

        javax.swing.GroupLayout InformationsPanelLayout = new javax.swing.GroupLayout(InformationsPanel);
        InformationsPanel.setLayout(InformationsPanelLayout);
        InformationsPanelLayout.setHorizontalGroup(
            InformationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformationsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCycleLimit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSizeCycleLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InformationsPanelLayout.setVerticalGroup(
            InformationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformationsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InformationsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCycleLimit)
                    .addComponent(labelSizeCycleLimit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout playCFGLayout = new javax.swing.GroupLayout(playCFG);
        playCFG.setLayout(playCFGLayout);
        playCFGLayout.setHorizontalGroup(
            playCFGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playCFGLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(playCFGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playCFGLayout.createSequentialGroup()
                        .addComponent(optionsChips, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InformationsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(optionsControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewGraph, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        playCFGLayout.setVerticalGroup(
            playCFGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playCFGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(optionsControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewGraph, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playCFGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(optionsChips, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(InformationsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1263, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(playCFG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 716, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(playCFG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        file.setText("File");

        open.setText("Open");
        file.add(open);
        file.add(separator1);

        Save.setText("Save");
        file.add(Save);

        saveas.setText("Save As");
        file.add(saveas);
        file.add(separator2);

        import_.setText("Import from template");
        file.add(import_);
        file.add(separator3);

        quit.setText("Quit");
        file.add(quit);

        menu.add(file);

        about.setText("About");
        menu.add(about);

        setJMenuBar(menu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetSelectedVerticesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetSelectedVerticesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resetSelectedVerticesButtonActionPerformed

    private void modeSetChipsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeSetChipsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modeSetChipsActionPerformed

    private void iterationModeParallelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iterationModeParallelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iterationModeParallelActionPerformed

    private void validateTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validateTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_validateTimeActionPerformed

    //Implémentation du pattern observer
    @Override
    public void update(Observable o, Object o1) {
        if (o instanceof ModelMainFrame) {
            selectedNodeText.setText(((ModelMainFrame) o).getSelectedNode().toString());
            optionControlTime.setText(Double.toString(((ModelMainFrame) o).getTimeExec()));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel InformationsPanel;
    private javax.swing.JMenuItem Save;
    private javax.swing.JMenu about;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton editGraphButton;
    private javax.swing.JMenu file;
    private javax.swing.JButton graphTransButton;
    private javax.swing.JMenuItem import_;
    private javax.swing.JButton infoGraphButton;
    private javax.swing.JTextField inputNbChips;
    private javax.swing.JButton iterationButton;
    private javax.swing.ButtonGroup iterationMode;
    private javax.swing.JRadioButton iterationModeParallel;
    private javax.swing.JRadioButton iterationModeSeqentiel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelCycleLimit;
    private javax.swing.JLabel labelSizeCycleLimit;
    private javax.swing.JButton logButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menu;
    private javax.swing.JRadioButton modeAddChips;
    private javax.swing.JRadioButton modeRemoveChips;
    private javax.swing.JRadioButton modeSetChips;
    private javax.swing.JLabel nbChipsLabel;
    private javax.swing.JMenuItem open;
    private javax.swing.JButton optionControlBackward;
    private javax.swing.JButton optionControlBegin;
    private javax.swing.JButton optionControlEnd;
    private javax.swing.JButton optionControlForward;
    private javax.swing.JButton optionControlRun;
    private javax.swing.JTextField optionControlTime;
    private javax.swing.JLabel optionControlTimeLabel;
    private javax.swing.JPanel optionsChips;
    private javax.swing.JPanel optionsControl;
    private javax.swing.JPanel playCFG;
    private javax.swing.JMenuItem quit;
    private javax.swing.JButton resetSelectedVerticesButton;
    private javax.swing.JMenuItem saveas;
    private javax.swing.JButton selectAllVerticesButton;
    private javax.swing.JScrollPane selectedNode;
    private javax.swing.JTextArea selectedNodeText;
    private javax.swing.JPopupMenu.Separator separator1;
    private javax.swing.JPopupMenu.Separator separator2;
    private javax.swing.JPopupMenu.Separator separator3;
    private javax.swing.JSeparator separator4;
    private javax.swing.JSeparator separator5;
    private javax.swing.JButton validateTime;
    private javax.swing.JButton valideOptionChips;
    private javax.swing.JPanel viewGraph;
    // End of variables declaration//GEN-END:variables

    public JButton getResetSelectedVerticesButton() {
        return resetSelectedVerticesButton;
    }

    public JButton getSelectAllVerticesButton() {
        return selectAllVerticesButton;
    }

    public JRadioButton getModeSetChips() {
        return modeSetChips;
    }

    public ModelMainFrame getModel() {
        return modelMailFrame;
    }

    public JMenuItem getSave() {
        return Save;
    }

    public JMenu getAbout() {
        return about;
    }

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public JButton getEditGraphButton() {
        return editGraphButton;
    }

    public JMenu getFile() {
        return file;
    }

    public JButton getGraphTransButton() {
        return graphTransButton;
    }

    public JMenuItem getImport_() {
        return import_;
    }

    public JButton getInfoGraphButton() {
        return infoGraphButton;
    }

    public JTextField getInputNbChips() {
        return inputNbChips;
    }

    public JButton getIterationButton() {
        return iterationButton;
    }

    public ButtonGroup getIterationMode() {
        return iterationMode;
    }

    public JRadioButton getIterationModeParallel() {
        return iterationModeParallel;
    }

    public JRadioButton getIterationModeSeqentiel() {
        return iterationModeSeqentiel;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public JMenuBar getMenu() {
        return menu;
    }

    public JRadioButton getModeAddChips() {
        return modeAddChips;
    }

    public JRadioButton getModeRemoveChips() {
        return modeRemoveChips;
    }

    public JLabel getNbChipsLabel() {
        return nbChipsLabel;
    }

    public JMenuItem getOpen() {
        return open;
    }

    public JButton getOptionControlBackward() {
        return optionControlBackward;
    }

    public JButton getOptionControlBegin() {
        return optionControlBegin;
    }

    public JButton getOptionControlEnd() {
        return optionControlEnd;
    }

    public JButton getOptionControlForward() {
        return optionControlForward;
    }

    public JButton getOptionControlRun() {
        return optionControlRun;
    }

    public JTextField getOptionControlTime() {
        return optionControlTime;
    }

    public JLabel getOptionControlTimeLabel() {
        return optionControlTimeLabel;
    }

    public JButton getValidateTime() {
        return validateTime;
    }

    public JPanel getOptionsChips() {
        return optionsChips;
    }

    public JPanel getOptionsControl() {
        return optionsControl;
    }

    public JPanel getPlayCFG() {
        return playCFG;
    }

    public JMenuItem getQuit() {
        return quit;
    }

    public JMenuItem getSaveas() {
        return saveas;
    }

    public JScrollPane getSelectedNode() {
        return selectedNode;
    }

    public JTextArea getSelectedNodeText() {
        return selectedNodeText;
    }

    public JPopupMenu.Separator getSeparator1() {
        return separator1;
    }

    public JPopupMenu.Separator getSeparator2() {
        return separator2;
    }

    public JPopupMenu.Separator getSeparator3() {
        return separator3;
    }

    public JSeparator getSeparator4() {
        return separator4;
    }

    public JSeparator getSeparator5() {
        return separator5;
    }

    public JButton getValideOptionChips() {
        return valideOptionChips;
    }

    public JPanel getViewGraph() {
        return viewGraph;
    }

    public JButton getLogButton() {
        return logButton;
    }

    public JPanel getpPlayCFG() {
        return playCFG;
    }

    public void printLimitCycleSize(long limitCycleSize) {
        labelSizeCycleLimit.setText(Long.toString(limitCycleSize));
    }
}