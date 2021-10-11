package com.company;

public class Directeur {

    private String _id;
    private String _nom;

    public Directeur(String id,String nom)
    {
        _id = id;
        _nom = nom;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_nom() {
        return _nom;
    }

    public void set_nom(String _nom) {
        this._nom = _nom;
    }

    @Override
    public String toString(){
        return "id :\t" + _id + "\tNom :\t" + _nom;
    }
}