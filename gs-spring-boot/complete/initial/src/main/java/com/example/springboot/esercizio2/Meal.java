package com.example.springboot.esercizio2;

public class Meal {
    private String nome;
    private String descrizione;

    private Double prezzo;

    public Meal(String nome,String descrizione, Double prezzo) {
        this.nome = nome;
        this.descrizione=descrizione;
        this.prezzo = prezzo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }
}
