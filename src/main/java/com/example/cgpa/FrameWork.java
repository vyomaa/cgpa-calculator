package com.example.cgpa;
import java.lang.Math.*;
import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

import static java.lang.Float.isNaN;

public class FrameWork extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    public float valFind(Object obj){//all possible values: null, S, A B C D E F
        String i = String.valueOf(obj);
        float equi=0;
        if(i.equals("S")){
            equi=10;
        }else if(i.equals("A")){equi=9;}else if(i.equals("B")){equi=8;}else if(i.equals("C")){equi=7;}else if(i.equals("D")){equi=6;}else if(i.equals("E")){equi=5;}else if(i.equals("F")){equi=0;}
        return equi;
    }
    public float crInt(Object obj){
        String i = String.valueOf(obj);
        float gr = 0;
        if(!i.equals("Credits")){
            gr = Float.parseFloat(i);
        }
        return gr;
    }
    public float grInt(String obj){
        float gr = 0;
        if(obj.equals("0"))
            return (float) 16.725843916623;
        else if(!obj.equals("")){
            gr = Float.parseFloat(obj);
        }
        return gr;
    }
    public void start(final Stage myStage){
        myStage.setTitle("CGPA Calculator");
        VBox rootNode = new VBox(10);
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(rootNode, 250, 250);
        myStage.setScene(myScene);
        Label title = new Label("CGPA Calculator");
        Button cgpa = new Button("CGPA");
        Button gpa = new Button("GPA");

        //action events
        gpa.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage gpaWin = new Stage();
                gpaWin.setTitle("GPA Calculator");
                VBox gpaNode = new VBox(10);
                GridPane grid = new GridPane();
                gpaNode.setAlignment(Pos.CENTER);
                grid.setAlignment(Pos.CENTER);
                Scene gpaScene = new Scene(gpaNode, 250, 500);
                gpaWin.setScene(gpaScene);
                Label title = new Label("Calculate GPA");
                Button reset = new Button("Reset");
                ComboBox grade1 = new ComboBox();
                grade1.getItems().addAll("S","A", "B","C","D","E","F");
                grade1.setValue("Grade");
                ComboBox credits1 = new ComboBox();
                credits1.getItems().addAll("1","1.5","2","3","4","5");
                credits1.setValue("Credits");

                ComboBox grade2 = new ComboBox();
                grade2.getItems().addAll("S","A", "B","C","D","E","F");
                grade2.setValue("Grade");
                ComboBox credits2 = new ComboBox();
                credits2.getItems().addAll("1","1.5","2","3","4","5");
                credits2.setValue("Credits");

                ComboBox grade3 = new ComboBox();
                grade3.getItems().addAll("S","A", "B","C","D","E","F");
                grade3.setValue("Grade");
                ComboBox credits3 = new ComboBox();
                credits3.getItems().addAll("1","1.5","2","3","4","5");
                credits3.setValue("Credits");

                ComboBox grade4 = new ComboBox();
                grade4.getItems().addAll("S","A", "B","C","D","E","F");
                grade4.setValue("Grade");
                ComboBox credits4 = new ComboBox();
                credits4.getItems().addAll("1","1.5","2","3","4","5");
                credits4.setValue("Credits");

                ComboBox grade5 = new ComboBox();
                grade5.getItems().addAll("S","A", "B","C","D","E","F");
                grade5.setValue("Grade");
                ComboBox credits5 = new ComboBox();
                credits5.getItems().addAll("1","1.5","2","3","4","5");
                credits5.setValue("Credits");

                ComboBox grade6 = new ComboBox();
                grade6.getItems().addAll("S","A", "B","C","D","E","F");
                grade6.setValue("Grade");
                ComboBox credits6 = new ComboBox();
                credits6.getItems().addAll("1","1.5","2","3","4","5");
                credits6.setValue("Credits");

                ComboBox grade7 = new ComboBox();
                grade7.getItems().addAll("S","A", "B","C","D","E","F");
                grade7.setValue("Grade");
                ComboBox credits7 = new ComboBox();
                credits7.getItems().addAll("1","1.5","2","3","4","5");
                credits7.setValue("Credits");

                ComboBox grade8 = new ComboBox();
                grade8.getItems().addAll("S","A", "B","C","D","E","F");
                grade8.setValue("Grade");
                ComboBox credits8 = new ComboBox();
                credits8.getItems().addAll("1","1.5","2","3","4","5");
                credits8.setValue("Credits");

                ComboBox grade9 = new ComboBox();
                grade9.getItems().addAll("S","A", "B","C","D","E","F");
                grade9.setValue("Grade");
                ComboBox credits9 = new ComboBox();
                credits9.getItems().addAll("1","1.5","2","3","4","5");
                credits9.setValue("Credits");

                ComboBox grade10 = new ComboBox();
                grade10.getItems().addAll("S","A", "B","C","D","E","F");
                grade10.setValue("Grade");
                ComboBox credits10 = new ComboBox();
                credits10.getItems().addAll("1","1.5","2","3","4","5");
                credits10.setValue("Credits");

                Button submit = new Button("Submit");
                Label response = new Label(" ");

                grid.setVgap(10);
                grid.addRow(0,reset,submit);
                grid.addRow(1, grade1,credits1);
                grid.addRow(2, grade2,credits2);
                grid.addRow(3, grade3,credits3);
                grid.addRow(4, grade4,credits4);
                grid.addRow(5, grade5,credits5);
                grid.addRow(6, grade6,credits6);
                grid.addRow(7, grade7,credits7);
                grid.addRow(8, grade8,credits8);
                grid.addRow(9, grade9,credits9);
                grid.addRow(10, grade10,credits10);

                reset.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        response.setText(" ");gpaWin.close();
                    }
                });

                submit.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        float g1=0,g2=0,g3=0,g4=0,g5=0,g6=0,g7=0,g8=0,g9=0,g10=0,c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0,c10=0,gpa=0;
                        g1=valFind(grade1.getValue()); g2=valFind(grade2.getValue()); g3=valFind(grade3.getValue()); g4=valFind(grade4.getValue()); g5=valFind(grade5.getValue()); g6=valFind(grade6.getValue()); g7=valFind(grade7.getValue()); g8=valFind(grade8.getValue()); g9=valFind(grade9.getValue()); g10=valFind(grade10.getValue());
                        c1=crInt(credits1.getValue()); c2=crInt(credits2.getValue()); c3=crInt(credits3.getValue()); c4=crInt(credits4.getValue()); c5=crInt(credits5.getValue()); c6=crInt(credits6.getValue()); c7=crInt(credits7.getValue()); c8=crInt(credits8.getValue()); c9=crInt(credits9.getValue()); c10=crInt(credits10.getValue());
                        gpa=(c1*g1+c2*g2+c3*g3+c4*g4+c5*g5+c6*g6+c7*g7+c8*g8+c9*g9+c10*g10)/(c1+c2+c3+c4+c5+c6+c7+c8+c9+c10);
                        gpa*=100;
                        gpa=Math.round(gpa);
                        gpa/=100;
                        if(isNaN(gpa)){response.setText("GPA Unavailable");}else{response.setText(String.valueOf(gpa));}
                    }
                });
                gpaNode.getChildren().addAll(title,grid,response);
                gpaWin.initOwner(myStage);
                gpaWin.show();
            }
        });
        cgpa.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage cgpaWin = new Stage();
                cgpaWin.setTitle("CGPA Calculator");
                VBox cgpaNode = new VBox(10);
                GridPane grid = new GridPane();
                cgpaNode.setAlignment(Pos.CENTER);
                grid.setAlignment(Pos.CENTER);
                Scene cgpaScene = new Scene(cgpaNode, 250, 500);
                cgpaWin.setScene(cgpaScene);
                Label title = new Label("Calculate CGPA");
                Button reset = new Button("Reset");

                TextField gpa1 = new TextField();
                gpa1.setPromptText("GPA");
                TextField cre1 = new TextField();
                cre1.setPromptText("Credits");

                TextField gpa2 = new TextField();
                gpa2.setPromptText("GPA");
                TextField cre2 = new TextField();
                cre2.setPromptText("Credits");

                TextField gpa3 = new TextField();
                gpa3.setPromptText("GPA");
                TextField cre3 = new TextField();
                cre3.setPromptText("Credits");

                TextField gpa4 = new TextField();
                gpa4.setPromptText("GPA");
                TextField cre4 = new TextField();
                cre4.setPromptText("Credits");

                TextField gpa5 = new TextField();
                gpa5.setPromptText("GPA");
                TextField cre5 = new TextField();
                cre5.setPromptText("Credits");

                TextField gpa6 = new TextField();
                gpa6.setPromptText("GPA");
                TextField cre6 = new TextField();
                cre6.setPromptText("Credits");

                TextField gpa7 = new TextField();
                gpa7.setPromptText("GPA");
                TextField cre7 = new TextField();
                cre7.setPromptText("Credits");

                TextField gpa8 = new TextField();
                gpa8.setPromptText("GPA");
                TextField cre8 = new TextField();
                cre8.setPromptText("Credits");

                Button submit = new Button("Submit");
                Label response = new Label(" ");

                grid.setVgap(10);
                grid.addRow(0,reset,submit);
                grid.addRow(1, gpa1,cre1);
                grid.addRow(2, gpa2,cre2);
                grid.addRow(3, gpa3,cre3);
                grid.addRow(4, gpa4,cre4);
                grid.addRow(5, gpa5,cre5);
                grid.addRow(6, gpa6,cre6);
                grid.addRow(7, gpa7,cre7);
                grid.addRow(8, gpa8,cre8);

                reset.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        gpa1.clear();
                        cre1.clear();
                        gpa2.clear();
                        cre2.clear();
                        gpa3.clear();
                        cre3.clear();
                        gpa4.clear();
                        cre4.clear();
                        gpa5.clear();
                        cre5.clear();
                        gpa6.clear();
                        cre6.clear();
                        gpa7.clear();
                        cre7.clear();
                        gpa8.clear();
                        cre8.clear();
                        response.setText(" ");
                    }
                });

                submit.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        float g1=0,g2=0,g3=0,g4=0,g5=0,g6=0,g7=0,g8=0,c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,cgpa=0;
                        g1=grInt(gpa1.getText()); g2=grInt(gpa2.getText()); g3=grInt(gpa3.getText()); g4=grInt(gpa4.getText()); g5=grInt(gpa5.getText()); g6=grInt(gpa6.getText()); g7=grInt(gpa7.getText()); g8=grInt(gpa8.getText());
                        c1=grInt(cre1.getText()); c2=grInt(cre2.getText()); c3=grInt(cre3.getText()); c4=grInt(cre4.getText()); c5=grInt(cre5.getText()); c6=grInt(cre6.getText()); c7=grInt(cre7.getText()); c8=grInt(cre8.getText());
                        cgpa=(c1*g1+c2*g2+c3*g3+c4*g4+c5*g5+c6*g6+c7*g7+c8*g8)/(c1+c2+c3+c4+c5+c6+c7+c8);
                        cgpa*=100;
                        cgpa=Math.round(cgpa);
                        cgpa/=100;
                        if(isNaN(cgpa)){response.setText("CGPA Unavailable");}else{response.setText(String.valueOf(cgpa));}
                }
                });
                cgpaNode.getChildren().addAll(title,grid,response);
                cgpaWin.initOwner(myStage);
                cgpaWin.show();
            }
        });
        Separator sep = new Separator();
        sep.setPrefWidth(200);
        rootNode.getChildren().addAll(title,cgpa,gpa);
        myStage.show();
    }
}
