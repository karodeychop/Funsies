module barnes.jacob.funsies {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;


    opens barnes.jacob.funsies to javafx.fxml;
    exports barnes.jacob.funsies;
}