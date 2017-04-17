package apps.tirloni.com.mymaddoapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Cliente objCliente;
    Button btnSalvar;
    Button btnLimpar;
    EditText editNome, editCidade, editUf, editProfissao;
    EditText editEmpresa, editTelefone, editEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objCliente = new Cliente();

        btnSalvar = (Button) findViewById(R.id.btnSalvar);
        btnLimpar = (Button) findViewById(R.id.btnLimpar);

        editNome = (EditText) findViewById(R.id.editNome);
        editCidade = (EditText) findViewById(R.id.editCidade);
        editUf = (EditText) findViewById(R.id.editUf);
        editProfissao = (EditText) findViewById(R.id.editProfissao);
        editEmpresa = (EditText) findViewById(R.id.editEmpresa);
        editTelefone = (EditText) findViewById(R.id.editTelefone);
        editEmail = (EditText) findViewById(R.id.editEmail);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popularCliente();

                String dadosDigitados = "";

                dadosDigitados += "Nome: "+objCliente.getNome()+"\n";
                dadosDigitados += "Cidade: "+objCliente.getCidade()+"\n";
                dadosDigitados += "Uf: "+objCliente.getUf()+"\n";
                dadosDigitados += "Profissao: "+objCliente.getProfissao()+"\n";
                dadosDigitados += "Empresa: "+objCliente.getEmpresa()+"\n";
                dadosDigitados += "Telefone: "+objCliente.getTelefone()+"\n";
                dadosDigitados += "Email: "+objCliente.getEmail()+"\n";

                Toast.makeText(getApplicationContext(),dadosDigitados,Toast.LENGTH_LONG).show();
            }
        });

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Limpar();

                Toast.makeText(getApplicationContext(), "Formulário Limpo!", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void Limpar() {
        objCliente.setNome("");
        objCliente.setCidade("");
        objCliente.setUf("");
        objCliente.setProfissao("");
        objCliente.setEmpresa("");
        objCliente.setTelefone("");
        objCliente.setEmail("");
    }

    private void popularCliente() {
        objCliente.setNome(editNome.getText().toString());
        objCliente.setCidade(editCidade.getText().toString());
        objCliente.setUf(editUf.getText().toString());
        objCliente.setProfissao(editProfissao.getText().toString());
        objCliente.setEmpresa(editEmpresa.getText().toString());
        objCliente.setTelefone(editTelefone.getText().toString());
        objCliente.setEmail(editEmail.getText().toString());
    }
}
