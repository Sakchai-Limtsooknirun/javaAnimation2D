package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class ControllerInfo {
    @FXML
    TextArea infoArea;

    public void initialize(){
        infoArea.setEditable(false);
        infoArea.appendText("\t\t\t\tผู้จัดทำโปรแกรม\n\n");
        infoArea.appendText("\tนาย ศักย์ชัย\tลิ้มสุขนิรันดร์\t5810451063\n\n");
        infoArea.appendText("\tSec 200 ");
    }
}
