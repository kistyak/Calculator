package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Button button0;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private Button buttonAddition;

    @FXML
    private Button buttonC;

    @FXML
    private Button buttonDivision;

    @FXML
    private Button buttonEquals;

    @FXML
    private Button buttonMultiplication;

    @FXML
    private Button buttonSubtraction;

    @FXML
    private Label window;


    @FXML
    void initialize() {

        button1.setOnAction(e -> window.setText(window.getText() + "1"));
        button2.setOnAction(e -> window.setText(window.getText() + "2"));
        button3.setOnAction(e -> window.setText(window.getText() + "3"));
        button4.setOnAction(e -> window.setText(window.getText() + "4"));
        button5.setOnAction(e -> window.setText(window.getText() + "5"));
        button6.setOnAction(e -> window.setText(window.getText() + "6"));
        button7.setOnAction(e -> window.setText(window.getText() + "7"));
        button8.setOnAction(e -> window.setText(window.getText() + "8"));
        button9.setOnAction(e -> window.setText(window.getText() + "9"));
        button0.setOnAction(e -> window.setText(window.getText() + "0"));

        buttonC.setOnAction(e -> {
            window.setText("");
            disableIs();
        });

        buttonAddition.setOnAction(e -> {
            if(!window.getText().equals("")){
                a = Double.parseDouble(window.getText());
                window.setText("");
                disableIs();
                isAdditionPressed = true;
            }
        });
        buttonSubtraction.setOnAction(e -> {
            if(!window.getText().equals("")){
                a = Double.parseDouble(window.getText());
                window.setText("");
                disableIs();
                isSubtractionPressed = true;
            }
        });
        buttonMultiplication.setOnAction(e -> {
            if(!window.getText().equals("")){
                a = Double.parseDouble(window.getText());
                window.setText("");
                disableIs();
                isMultiplicationPressed = true;
            }
        });
        buttonDivision.setOnAction(e -> {
            if(!window.getText().equals("")){
                a = Double.parseDouble(window.getText());
                window.setText("");
                disableIs();
                isDivisionPressed = true;
            }
        });

        buttonEquals.setOnAction(e -> {
            b = Double.parseDouble(window.getText());
            double result;
            if(isAdditionPressed){
                result = a + b;
                window.setText(String.valueOf(result));
            }

            if(isSubtractionPressed){
                result = a - b;
                window.setText(String.valueOf(result));
            }

            if(isMultiplicationPressed){
                result = a * b;
                window.setText(String.valueOf(result));
            }

            if(isDivisionPressed){
                result = a / b;
                window.setText(String.valueOf(result));
            }
        });
    }
    public double a;
    public double b;
    public boolean isAdditionPressed;
    public boolean isSubtractionPressed;
    public boolean isMultiplicationPressed;
    public boolean isDivisionPressed;

    public void disableIs(){
        isAdditionPressed = false;
        isSubtractionPressed = false;
        isMultiplicationPressed = false;
        isDivisionPressed = false;
    }
}
