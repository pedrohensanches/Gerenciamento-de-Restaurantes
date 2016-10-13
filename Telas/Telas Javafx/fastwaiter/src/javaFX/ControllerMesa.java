package javaFX;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class ControllerMesa implements Initializable {

	//private dint nMesas = 1;
	
	private void labels_Colorir(Label lb){
		if (rd_Mesa.isSelected()){
		lb.setStyle("-fx-background-color: GREEN; -fx-border-color: #555555; -fx-border-width: 1;");
		//lb.setText("  " + nMesas);
		//nMesas++;
		}else if (rd_Cenario.isSelected()){
			lb.setStyle("-fx-background-color: #333333; -fx-border-color: #555555; -fx-border-width: 1;");
		}else if (rd_Cancelar.isSelected()){
			lb.setStyle("-fx-background-color: white; -fx-border-color: #555555; -fx-border-width: 1;");	
		}
	}
	
	@FXML
	private void lb_Campo_Selected(MouseEvent event) throws IOException {
		Label lb = (Label)event.getSource();
		labels_Colorir(lb);
	//Label t = event.	
	}
	@FXML
	private void bt_Alterar_Selected(ActionEvent event) throws IOException {

		lb_Titulo.setText("Mesas - Alterar");
		visibilidadeAlterar(true);
		bt_inferior_esq.setText("Salvar");		
		botaoSelecionado(bt_Alterar);
		botaoNaoSelecionado(bt_Ambiente);
		
	}

	@FXML
	private void bt_Ambiente_Selected(ActionEvent event) throws IOException {

		lb_Titulo.setText("Mesas - Ambiente");
		visibilidadeAlterar(false);
		bt_inferior_esq.setText("Historico");		
		botaoSelecionado(bt_Ambiente);
		botaoNaoSelecionado(bt_Alterar);
		rd_Cancelar.setSelected(false);
		rd_Cenario.setSelected(false);
		rd_Mesa.setSelected(false);
		
	}
	
	private void visibilidadeAlterar(boolean value){
		rd_Mesa.setVisible(value);
		rd_Cenario.setVisible(value);
		rd_Cancelar.setVisible(value);
		cp_Em_Uso.setVisible(value);
		cp_Livre.setVisible(value);
		pn_Info_Mesa.setVisible(!value);
	}
	
	private void botaoSelecionado(Button b) {
		b.setStyle(
				"-fx-background-color: linear-gradient(#E5D120,#EEDC42); -fx-border-color: linear-gradient(#E5D120,#EEDC42); -fx-text-fill: white; -fx-effect:  dropshadow(two-pass-box , darkgray, 10, 0.0 , 4, 5);");
	}

	private void botaoNaoSelecionado(Button b) {
		b.setStyle(
				"-fx-background-color: #F9F9F9; -fx-border-color: #F9F9F9; -fx-text-fill: #444444 ; -fx-effect:  dropshadow(two-pass-box , darkgray, 10, 0.0 , 4, 5);");
	}

	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		// initialize Pane
		assert rd_Mesa != null : "fx:id=\"rd_Mesa\" was not injected: check your FXML file 'Mesa.fxml'.";
		assert rd_Cenario != null : "fx:id=\"rd_Mesa\" was not injected: check your FXML file 'Mesa.fxml'.";
		assert rd_Cancelar != null : "fx:id=\"rd_Cancelar\" was not injected: check your FXML file 'Mesa.fxml'.";
		assert cp_Em_Uso != null : "fx:id=\"cp_Em_Uso\" was not injected: check your FXML file 'Mesa.fxml'.";
		
		lb_Titulo.setText("Mesas - Ambiente");
		visibilidadeAlterar(false);
		bt_inferior_esq.setText("Historico");		
		botaoSelecionado(bt_Ambiente);
		botaoNaoSelecionado(bt_Alterar);
		rd_Cancelar.setSelected(false);
		rd_Cenario.setSelected(false);
		rd_Mesa.setSelected(false);
		
	}
	
	@FXML
	private ColorPicker cp_Em_Uso;
	
	@FXML
	private ColorPicker cp_Livre;
	
	@FXML
	private Pane pn_Info_Mesa;
	
	@FXML
    private Label lb22;

    @FXML
    private Label lb23;

    @FXML
    private Label lb20;

    @FXML
    private Label lb21;

    @FXML
    private Label lb26;

    @FXML
    private Label lb27;

    @FXML
    private Label lb24;

    @FXML
    private Label lb25;

    @FXML
    private Label lb28;

    @FXML
    private Label lb29;

    @FXML
    private Label lb_Titulo;

    @FXML
    private Pane pn_Detalhe_inf;

    @FXML
    private Label lb11;

    @FXML
    private Label lb12;

    @FXML
    private Label lb10;

    @FXML
    private Label lb15;

    @FXML
    private Label lb16;

    @FXML
    private Label lb13;

    @FXML
    private Label lb14;

    @FXML
    private Label lb19;

    @FXML
    private Label lb17;

    @FXML
    private Label lb18;

    @FXML
    private Label lb40;

    @FXML
    private Label lb41;

    @FXML
    private Label lb44;

    @FXML
    private Label lb45;

    @FXML
    private Label lb42;

    @FXML
    private Label lb43;

    @FXML
    private Label lb48;

    @FXML
    private Label lb49;

    @FXML
    private Label lb46;

    @FXML
    private Label lb47;

    @FXML
    private Button bt_Ambiente;

    @FXML
    private Label lb30;

    @FXML
    private Label lb33;

    @FXML
    private Label lb34;

    @FXML
    private Label lb31;

    @FXML
    private Label lb32;

    @FXML
    private Label lb37;

    @FXML
    private Label lb38;

    @FXML
    private Label lb35;

    @FXML
    private Label lb36;

    @FXML
    private Label lb39;

    @FXML
    private Label lb;

    @FXML
    private RadioButton rd_Mesa;

    @FXML
    private Label lb1;

    @FXML
    private Label lb3;

    @FXML
    private Label lb2;

    @FXML
    private Label lb5;

    @FXML
    private Label lb4;

    @FXML
    private Label lb7;

    @FXML
    private Label lb62;

    @FXML
    private Label lb6;

    @FXML
    private Label lb63;

    @FXML
    private Label lb9;

    @FXML
    private Label lb60;

    @FXML
    private Label lb8;

    @FXML
    private Label lb61;

    @FXML
    private Label lb66;

    @FXML
    private Label lb67;

    @FXML
    private Label lb64;

    @FXML
    private Label lb65;

    @FXML
    private Button bt_inferior_dir;

    @FXML
    private Label lb68;

    @FXML
    private Label lb69;

    @FXML
    private Button bt_inferior_esq;

    @FXML
    private Label lb51;

    @FXML
    private Label lb52;

    @FXML
    private Label lb50;

    @FXML
    private Label lb55;

    @FXML
    private Label lb56;

    @FXML
    private Label lb53;

    @FXML
    private Label lb54;

    @FXML
    private Label lb59;

    @FXML
    private Label lb57;

    @FXML
    private Label lb58;

    @FXML
    private Button bt_Alterar;

    @FXML
    private Label lb84;

    @FXML
    private Label lb85;

    @FXML
    private Label lb82;

    @FXML
    private ToggleGroup MEsa;

    @FXML
    private Label lb83;

    @FXML
    private Label lb88;

    @FXML
    private Label lb89;

    @FXML
    private Label lb86;

    @FXML
    private Label lb87;

    @FXML
    private RadioButton rd_Cancelar;

    @FXML
    private Label lb80;

    @FXML
    private Label lb81;

    @FXML
    private Label lb73;

    @FXML
    private RadioButton rd_Cenario;

    @FXML
    private Label lb74;

    @FXML
    private Label lb71;

    @FXML
    private Label lb72;

    @FXML
    private Label lb77;

    @FXML
    private Label lb78;

    @FXML
    private Label lb75;

    @FXML
    private Label lb76;

    @FXML
    private Label lb79;

    @FXML
    private Button bt_Ajuda;

    @FXML
    private Pane pn_Clientes;

    @FXML
    private Label lb70;

	

}
