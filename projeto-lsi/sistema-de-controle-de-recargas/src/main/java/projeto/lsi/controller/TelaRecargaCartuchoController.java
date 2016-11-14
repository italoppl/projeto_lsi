package projeto.lsi.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TelaRecargaCartuchoController implements Initializable{

    @FXML
    private Button botaoCancelar;

    @FXML
    private TextField campoData;

    @FXML
    private TextField campoPreco;

    @FXML
    private TextField campoPesoFinal;

    @FXML
    private TextField campoModelo;

    @FXML
    private TextField campoPesoInicial;

    @FXML
    private Button botaoRecarregar;
    
    
    
    public static Stage STAGE_RECARGA_CARTUCHO = new Stage();
    
    
    
    @FXML
	public void recarga(ActionEvent event) {
		Alert dialogoInfo = new Alert(Alert.AlertType.INFORMATION);
        dialogoInfo.setTitle("Mensagem");
        dialogoInfo.setHeaderText("CARTUCHO RECARREGADO");
        dialogoInfo.showAndWait();

	}

    @FXML
	public void cancelar(ActionEvent event){
		STAGE_RECARGA_CARTUCHO.close();
		
	}
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}

}
