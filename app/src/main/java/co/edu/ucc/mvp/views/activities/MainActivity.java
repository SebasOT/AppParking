package co.edu.ucc.mvp.views.activities;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import co.edu.ucc.mvp.R;


import butterknife.BindView;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity implements IView{
    @BindView(R.id.txtusuario)
    EditText txtusuario;

    @BindView(R.id.txtcontraseña)
    EditText txtcontraseña;

    @BindView(R.id.btnregistrar)
    Button btnregistrar;


    @Override
    public void MostrarLoading() {
        //progress mostrar
        Log.i("MainActivity", "Mostrando Loading");
    }

    @Override
    public void OcultarLoading() {
        //progress ocultar
        Log.i("MainActivity", "Ocultando Loading");
    }

    @OnClick(R.id.btnregistrar)
    public void onClickRegistrar() {
        Log.i("MainActivity", "Boton Press");
        String usuario = txtusuario.getText().toString();


        String contraseña = txtcontraseña.getText().toString();



    }

    @Override
    public void MostrarError(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void MostrarUsuario(String usuario) {
        Toast.makeText(this, "El usuario que ingreso es : " + usuario, Toast.LENGTH_SHORT).show();
    }



}
