import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class controller {

    ObservableList<String> options =
            FXCollections.observableArrayList(
                    "metry",
                    "jardy",
                    "stopy"
            );

    @FXML
    TextField value;

    @FXML
    ComboBox comboBox1;

    @FXML
    ComboBox comboBox2;

    @FXML
    Label label;

    @FXML
    void initialize(){
        value.setText("100");
        comboBox1.setItems(options);
        comboBox2.setItems(options);
        comboBox1.setValue(options.get(0));
        comboBox2.setValue(options.get(0));
        showOnLabel();
        if(comboBox1.getValue()=="metry"){System.out.println("Działa");}

    }
    void showOnLabel(){
        label.setText(value.getText() + " " +comboBox1.getValue());
    }

}
