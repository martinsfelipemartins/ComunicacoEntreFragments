package br.com.digitalhouse.comunicacoentrefragments;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import br.com.digitalhouse.comunicacoentrefragments.fragments.FirstFragment;
import br.com.digitalhouse.comunicacoentrefragments.fragments.SecondFragment;
import br.com.digitalhouse.comunicacoentrefragments.interfaces.Comunicador;
import br.com.digitalhouse.comunicacoentrefragments.model.Person;

public class MainActivity extends AppCompatActivity implements Comunicador {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//Segundo
        Fragment fragment = new FirstFragment();

        replaceFragment(R.id.container2, fragment);
        //"container2, substitua por fragment"
    }

    //primeiro
    public void replaceFragment(int container, Fragment fragment) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(container, fragment);
        transaction.commit();
    }

    @Override
    public void receberMensagem(Person person) {
        Bundle bundle= new Bundle();
        bundle.putParcelable("PERSON", person);
        Fragment secondFragment= new SecondFragment();
       replaceFragment(R.id.container1,secondFragment);
    }
}
