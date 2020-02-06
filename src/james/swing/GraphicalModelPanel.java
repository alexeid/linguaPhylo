package james.swing;

import james.graphicalModel.GraphicalModelParser;
import james.graphicalModel.*;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class GraphicalModelPanel extends JPanel {

    GraphicalModelComponent component;
    JLabel dummyLabel = new JLabel("");
    GraphicalModelInterpreter intepreter;
    JTabbedPane rightPane;

    GraphicalModelParser parser;

    JButton sampleButton = new JButton("Sample");

    JSplitPane splitPane;

    Object displayedElement;

    GraphicalModelPanel(GraphicalModelParser parser) {

        this.parser = parser;
        intepreter = new GraphicalModelInterpreter(parser);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.LINE_AXIS));
        buttonPanel.add(sampleButton);

        sampleButton.addActionListener(e -> {
            parser.sample();
            showValue(parser.getRoots().iterator().next());
        });


        component = new GraphicalModelComponent(parser);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(component);
        panel.add(buttonPanel);

        setLayout(new BorderLayout());

        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panel, dummyLabel);
        splitPane.setResizeWeight(0.5);
        add(splitPane, BorderLayout.CENTER);

        GraphicalModelListener listener = new GraphicalModelListener() {
            @Override
            public void valueSelected(Value value) {

                showValue(value);
            }

            @Override
            public void generativeDistributionSelected(GenerativeDistribution g) {
                showGenerativeDistribution(g);
            }

            @Override
            public void functionSelected(DeterministicFunction f) {

                showFunction(f);
            }

        };

        component.addGraphicalModelListener(listener);
        parser.addGraphicalModelChangeListener(component);
        parser.addGraphicalModelListener(new GraphicalModelListener() {
            @Override
            public void valueSelected(Value value) {
                showValue(value);
            }

            @Override
            public void generativeDistributionSelected(GenerativeDistribution g) {

            }

            @Override
            public void functionSelected(DeterministicFunction f) {

            }
        });
        
        add(intepreter, BorderLayout.SOUTH);

        rightPane = new JTabbedPane();
        rightPane.addTab("Current", new JPanel());
        rightPane.addTab("Values", new StatePanel(parser, true, false, false));
        rightPane.addTab("Variables", new StatePanel(parser, false, true, false));
        rightPane.addTab("JSON", new JSONPanel(parser));
        rightPane.addTab("Model", new CanonicalModelPanel(parser));
        splitPane.setRightComponent(rightPane);

        showValue(parser.getRoots().iterator().next());
    }

    void showValue(Value value) {
        displayedElement = value;
        rightPane.setComponentAt(0, value.getViewer());
        repaint();
    }

    private void showGenerativeDistribution(GenerativeDistribution g) {
        displayedElement = g;
        rightPane.setComponentAt(0, g.getViewer());
        repaint();

    }

    private void showFunction(DeterministicFunction f) {
        displayedElement = f;
        rightPane.setComponentAt(0, f.getViewer());
        repaint();
    }

    public static void main(String[] args) {

        String[] lines = {
                "rate = 1.0;",
                "L = 50;",
                "mu = 0.01;",
                "n = 20;",
                "mean = 3.0;",
                "sd = 1.0;",
                "logTheta ~ Normal(mean=mean, sd=sd);",
                "Θ = exp(logTheta);",
                "Q = jukesCantor(rate=rate);",
                "ψ ~ Coalescent(n=n, theta=Θ);",
                "D ~ PhyloCTMC(L=L, mu=mu, Q=Q, tree=ψ);"};

        GraphicalModelParser parser = new GraphicalModelParser();
        parser.parseLines(lines);
        Set<Value> values = parser.getRoots();
        if (values.size() != 1) throw new RuntimeException("Expected 1 root node in the graphical model!");

        Value v = values.iterator().next();

        if (v instanceof RandomVariable) {

            GraphicalModelPanel panel = new GraphicalModelPanel(parser);
            panel.setPreferredSize(new Dimension(1200, 800));

            JFrame frame = new JFrame("Graphical Models");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.getContentPane().add(panel, BorderLayout.CENTER);
            frame.pack();
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);
            frame.setVisible(true);
        } else {
            throw new RuntimeException("Expected root node to be a random variable!");
        }
    }
}