module sio.pokebattle {
    requires javafx.controls;
    requires javafx.fxml;


    opens sio.pokebattle to javafx.fxml;
    exports sio.pokebattle;
}