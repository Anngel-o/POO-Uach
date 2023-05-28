import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private Button btnCalc;

    @FXML
    private Label lblApp;

    @FXML
    private Label lblNum1;

    @FXML
    private Label lblNum2;

    @FXML
    private Label lblRes;

    @FXML
    private TextField txtNum1;

    @FXML
    private TextField txtNum2;

    @FXML
    void btnOnClicked(ActionEvent event) {
        int num1 = Integer.valueOf(txtNum1.getText());
        int num2 = Integer.valueOf(txtNum2.getText());
        int res = num1 * num2;
        lblRes.setText("= " + res);
    }

}
