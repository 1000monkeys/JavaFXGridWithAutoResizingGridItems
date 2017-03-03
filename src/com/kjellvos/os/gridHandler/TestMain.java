package com.kjellvos.os.gridHandler;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.control.*;
import javafx.scene.web.HTMLEditor;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * Created by kjell on 27-2-2017.
 */
public class TestMain extends Application{
    Label label;
    Button button;
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

        GridHandler gridHandler = new GridHandler();

        gridHandler.add(0, 0, label);
        gridHandler.add(0, 1, button);
        gridHandler.add(0, 2, radioButton);
        gridHandler.add(0, 3, toggleButton);
        gridHandler.add(0, 4, checkBox);

        gridHandler.add(1, 0, choiceBox);
        gridHandler.add(1, 1, textField);
        gridHandler.add(1, 2, scrollPane);
        gridHandler.add(1, 3, listView);
        gridHandler.add(1, 4, tableView);

        gridHandler.add(2, 0, treeView);
        gridHandler.add(2, 1, comboBox);
        gridHandler.add(2, 2, separator);
        gridHandler.add(2, 3, slider);
        gridHandler.add(2, 4, progressBar);

        gridHandler.add(3, 0, progressIndicator);
        gridHandler.add(3, 1, hyperlink);
        gridHandler.add(3, 2, htmlEditor);
        gridHandler.add(3, 3, titledPane);
        gridHandler.add(3, 4, passwordField);

        gridHandler.add(4,0, colorPicker);
        gridHandler.add(4,1, pagination);

        primaryStage.setTitle("Item Explorer For Kassa System");
        primaryStage.setMinWidth(800);
        primaryStage.setWidth(800);
        primaryStage.setMinHeight(600);
        primaryStage.setHeight(600);
        primaryStage.setScene(gridHandler.getGridAsScene());
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
