package br.com.mvmtecnologia.evangelizarapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void abrirPessoa(View view) {
		Intent intent = new Intent(this, CadastroActivity.class);
		EditText editNome = (EditText) findViewById(R.id.edit_nome);
		limparCampo(editNome);

		EditText editCelular = (EditText) findViewById(R.id.edit_celular);
		limparCampo(editCelular);

		EditText editEmail = (EditText) findViewById(R.id.edit_email);
		limparCampo(editEmail);

		EditText editCidade = (EditText) findViewById(R.id.edit_cidade);
		limparCampo(editCidade);

		startActivity(intent);
	}

	public void abrirShalom(View view) {
		Intent intent = new Intent(this, ShalomActivity.class);
		startActivity(intent);
	}
	
	public void abrirDicas(View view) {
		Intent intent = new Intent(this, DicasActivity.class);
		startActivity(intent);
	}
	
	private void limparCampo(EditText campo) {
		if (campo != null) {
			campo.setText(null);
		}
	}

}
