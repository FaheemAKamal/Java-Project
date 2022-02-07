package sample;

import java.math.*;

import javafx.beans.value.ObservableValue;
import javafx.scene.control.Label;
import java.text.*;
import java.math.BigDecimal;
import javafx.scene.control.*;
import javafx.fxml.*;
import javafx.event.ActionEvent;
import javafx.beans.*;
import javafx.beans.Observable;
import javafx.util.*;
import java.net.*;
import java.util.ResourceBundle;


public class Controller implements Initializable{
    @FXML
    private TextField purchase;
    @FXML
    private TextField downpayment;
    @FXML
    private TextField loanpayment;
    @FXML
    private TextField interest;
    @FXML
    private TextField textfields;
    @FXML
    private TextField yearsof10;
    @FXML
    private TextField yearsof20;
    @FXML
    private TextField yearsof30;
    @FXML
    private Slider slider;
    @FXML
    private Label custom;
    @FXML
    private Button calculate;



    private BigDecimal years = new BigDecimal(10);
    @FXML
    private void calculateclick(ActionEvent action){
        try{
            BigDecimal purchasing = new BigDecimal(purchase.getText());
            BigDecimal downpayments = new BigDecimal(downpayment.getText());
            BigDecimal loans = purchasing.subtract(downpayments);
            loanpayment.setText(loans.toString());
            Integer y = new Integer(custom.getText());
            yearsof10.setText(x.format(MPayment(10)));
            yearsof20.setText(x.format(MPayment(20)));
            yearsof30.setText((x.format(MPayment(30))));
            textfields.setText(x.format(MPayment(y)));
        }catch(NumberFormatException e){
            downpayment.setText("Down payment needed!");
            downpayment.selectAll();
            interest.setText("Rate needed!");
            interest.selectAll();
            purchase.setText("Purchase amount needed!");
            purchase.selectAll();
            purchase.requestFocus();
        }
    }
    private static final NumberFormat x = NumberFormat.getCurrencyInstance();

    private Double MPayment(Integer y){
        Double b;
        Double percentage = new Double(interest.getText());
        Double loans = new Double(loanpayment.getText());
        y = y*12;
        percentage /= 100.0;
        percentage /= 12.0;
        b = (loans*percentage)/(1-Math.pow(1+percentage,-y));
        return b;
    }


    @Override
    public void initialize(URL website, ResourceBundle rb){
        x.setRoundingMode(RoundingMode.HALF_UP);
        slider.valueProperty().addListener((ObservableValue<? extends Number> obv, Number oldvalue, Number newvalue)-> {
            years = BigDecimal.valueOf(newvalue.intValue());
            custom.setText(NumberFormat.getIntegerInstance().format(years));

        });
    }





}
