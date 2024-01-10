//java 1 first frame code 
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MahwishJewelleryApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Mahwish's Jewellery");

        VBox root = new VBox();
        root.getChildren().add(new Label("Feedback Corner"));
        root.getChildren().add(new Label("Shanay - \"The customer experience was exceptional...\""));
        root.getChildren().add(new Label("Zahra - \"I absolutely love the quality and style of the jewellery...\""));
        root.getChildren().add(new Label("Areeba - \"I had a great experience shopping on this website...\""));
        // Add more components as needed

        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}




// frame 3 code 

import javax.swing.*;
import java.awt.*;

public class FFrame extends JFrame {
    public FFrame() {
        setTitle("F");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel mainPanel = new JPanel(new BorderLayout());

        // Header Panel
        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel aboutUsLabel = new JLabel("ABOUT US");
        headerPanel.add(aboutUsLabel, BorderLayout.NORTH);

        ImageIcon bannerImage = new ImageIcon("./assets/zalika-website-banner-jewelry-1.png");
        JLabel bannerLabel = new JLabel(bannerImage);
        headerPanel.add(bannerLabel, BorderLayout.CENTER);

        mainPanel.add(headerPanel, BorderLayout.NORTH);

        // Content Panel
        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JTextArea welcomeText = new JTextArea("WELCOME to Mahwish’s jewelry store, we proudly showcase its exciting new range of stylish 925 silver jewelry, including our Production Collection and Silver band Ring Collection, all widths, all sizes. Our designs sell well, helping you get the quickest return on your initial wholesale investment. Our range is made from the finest 925 solid silver and complimented with a variety of stones. We also offer a beautiful range of high-quality designer silver jewelry which makes them stand apart from the competition. All orders are shipped directly from Thailand with care and true customer satisfaction in mind.");
        welcomeText.setLineWrap(true);
        welcomeText.setWrapStyleWord(true);
        welcomeText.setEditable(false);

        contentPanel.add(welcomeText, BorderLayout.CENTER);

        mainPanel.add(contentPanel, BorderLayout.CENTER);

        add(mainPanel, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null); // Center the frame
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FFrame().setVisible(true);
        });
    }
}
// java 2 file login page frame 
import javax.swing.*;
import java.awt.*;

public class Frame2 extends JFrame {
    public Frame2() {
        setTitle("Frame 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel framePanel = new JPanel(new GridLayout(1, 2));

        // Login Panel
        JPanel loginPanel = new JPanel(new BorderLayout());
        loginPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JButton loginButton = new JButton("Log in");
        loginPanel.add(loginButton, BorderLayout.NORTH);

        // Signup Panel
        JPanel signupPanel = new JPanel(new BorderLayout());
        signupPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JButton signupButton = new JButton("Sign up");
        signupPanel.add(signupButton, BorderLayout.NORTH);

        framePanel.add(loginPanel);
        framePanel.add(signupPanel);

        add(framePanel, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null); // Center the frame
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Frame2().setVisible(true);
        });
    }
}

