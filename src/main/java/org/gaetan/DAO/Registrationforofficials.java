package org.gaetan.DAO;

public class Registrationforofficials {
    private int IdRegistrationforofficials;
    private String ResponseDatePcNeed1;
    private String ResponseDatePcNeed2;
    private String ResponseDatePcNeed3;
    private String AvaibleDateNeedForTheCommissioner1;
    private String AvaibleDateNeedForTheCommissioner2;
    private String AvaibleDateNeedForTheCommissioner3;
    private String Accommodation;
    private String TypeOfLicence;
    private String NameOfTheTest;
    private String Name;
    private String Firstname;
    private int IdCompetition;

    public Registrationforofficials(int idRegistrationforofficials, String responseDatePcNeed1, String responseDatePcNeed2, String responseDatePcNeed3, String avaibleDateNeedForTheCommissioner1, String avaibleDateNeedForTheCommissioner2, String avaibleDateNeedForTheCommissioner3, String accommodation, String typeOfLicence, String nameOfTheTest, String name, String firstname) {
   this.IdRegistrationforofficials=idRegistrationforofficials;
        ResponseDatePcNeed1=responseDatePcNeed1;
        ResponseDatePcNeed2=responseDatePcNeed2;
        ResponseDatePcNeed3=responseDatePcNeed3;
        AvaibleDateNeedForTheCommissioner1=avaibleDateNeedForTheCommissioner1;
        AvaibleDateNeedForTheCommissioner2=avaibleDateNeedForTheCommissioner2;
        AvaibleDateNeedForTheCommissioner3=avaibleDateNeedForTheCommissioner3;
        Accommodation=accommodation;
        TypeOfLicence=typeOfLicence;
        NameOfTheTest=nameOfTheTest;
        Name=name;
        Firstname=firstname;
    }

    public Registrationforofficials() {

    }


    public int getIdCompetition() {
        return IdCompetition;
    }

    public void setIdCompetition(int idCompetition) {
        IdCompetition = idCompetition;
    }



    @Override
    public String toString() {
        return "registrationforofficials{" +
                "IdRegistrationforofficials=" + this.getIdRegistrationforofficials() +
                ", ResponseDatePcNeed1='" + this.getResponseDatePcNeed1() + '\'' +
                ", ResponseDatePcNeed2='" + this.getResponseDatePcNeed2() + '\'' +
                ", ResponseDatePcNeed3='" + this.getResponseDatePcNeed3() + '\'' +
                ", AvaibleDateNeedForTheCommissioner1='" + this.getAvaibleDateNeedForTheCommissioner1() + '\'' +
                ", AvaibleDateNeedForTheCommissioner2='" + this.getAvaibleDateNeedForTheCommissioner2() + '\'' +
                ", AvaibleDateNeedForTheCommissioner3='" + this.getAvaibleDateNeedForTheCommissioner3() + '\'' +
                ", Accommodation='" + this.getAccommodation() + '\'' +
                ", TypeOfLicence='" + this.getTypeOfLicence() + '\'' +
                ", NameOfTheTest='" + this.getNameOfTheTest() + '\'' +
                ", Name='" + this.getName() + '\'' +
                ", Firstname='" + this.getName() + '\'' +
                ", IdCompetition=" + this.getIdCompetition() +
                '}';
    }

    public int getIdRegistrationforofficials() {
        return IdRegistrationforofficials;
    }

    public void setIdRegistrationforofficials(int idRegistrationforofficials) {
        IdRegistrationforofficials = idRegistrationforofficials;
    }

    public String getResponseDatePcNeed1() {
        return ResponseDatePcNeed1;
    }

    public void setResponseDatePcNeed1(String responseDatePcNeed1) {
        ResponseDatePcNeed1 = responseDatePcNeed1;
    }

    public String getResponseDatePcNeed2() {
        return ResponseDatePcNeed2;
    }

    public void setResponseDatePcNeed2(String responseDatePcNeed2) {
        ResponseDatePcNeed2 = responseDatePcNeed2;
    }

    public String getResponseDatePcNeed3() {
        return ResponseDatePcNeed3;
    }

    public void setResponseDatePcNeed3(String responseDatePcNeed3) {
        ResponseDatePcNeed3 = responseDatePcNeed3;
    }

    public String getAvaibleDateNeedForTheCommissioner1() {
        return AvaibleDateNeedForTheCommissioner1;
    }

    public void setAvaibleDateNeedForTheCommissioner1(String avaibleDateNeedForTheCommissioner1) {
        AvaibleDateNeedForTheCommissioner1 = avaibleDateNeedForTheCommissioner1;
    }

    public String getAvaibleDateNeedForTheCommissioner2() {
        return AvaibleDateNeedForTheCommissioner2;
    }

    public void setAvaibleDateNeedForTheCommissioner2(String avaibleDateNeedForTheCommissioner2) {
        AvaibleDateNeedForTheCommissioner2 = avaibleDateNeedForTheCommissioner2;
    }

    public String getAvaibleDateNeedForTheCommissioner3() {
        return AvaibleDateNeedForTheCommissioner3;
    }

    public void setAvaibleDateNeedForTheCommissioner3(String avaibleDateNeedForTheCommissioner3) {
        AvaibleDateNeedForTheCommissioner3 = avaibleDateNeedForTheCommissioner3;
    }

    public String getAccommodation() {
        return Accommodation;
    }

    public void setAccommodation(String accommodation) {
        Accommodation = accommodation;
    }

    public String getTypeOfLicence() {
        return TypeOfLicence;
    }

    public void setTypeOfLicence(String typeOfLicence) {
        TypeOfLicence = typeOfLicence;
    }

    public String getNameOfTheTest() {
        return NameOfTheTest;
    }

    public void setNameOfTheTest(String nameOfTheTest) {
        NameOfTheTest = nameOfTheTest;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }
}
