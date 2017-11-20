package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class ControllerHowto {
    @FXML
    TextArea howtoArea ;

    public void initialize(){
        howtoArea.setEditable(false);
        howtoArea.appendText("\t\t\t\t\tHow to\n\n");
        howtoArea.appendText("\tผู้ใช้สามารถ เคลื่อนไหวObject เรือ \n\n");
        howtoArea.appendText("\tโดยการกดปุ่ม W,A,S,D และสามารถคลิกเลือกเรือ\n\n\tลำอื่นเพื่อเคลื่อนไหวได้\n\n\tกดปุ่มลูกศรขึ้น และ ปุ่มลูกศรลง เพื่อ เพิ่มลดความเร็ว \n\n");
        howtoArea.appendText("\tกดปุ่ม Play เพื่อเล่นAnimation");
    }
}
