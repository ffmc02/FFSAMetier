package org.gaetan.DAO;

import java.util.Date;

public class Competition {
    public static Object getItems;
    private int id;
    private int id_0108asap_categorycompetition;
    private int id_0108asap_sportsevents;
    private int id_0108asap_typeofcompetition;
    private String Open;
    private String Close;
    private String TypeOfCompetiton;
    private int IdRaceType;
    private   int NumberDays;
    private  int IdSportEvents;
    private   String Observation;
    private  String NameOfTheTest;
    private int Idraceoutsiderally ;
    private Date Start ;
    private  Date End;
    private  Date Day1;
    private Date Day2;
    private Date Day3;
    private int IdCompetition;
    private  Date DateDebut ;
    private String CategoryCompetition;
    private  String Location_Circuit;
//constructeur de la classe compétition

    public Competition(int id, int id_0108asap_categorycompetition, int id_0108asap_sportsevents, int id_0108asap_typeofcompetition, String open, String close, String typeOfCompetiton, int idRaceType, int numberDays, int idSportEvents, String observation, String nameOfTheTest, int idraceoutsiderally, Date start, Date end, Date day1, Date day2, Date day3, int idCompetition, Date dateDebut, String categoryCompetition) {
        this.id = id;
        this.id_0108asap_categorycompetition = id_0108asap_categorycompetition;
        this.id_0108asap_sportsevents = id_0108asap_sportsevents;
        this.id_0108asap_typeofcompetition = id_0108asap_typeofcompetition;
     Close=close;
      Open=open;
        TypeOfCompetiton = typeOfCompetiton;
        IdRaceType = idRaceType;
        NumberDays = numberDays;
        IdSportEvents = idSportEvents;
        Observation = observation;
        NameOfTheTest = nameOfTheTest;
        Idraceoutsiderally = idraceoutsiderally;
        End = end;
        Day1 = day1;
        Day2 = day2;
        Day3 = day3;
        IdCompetition = idCompetition;
        DateDebut = dateDebut;
        CategoryCompetition = categoryCompetition;

    }

    public Competition(int id, int id_0108asap_sportsevents, String typeOfCompetiton, int idRaceType, Integer idTypeCompetition, String open, int numberDays, int idSportEvents, String observation, String observation1, String close, String nameOfTheTest, int idraceoutsiderally, java.sql.Date start, java.sql.Date end, java.sql.Date day1, java.sql.Date day2, java.sql.Date day3, int idCompetition, java.sql.Date dateDebut, String categoryCompetition) {
    }


    public Competition(int id, String nameOfTheTest, String categoryCompetition, String location_circuit, java.sql.Date dateDebut) {
        this.id=id;
        NameOfTheTest = nameOfTheTest;
        CategoryCompetition = categoryCompetition;
        Location_Circuit = location_circuit;
        DateDebut= dateDebut;
    }

    public Competition(String open, String close, int idSelectifCompet) {
    }


    //Essai de methode
    @Override
    public String toString() {
        return "Competition{" +
                     "id=" + id +
                  ", id_0108asap_categorycompetition=" + id_0108asap_categorycompetition +
                    ", id_0108asap_sportsevents=" + id_0108asap_sportsevents +
                ", id_0108asap_typeofcompetition=" + id_0108asap_typeofcompetition +
                ", Open='" + Open + '\'' +
                ", Close='" + Close + '\'' +
                ", TypeOfCompetiton='" + TypeOfCompetiton + '\'' +
                ", IdRaceType=" + IdRaceType +
                ", NumberDays=" + NumberDays +
                ", IdSportEvents=" + IdSportEvents +
                ", Observation='" + Observation + '\'' +
                ", NameOfTheTest='" + NameOfTheTest + '\'' +
                ", Idraceoutsiderally=" + Idraceoutsiderally +
                ", Start=" + Start +
                ", End=" + End +
                ", Day1=" + Day1 +
                ", Day2=" + Day2 +
                ", Day3=" + Day3 +
                ", IdCompetition=" + IdCompetition +
                ", DateDebut=" + DateDebut +
                ", CategoryCompetition='" + CategoryCompetition + '\'' +
                ", Location_Circuit='" + Location_Circuit + '\'' +
                '}';
    }


//get et set de la fonction ListCompetitionOustidRally
    public String getLocation_Circuit() {
        return Location_Circuit;
    }

