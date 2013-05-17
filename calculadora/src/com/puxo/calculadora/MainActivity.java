package com.puxo.calculadora;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

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
	
	
	
	public void Sumar(View v) {
		
		EditText op1;
		EditText op2;
		TextView resultado=(TextView)findViewById(R.id.resul);
		

		op1 = (EditText)findViewById(R.id.editText1);
		op2 = (EditText)findViewById(R.id.editText2);
		 
		try{
			float a=Float.parseFloat(op1.getText().toString());
			float b=Float.parseFloat(op2.getText().toString());
			resultado.setText(":"+(a+b));
		}catch (Exception e){
			resultado.setText("ERROR");

			
		};
		
		
		
	}
	
public void Restar(View v) {
		
		EditText op1;
		EditText op2;
		TextView resultado=(TextView)findViewById(R.id.resul);
		

		op1 = (EditText)findViewById(R.id.editText1);
		op2 = (EditText)findViewById(R.id.editText2);
		 
		try{
			float a=Float.parseFloat(op1.getText().toString());
			float b=Float.parseFloat(op2.getText().toString());
			resultado.setText(":"+(a-b));
		}catch (Exception e){
			resultado.setText("ERROR");

			
		};
		
		
		
	}

public void Multiplicar(View v) {
	
	EditText op1;
	EditText op2;
	TextView resultado=(TextView)findViewById(R.id.resul);
	

	op1 = (EditText)findViewById(R.id.editText1);
	op2 = (EditText)findViewById(R.id.editText2);
	 
	try{
		float a=Float.parseFloat(op1.getText().toString());
		float b=Float.parseFloat(op2.getText().toString());
		resultado.setText(":"+(a*b));
	}catch (Exception e){
		resultado.setText("ERROR");

		
	};
	
	
	
}

public void Dividir(View v) {
	
	EditText op1;
	EditText op2;
	TextView resultado=(TextView)findViewById(R.id.resul);
	

	op1 = (EditText)findViewById(R.id.editText1);
	op2 = (EditText)findViewById(R.id.editText2);
	 
	try{
		float a=Float.parseFloat(op1.getText().toString());
		float b=Float.parseFloat(op2.getText().toString());
		resultado.setText(":"+(a/b));
	}catch (Exception e){
		resultado.setText("ERROR");

		
	};
	
	
	
}



public void Limpiar(View v) {
	
	EditText op1;
	EditText op2;
	TextView resultado=(TextView)findViewById(R.id.resul);
	

	op1 = (EditText)findViewById(R.id.editText1);
	op2 = (EditText)findViewById(R.id.editText2);
	 
		op1.setText("");
		op2.setText("");
		resultado.setText("________________ ");
	
	
	
	
}


}
