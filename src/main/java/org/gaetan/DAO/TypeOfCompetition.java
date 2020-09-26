package org.gaetan.DAO;

public class TypeOfCompetition {
    int id;
    String TypeOfCompetiton;

    public TypeOfCompetition(int id, String typeOfCompetiton) {
        this.id = id;
        TypeOfCompetiton = typeOfCompetiton;
    }

    public TypeOfCompetition(String text) {
        TypeOfCompetiton=text;
    }

    public TypeOfCompetition(int idTypeOfCompetition) {
        this.id=idTypeOfCompetition;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeOfCompetiton() {
        return TypeOfCompetiton;
    }

    public void setTypeOfCompetiton(String typeOfCompetiton) {
        TypeOfCompetiton = typeOfCompetiton;
    }
}
