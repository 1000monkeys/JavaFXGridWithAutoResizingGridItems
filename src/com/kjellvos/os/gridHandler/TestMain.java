package com.kjellvos.os.gridHandler;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.control.*;
import javafx.scene.web.HTMLEditor;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * Created by kjell on 27-2-2017.
 * TODO implement mininum size? Maybe
 */
public class TestMain extends Application{
    Label label;
    Button button, button2, button3;
    RadioButton radioButton;
    ToggleButton toggleButton;
    CheckBox checkBox;
    ChoiceBox choiceBox;
    TextField textField;
    ScrollPane scrollPane;
    ListView listView;
    TableView tableView;
    TreeView treeView;
    ComboBox comboBox;
    Separator separator;
    Slider slider;
    ProgressBar progressBar;
    ProgressIndicator progressIndicator;
    Hyperlink hyperlink;
    HTMLEditor htmlEditor;
    TitledPane titledPane;
    PasswordField passwordField;
    ColorPicker colorPicker;
    Pagination pagination;

    @Override
    public void start(Stage primaryStage) throws Exception {
        label = new Label("test1");
        button = new Button("test2");
        button2 = new Button("test21");
        button3 = new Button("test22");
        radioButton = new RadioButton("test3");
        toggleButton = new RadioButton("test4");
        checkBox = new CheckBox("test5");

        choiceBox = new ChoiceBox(FXCollections.observableArrayList("test6", "test7", "test8"));
        textField = new TextField("test9");
        scrollPane = new ScrollPane();      //todo
        listView = new ListView();          //todo
        tableView = new TableView();        //todo

        treeView = new TreeView();          //todo
        comboBox = new ComboBox();          //todo
        separator = new Separator();        //todo
        slider = new Slider();              //todo
        progressBar = new ProgressBar();    //todo

        progressIndicator = new ProgressIndicator();
        hyperlink = new Hyperlink("www.testing.nl");        //todo
        htmlEditor = new HTMLEditor();      //todo
        titledPane = new TitledPane();      //todo
        passwordField = new PasswordField();    //todo

        colorPicker = new ColorPicker();    //todo
        pagination = new Pagination();      //todo

        GridHandler gridHandler = new GridHandler(800D, 600D);

        gridHandler.add(0, 0, label, false);
        gridHandler.add(0, 1, button, false);
        gridHandler.add(0, 2, radioButton, false);
        gridHandler.add(0, 3, toggleButton, false);
        gridHandler.add(0, 4, checkBox, false);

        gridHandler.add(1, 0, choiceBox, false);
        gridHandler.add(1, 1, textField, false);
        gridHandler.add(1, 2, scrollPane, false);
        gridHandler.add(1, 3, listView, false);
        gridHandler.add(1, 4, tableView, false);

        gridHandler.add(2, 0, treeView, false);
        gridHandler.add(2, 1, comboBox, false);
        gridHandler.add(2, 2, separator, false);
        gridHandler.add(2, 3, slider, false);
        gridHandler.add(2, 4, progressBar, false);

        gridHandler.add(3, 0, progressIndicator, false);
        gridHandler.add(3, 1, hyperlink, false);
        gridHandler.add(3, 2, htmlEditor, false);
        gridHandler.add(3, 3, titledPane, false);
        gridHandler.add(3, 4, passwordField, false);

        gridHandler.add(4,0, colorPicker, false);
        gridHandler.add(4,1, pagination, false);

        gridHandler.add(0, 0, button2, false);
        gridHandler.add(2, 3, button3, true);

        primaryStage.setTitle("Item Explorer For Kassa System");
        primaryStage.setWidth(800);
        primaryStage.setHeight(600);
        primaryStage.setScene(gridHandler.getGridAsScene());
        primaryStage.sizeToScene();
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
