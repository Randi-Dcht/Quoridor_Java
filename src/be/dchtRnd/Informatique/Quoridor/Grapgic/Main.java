package be.dchtRnd.Informatique.Quoridor.Grapgic;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application
{

    private Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        BorderPane root = new BorderPane();
        primaryStage.setScene(new Scene(root, 1000, 500));

        root.setRight(getChoose());

        primaryStage.setTitle("MainToQuoridor");
        primaryStage.show();
        stage = primaryStage;
    }

    public VBox getChoose()
    {
        VBox vb = new VBox();
        vb.setSpacing(20);

        Text soloT = new Text("Play the game (one player)");
        Button solo = new Button("Mode Solo");
        Text twoT  = new Text("Play the game (two players)");
        Button two  = new Button("Mode Duo");
        Text fourT = new Text("Play the game (four players)");
        Button four = new Button("Mode Quatro");
        Text old = new Text("Play an old game (check list)");

        solo.setOnAction(e->
        {
            stage.close();
        });
        two.setOnAction(e->
        {
            stage.close();
        });
        four.setOnAction(e->
        {
            stage.close();
        });

        vb.getChildren().addAll(soloT,solo,twoT,two,fourT,four,old);
        return vb;
    }


    public static void main(String[] args) {
        launch(args);
    }
}
