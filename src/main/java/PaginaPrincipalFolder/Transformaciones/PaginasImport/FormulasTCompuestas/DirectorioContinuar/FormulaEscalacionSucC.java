package PaginaPrincipalFolder.Transformaciones.PaginasImport.FormulasTCompuestas.DirectorioContinuar;

import PaginaPrincipalFolder.Settings.AjustesVentanaFormula;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class FormulaEscalacionSucC extends JFrame {

    AjustesVentanaFormula ajustesVentana = new AjustesVentanaFormula();

    public FormulaEscalacionSucC() {
        setTitle("FÓRMULAS ESCALACIÓN SUCESIVA");
        setSize(ajustesVentana.getWindowSize());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createCompoundBorder(
                new EmptyBorder(20, 30, 20, 30),
                BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(new Color(200, 200, 200), 1),
                        new EmptyBorder(20, 20, 20, 20)
                )
        ));
        mainPanel.setBackground(new Color(252, 252, 252));

        JPanel centeredPanel = new JPanel();
        centeredPanel.setLayout(new BoxLayout(centeredPanel, BoxLayout.Y_AXIS));
        centeredPanel.setBackground(mainPanel.getBackground());
        centeredPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Título principal
        JLabel titleLabel = new JLabel("FÓRMULAS ESCALACIÓN SUCESIVA");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(new Color(33, 33, 33));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Separador
        JSeparator separator = new JSeparator();
        separator.setMaximumSize(new Dimension(400, 1));
        separator.setForeground(new Color(200, 200, 200));

        // Procedimiento General
        JLabel procGeneralLabel = createSectionLabel("Procedimiento General");
        JLabel pxyGeneralLabel = createContentLabel("P'(X', Y'):");

        JLabel matrizGeneral = new JLabel("<html><div style='text-align: center; font-family: Courier New; font-size: 14px;'>"
                + "[X'' Y'' 1] = [X' Y' 1] · "
                + "<table align='center' style='margin-top: 10px;'>"
                + "<tr><td>[</td><td>&nbsp;Sx₂&nbsp;</td><td>&nbsp;0&nbsp;</td><td>&nbsp;0&nbsp;</td><td>]</td></tr>"
                + "<tr><td>[</td><td>&nbsp;0&nbsp;</td><td>&nbsp;Sy₂&nbsp;</td><td>&nbsp;0&nbsp;</td><td>]</td></tr>"
                + "<tr><td>[</td><td>&nbsp;0&nbsp;</td><td>&nbsp;0&nbsp;</td><td>&nbsp;1&nbsp;</td><td>]</td></tr>"
                + "</table>"
                + "<div style='margin-top: 10px;'>[X'' Y'' 1] = [X'·Sx₂ Y'·Sy₂ 1]</div></div></html>");
        matrizGeneral.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Procedimiento Particular
        JLabel procParticularLabel = createSectionLabel("Procedimiento Particular");
        JLabel pxyParticularLabel = createContentLabel("P'1(X'1, Y'1):");

        JLabel matrizParticular = new JLabel("<html><div style='text-align: center; font-family: Courier New; font-size: 14px;'>"
                + "[X''₁ Y''₁ 1] = [X'₁ Y'₁ 1] · "
                + "<table align='center' style='margin-top: 10px;'>"
                + "<tr><td>[</td><td>&nbsp;Sx₂&nbsp;</td><td>&nbsp;0&nbsp;</td><td>&nbsp;0&nbsp;</td><td>]</td></tr>"
                + "<tr><td>[</td><td>&nbsp;0&nbsp;</td><td>&nbsp;Sy₂&nbsp;</td><td>&nbsp;0&nbsp;</td><td>]</td></tr>"
                + "<tr><td>[</td><td>&nbsp;0&nbsp;</td><td>&nbsp;0&nbsp;</td><td>&nbsp;1&nbsp;</td><td>]</td></tr>"
                + "</table>"
                + "<div style='margin-top: 10px;'>[X''₁ Y''₁ 1] = [X'₁·Sx₂ Y'₁·Sy₂ 1]</div></div></html>");
        matrizParticular.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Sección de operaciones
        JLabel operacionesLabel = createSectionLabel("Operaciones:");
        JPanel operacionesPanel = new JPanel();
        operacionesPanel.setLayout(new BoxLayout(operacionesPanel, BoxLayout.Y_AXIS));
        operacionesPanel.setBackground(mainPanel.getBackground());
        operacionesPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        operacionesPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(1, 0, 1, 0, new Color(200, 200, 200)),
                new EmptyBorder(10, 0, 10, 0)
        ));

        JLabel[] operaciones = {
                new JLabel("<html><div style='font-family: Courier New; font-size: 14px;'>X'(Sx₂) + Y'(0) + 1(0) = X' · Sx₂</div></html>"),
                new JLabel("<html><div style='font-family: Courier New; font-size: 14px;'>X'(0) + Y'(Sy₂) + 1(0) = Y' · Sy₂</div></html>"),
                new JLabel("<html><div style='font-family: Courier New; font-size: 14px;'>X'(0) + Y'(0) + 1(1) = 1</div></html>")
        };

        // Botón Aceptar
        JButton aceptarButton = new JButton("Aceptar");
        aceptarButton.setFont(new Font("Arial", Font.BOLD, 14));
        aceptarButton.setPreferredSize(new Dimension(120, 35));
        aceptarButton.setMaximumSize(new Dimension(120, 35));
        aceptarButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        aceptarButton.setBackground(new Color(70, 130, 180));
        aceptarButton.setForeground(Color.BLUE);
        aceptarButton.setFocusPainted(false);
        aceptarButton.addActionListener(e -> dispose());


        // Agregar componentes al panel
        centeredPanel.add(titleLabel);
        centeredPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        centeredPanel.add(separator);
        centeredPanel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Agregar Procedimiento General
        centeredPanel.add(procGeneralLabel);
        centeredPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        centeredPanel.add(pxyGeneralLabel);
        centeredPanel.add(matrizGeneral);
        centeredPanel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Agregar Procedimiento Particular
        centeredPanel.add(procParticularLabel);
        centeredPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        centeredPanel.add(pxyParticularLabel);
        centeredPanel.add(matrizParticular);
        centeredPanel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Agregar Operaciones
        centeredPanel.add(operacionesLabel);
        centeredPanel.add(operacionesPanel);
        for (JLabel op : operaciones) {
            operacionesPanel.add(op);
            operacionesPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        }

        centeredPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        centeredPanel.add(aceptarButton);


        // Agregar panel centrado al panel principal
        mainPanel.add(centeredPanel);

        // Agregar scroll
        JScrollPane scrollPane = new JScrollPane(mainPanel);
        scrollPane.setBorder(null);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        add(scrollPane);
    }

    private JLabel createSectionLabel(String text) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("Arial", Font.BOLD, 14));
        label.setForeground(new Color(70, 130, 180));
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        return label;
    }

    private JLabel createContentLabel(String text) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("Arial", Font.PLAIN, 14));
        label.setForeground(new Color(66, 66, 66));
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        return label;
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            FormulaEscalacionSucC frame = new FormulaEscalacionSucC();
            frame.setVisible(true);
        });
    }
}