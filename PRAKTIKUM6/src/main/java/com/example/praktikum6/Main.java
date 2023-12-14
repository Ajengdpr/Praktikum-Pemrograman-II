package com.example.praktikum6;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Mahasiswa Table");

        ObservableList<Mahasiswa> mahasiswaList = FXCollections.observableArrayList();
        mahasiswaList.add(new Mahasiswa(1, "John", "22123412"));
        mahasiswaList.add(new Mahasiswa(2, "Jane", "16160196"));
        mahasiswaList.add(new Mahasiswa(3, "Jono", "22124123"));
        mahasiswaList.add(new Mahasiswa(4, "Agus", "13090393"));
        mahasiswaList.add(new Mahasiswa(5, "Taehyung", "13301295"));
        mahasiswaList.add(new Mahasiswa(6, "Jungkook", "13010997"));
        mahasiswaList.add(new Mahasiswa(7, "Jimin", "13131095"));
        mahasiswaList.add(new Mahasiswa(8, "Namjoon", "13120994"));
        mahasiswaList.add(new Mahasiswa(9, "Seokjin", "13031292"));
        mahasiswaList.add(new Mahasiswa(10, "Hoseok", "13180294"));
        TableView<Mahasiswa> tableView = new TableView<>(mahasiswaList);

        TableColumn<Mahasiswa, String> nimCol = new TableColumn<>("NIM");
        nimCol.setCellValueFactory(new PropertyValueFactory<>("nim"));

        TableColumn<Mahasiswa, String> namaCol = new TableColumn<>("Nama");
        namaCol.setCellValueFactory(new PropertyValueFactory<>("nama"));

        tableView.getColumns().addAll(nimCol, namaCol);

        Scene scene = new Scene(tableView, 300, 400);

        primaryStage.setScene(scene);

        primaryStage.show();
    }
}