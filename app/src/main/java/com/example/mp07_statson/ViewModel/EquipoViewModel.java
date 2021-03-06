package com.example.mp07_statson.ViewModel;

import android.app.Application;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.mp07_statson.Model.Equipo;
import com.example.mp07_statson.Model.EquipoRepositorio;
import com.example.mp07_statson.Model.Jugador;

import java.util.List;

public class EquipoViewModel extends AndroidViewModel {
    private final EquipoRepositorio equiposRepositorio;

    public EquipoViewModel(@NonNull Application application) {
        super(application);

        equiposRepositorio = new EquipoRepositorio(application);
    }

    //INSERT
    public void insertar(String equipo) {
        equiposRepositorio.insertar(new Equipo(equipo));
    }

    //DELETES
    public void delete(Equipo equipo) {
        equiposRepositorio.delete(equipo);
    }

    //GETTERS
    public String obtener(int m) {
        return equiposRepositorio.obtener(m);
    }
}
