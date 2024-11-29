module org.talia.p2_finalproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.talia.p2_finalproject to javafx.fxml;
    exports org.talia.p2_finalproject;
}