import javafx.animation.PauseTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.geometry.NodeOrientation;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

public class FXMLController {

    @FXML
    private ImageView imgBackground;

    @FXML
    private ImageView imgSonic;

    @FXML
    private ImageView imgSonicMove;

    @FXML
    private ImageView imgTails;

    @FXML
    private ImageView imgEggman;

    @FXML
    void MoveSonic(MouseEvent event) {
        imgSonic.setVisible(false);
        imgSonicMove.setVisible(true);
    }

    int countSonic = 0;

    @FXML
    void MoveRunSonic(MouseEvent event) {
        countSonic++;
        if (countSonic == 5) {
            TranslateTransition sonicMove = new TranslateTransition();
            sonicMove.setNode(imgSonicMove);
            sonicMove.setByX(900);
            sonicMove.setDuration(Duration.millis(1000));
            sonicMove.play();
            this.EggmanMove();
        }
    }

    TranslateTransition tailsMove = new TranslateTransition();
    int countTails = 0;

    @FXML
    void MoveTails(MouseEvent event) {
        countTails++;
        if (countTails % 2 != 0) {
            imgTails.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
            tailsMove.setNode(imgTails);
            tailsMove.setByX(-330);
            tailsMove.setDuration(Duration.millis(2000));
            tailsMove.play();
            this.ReturnTails();
        }
        if (countTails % 2 == 0) {
            tailsMove.setNode(imgTails);
            tailsMove.setByX(330);
            tailsMove.setDuration(Duration.millis(2000));
            tailsMove.play();
            this.OrientationTails();
        }
    }

    void OrientationTails() {
        PauseTransition tailsReturn = new PauseTransition();
        tailsReturn.setDuration(Duration.millis(2000));
        tailsReturn.setOnFinished(event -> imgTails.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT));
        tailsReturn.play();
    }

    @FXML
    void ReturnTails() {
        PauseTransition tailsReturn = new PauseTransition();
        tailsReturn.setDuration(Duration.millis(2000));
        tailsReturn.setOnFinished(event -> imgTails.setNodeOrientation(NodeOrientation.LEFT_TO_RIGHT));
        tailsReturn.play();
    }

    void EggmanMove() {
        TranslateTransition eggmanMove = new TranslateTransition();
        eggmanMove.setNode(imgEggman);
        eggmanMove.setByX(900);
        eggmanMove.setDuration(Duration.millis(1700));
        eggmanMove.play();
    }
}
