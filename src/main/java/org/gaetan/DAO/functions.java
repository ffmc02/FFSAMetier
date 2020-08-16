package org.gaetan.DAO;

public class functions {
    private int id;
    private String TypeOfLicence;

    public functions(int id, String typeOfLicence) {
        this.id = id;
        TypeOfLicence = typeOfLicence;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeOfLicence() {
        return TypeOfLicence;
    }

    public void setTypeOfLicence(String typeOfLicence) {
        TypeOfLicence = typeOfLicence;
    }
}

