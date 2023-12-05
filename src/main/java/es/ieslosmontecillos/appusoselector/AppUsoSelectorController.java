package es.ieslosmontecillos.appusoselector;

import es.ieslosmontecillos.componentes_galvezdiego.SelectorDeslizamiento;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class AppUsoSelectorController implements Initializable {

    @FXML
    private SelectorDeslizamiento selectorArriba;
    @FXML
    private Label lblTitulo;
    @FXML
    private SelectorDeslizamiento selectorAbajo;
    @FXML
    private Label lblResultado;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    public void pulsadoArriba(ActionEvent actionEvent) {
        lblResultado.setText("Se ha pulsado el selector de arriba.");
    }

    @FXML
    public void pulsadoAbajo(ActionEvent actionEvent) {
        lblResultado.setText("Se ha pulsado el selector de abajo.");
    }
}