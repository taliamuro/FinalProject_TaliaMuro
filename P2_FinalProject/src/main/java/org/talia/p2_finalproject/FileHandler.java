package org.talia.p2_finalproject;

import javafx.collections.ObservableList;

import java.io.IOException;

public interface FileHandler {
    void saveToFile(String fileName, ObservableList<Student> students);
    void loadFromFile(String fileName, ObservableList<Student> tempStudents) throws IOException;
}