    public void setLocation_Circuit(String location_Circuit) {
        Location_Circuit = location_Circuit;
    }

    public Competition(int id, String typeOfCompetiton, int idRaceType, int idTypeCompetition, String open, int numberDays, int idSportEvents, String observation, String close, String nameOfTheTest, int idraceoutsiderally, Date start, Date end, Date day1, Date day2, Date day3, int idCompetition, Date dateDebut, String categoryCompetition) {
    }

    public Competition() {
    }

//    public Competition(int id, String ofTheTest, String nameOfTheTest, String typeOfCompetiton, java.sql.Date dateDebut) {
//    }


    public static Object getGetItems() {
        return getItems;
    }

    public static void setGetItems(Object getItems) {
        Competition.getItems = getItems;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_0108asap_categorycompetition() {
        return id_0108asap_categorycompetition;
    }

    public void setId_0108asap_categorycompetition(int id_0108asap_categorycompetition) {
        this.id_0108asap_categorycompetition = id_0108asap_categorycompetition;
    }

    public int getId_0108asap_sportsevents() {
        return id_0108asap_sportsevents;
    }

    public void setId_0108asap_sportsevents(int id_0108asap_sportsevents) {
        this.id_0108asap_sportsevents = id_0108asap_sportsevents;
    }

    public int getId_0108asap_typeofcompetition() {
        return id_0108asap_typeofcompetition;
    }

    public void setId_0108asap_typeofcompetition(int id_0108asap_typeofcompetition) {
        this.id_0108asap_typeofcompetition = id_0108asap_typeofcompetition;
    }

    public String getOpen() {
        return Open;
    }

    public void setOpen(String open) {
        Open = open;
    }

    public String getClose() {
        return Close;
    }

    public void setClose(String close) {
        Close = close;
    }

    public String getTypeOfCompetiton() {
        return TypeOfCompetiton;
    }

    public void setTypeOfCompetiton(String typeOfCompetiton) {
        TypeOfCompetiton = typeOfCompetiton;
    }

    public int getIdRaceType() {
        return IdRaceType;
    }

    public void setIdRaceType(int idRaceType) {
        IdRaceType = idRaceType;
    }

    public int getNumberDays() {
        return NumberDays;
    }

    public void setNumberDays(int numberDays) {
        NumberDays = numberDays;
    }

    public int getIdSportEvents() {
        return IdSportEvents;
    }

    public void setIdSportEvents(int idSportEvents) {
        IdSportEvents = idSportEvents;
    }

    public String getObservation() {
        return Observation;
    }

    public void setObservation(String observation) {
        Observation = observation;
    }

    public String getNameOfTheTest() {
        return NameOfTheTest;
    }

    public void setNameOfTheTest(String nameOfTheTest) {
        NameOfTheTest = nameOfTheTest;
    }

    public int getIdraceoutsiderally() {
        return Idraceoutsiderally;
    }

    public void setIdraceoutsiderally(int idraceoutsiderally) {
        Idraceoutsiderally = idraceoutsiderally;
    }

    public Date getStart() {
        return Start;
    }

    public void setStart(Date start) {
        Start = start;
    }

    public Date getEnd() {
        return End;
    }

    public void setEnd(Date end) {
        End = end;
    }

    public Date getDay1() {
        return Day1;
    }

    public void setDay1(Date day1) {
        Day1 = day1;
    }

    public Date getDay2() {
        return Day2;
    }

    public void setDay2(Date day2) {
        Day2 = day2;
    }

    public Date getDay3() {
        return Day3;
    }

    public void setDay3(Date day3) {
        Day3 = day3;
    }

    public int getIdCompetition() {
        return IdCompetition;
    }

    public void setIdCompetition(int idCompetition) {
        IdCompetition = idCompetition;
    }

    public Date getDateDebut() {
        return DateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        DateDebut = dateDebut;
    }

    public String getCategoryCompetition() {
        return CategoryCompetition;
    }

    public void setCategoryCompetition(String categoryCompetition) {
        CategoryCompetition = categoryCompetition;
    }


}
