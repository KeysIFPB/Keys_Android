package ifpb.edu.br.keys_app.activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import ifpb.edu.br.keys_app.R;

public class LoginActivity extends AppCompatActivity {
    EditText matricula, senha;
    Button login;
    ProgressDialog progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        matricula = (EditText) findViewById(R.id.et_matricula);
        senha = (EditText) findViewById(R.id.et_senha);
        login = (Button) findViewById(R.id.bt_login);

        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                progress = new ProgressDialog(LoginActivity.this);
                progress.setTitle("enviando...");
                progress.show();

                if(matricula.getText().length() == 0){
                    matricula.setError("Campo vazio");
                }else if (matricula.getText().length() < 11){
                    matricula.setError("Minimo 11 letras");
                }

                if (senha.getText().length() == 0){
                    senha.setError("Campo vazio");
                }else if (senha.getText().length() < 3){
                    senha.setError("Minímo 3 caracteres");
                }

                progress.dismiss();

                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                finish();



                // aqui acho que fica a parte de verificar se ta cadastrado
            }

        });
    }


}
