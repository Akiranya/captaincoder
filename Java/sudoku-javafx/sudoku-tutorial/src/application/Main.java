package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/***
 * The application class; handles inflating the layout and launching itself.
 *
 * @author Captain Coder
 * @version 1
 * @see Application
 * @see FXMLLoader
 * @see Scene
 * @see Stage
 */
public class Main extends Application {
    /***
     *
     * @param args to configure launch with
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    /* modify the method declaration to throw generic Exception (in case any of the steps fail) */
    public void start(Stage primaryStage) throws Exception {

        /* load layout.fxml from file and assign it to a scene root object */
        Parent root = FXMLLoader.load(getClass().getResource("layout.fxml"));

        /* assign the root to a new scene and define its dimensions */
        Scene scene = new Scene(root, 720, 480);

        /* set the title of the stage (window) */
        primaryStage.setTitle("Sudoku");
        /* set the scene of the stage to our newly created from the layout scene */
        primaryStage.setScene(scene);
        /* show the stage */
        primaryStage.show();
    }
}
