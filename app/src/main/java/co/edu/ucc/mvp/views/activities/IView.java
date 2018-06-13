package co.edu.ucc.mvp.views.activities;


/**
 * Created by sebastian on 11/03/18.
 */

public interface IView {

    void MostrarLoading();

    void OcultarLoading();

    void onClickRegistrar();

    void MostrarError(String msg);

    void MostrarUsuario(String usuario);



}

