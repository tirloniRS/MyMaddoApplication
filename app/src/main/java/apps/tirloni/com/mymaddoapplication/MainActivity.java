package apps.tirloni.com.mymaddoapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import apps.tirloni.com.mymaddoapplication.controller.ClienteController;
import apps.tirloni.com.mymaddoapplication.model.Cliente;

public class MainActivity extends AppCompatActivity {
    Cliente objCliente;
    ClienteController clienteController;
    Button btnSalvar;
    Button btnLimpar;
    EditText editNome, editCidade, editUf, editProfissao;
    EditText editEmpresa, editTelefone, editEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //objeto POJO
        objCliente = new Cliente();

        clienteController = new ClienteController();



        btnSalvar = (Button) findViewById(R.id.btnSalvar);
        btnLimpar = (Button) findViewById(R.id.btnLimpar);

        editNome = (EditText) findViewById(R.id.editNome);
        editCidade = (EditText) findViewById(R.id.editCidade);
        editUf = (EditText) findViewById(R.id.editUf);
        editProfissao = (EditText) findViewById(R.id.editProfissao);
        editEmpresa = (EditText) findViewById(R.id.editEmpresa);
        editTelefone = (EditText) findViewById(R.id.editTelefone);
        editEmail = (EditText) findViewById(R.id.editEmail);

        //Capturando o click do  botão
        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //popular o objeto cliente c\ os dados do formulário
                popularDados();

                //Solicitar a controller que salve os dados do cliente
                clienteController.salvarCliente(objCliente);

                Toast.makeText(getApplicationContext(),clienteController.toString(),Toast.LENGTH_LONG).show();
            }
        });

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pedir p a controller limpar dados do obj cliente
                clienteController.limparCliente();

                //limpar dados do formulário
                limparDados();

                Toast.makeText(getApplicationContext(),"Clicou no Limpar" , Toast.LENGTH_LONG).show();
            }
        });
    }

    private void limparDados() {

        editNome.setText("");
        editCidade.setText("");
        editUf.setText("");
        editProfissao.setText("");
        editEmpresa.setText("");
        editTelefone.setText("");
        editEmail.setText("");

        editNome.requestFocus();
    }

    private void popularDados() {
        objCliente.setNome(editNome.getText().toString());
        objCliente.setCidade(editCidade.getText().toString());
        objCliente.setUf(editUf.getText().toString());
        objCliente.setProfissao(editProfissao.getText().toString());
        objCliente.setEmpresa(editEmpresa.getText().toString());
        objCliente.setTelefone(editTelefone.getText().toString());
        objCliente.setEmail(editEmail.getText().toString());
    }
}
