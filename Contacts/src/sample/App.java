package sample;

//Faheem Kamal

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.stage.FileChooser;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ListView;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.Comparator;
import java.util.ResourceBundle;
import java.io.FileNotFoundException;

public class App implements Initializable {
    public TextField phone;
    public TextField lastname;
    public TextField middlename;
    public TextField firstname;
    public TextField email;
    public TextField cellnum;
    public TextField titleofjob;
    public ListView<Contact> contactlist;
    public ImageView contact;
    public Button add;
    public Button save;
    public Button delete;

    public void addcontact(ActionEvent actionEvent){
        lastname.clear();
        firstname.clear();
        middlename.clear();
        email.clear();
        phone.clear();
        cellnum.clear();
        titleofjob.clear();
        contact.setImage(null);
        currentpicture = null;
        currentcontact = new Contact();
    }


    public void savingcontact(ActionEvent actionEvent){
        if(lastname.getText().isEmpty()|| middlename.getText().isEmpty() || firstname.getText().isEmpty()){
            return;
        }
        currentcontact.setLast_name(lastname.getText());
        currentcontact.setMiddle_name(middlename.getText());
        currentcontact.setFirst_name(firstname.getText());
        currentcontact.setAddress(email.getText());
        currentcontact.setPhonenum(phone.getText());
        currentcontact.setJobtitle(titleofjob.getText());
        currentcontact.setCellnum(cellnum.getText());
        currentcontact.setPicture(currentpicture);

        int indexes = currentlist.indexOf(currentcontact);
        if(indexes < 0){
            currentlist.add(currentcontact);
        }
        else if(indexes >= 0){
            currentlist.set(indexes,null);
            currentlist.set(indexes,currentcontact);
        }
        sort();
    }
    private void sort(){
        Comparator<Contact> comparison = (object1, object2) -> object1.getFirst_name().compareToIgnoreCase(object2.getFirst_name());
        FXCollections.sort(currentlist,comparison);
    }

    public void deletestuff(ActionEvent actionEvent){
        int indexes = currentlist.indexOf(currentcontact);
        if(indexes >= 0){
            currentlist.remove(currentcontact);
        }else{
            addcontact(null);
        }
    }

    public void addpicture(MouseEvent mouseEvent){
        File files = choosefile.showOpenDialog(contact.getScene().getWindow());
        try{
            currentpicture = new Image(new FileInputStream(files));
            contact.setImage(currentpicture);
        }catch (FileNotFoundException error){
            error.printStackTrace();
        }
    }

    @Override
    public void initialize( URL websitestuff, ResourceBundle resource){
        currentlist = FXCollections.observableArrayList();
        contactlist.setItems(currentlist);
        contactlist.setCellFactory(contactviewlist -> new Contactviewlisting());
        currentcontact = new Contact();
        currentpicture = null;
        {
            FileChooser.ExtensionFilter filterimage = new FileChooser.ExtensionFilter("*.jpeg");
            choosefile = new FileChooser();
            choosefile.getExtensionFilters().add(filterimage);

            contactlist.setOnMouseClicked(clicked -> {
                if (contactlist.getSelectionModel().getSelectedItem() != currentcontact) {
                    currentcontact = contactlist.getSelectionModel().getSelectedItem();
                    lastname.setText(currentcontact.getLast_name());
                    middlename.setText(currentcontact.getMiddle_name());
                    firstname.setText(currentcontact.getFirst_name());
                    email.setText(currentcontact.getAddress());
                    phone.setText(currentcontact.getPhonenum());
                    cellnum.setText(currentcontact.getCellnum());
                    titleofjob.setText(currentcontact.getJobtitle());
                    contact.setImage(currentcontact.getPicture());
                }
            });
        }
    }

    private FileChooser choosefile;
    private ObservableList<Contact> currentlist;
    private Image currentpicture;
    private Contact currentcontact;
}
