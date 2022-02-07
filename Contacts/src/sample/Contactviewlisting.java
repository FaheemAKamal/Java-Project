package sample;

//Faheem Kamal

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.AnchorPane;
import javafx.scene.image.ImageView;
import javafx.fxml.FXMLLoader;

public class Contactviewlisting extends ListCell<Contact> {
    @FXML
        public AnchorPane root;
    @FXML
        public Label name;
    @FXML
        public ImageView photo;

    private FXMLLoader loader;

    @Override
    protected void updateItem(Contact stuff, boolean empty) {
        super.updateItem(stuff, empty);
        if (empty || stuff == null){
            setText(null);
            setGraphic(null);
        }else{
            if (loader == null){
                try {
                    loader = new FXMLLoader(getClass().getResource("sample.fxml"));
                    loader.setController(this);
                    loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

            name.setText(stuff.getFirst_name()+" "+stuff.getMiddle_name()+" "+stuff.getLast_name());
            photo.setImage(stuff.getPicture());
            setText(null);
            setGraphic(root);
        }
    }
}
