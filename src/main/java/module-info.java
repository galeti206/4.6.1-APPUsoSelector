module es.ieslosmontecillos.appusoselector {
    requires javafx.controls;
    requires javafx.fxml;
    requires es.ieslosmontecillos.componentes_galvezdiego;

    opens es.ieslosmontecillos.appusoselector to javafx.fxml;
    exports es.ieslosmontecillos.appusoselector;
}