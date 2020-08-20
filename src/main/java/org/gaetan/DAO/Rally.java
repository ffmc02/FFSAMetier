package org.gaetan.DAO;

import java.util.Date;

public class Rally {
    private int id;
    private int NumberOfSteps;
    private int NumberOfEs;
    private int NumberOfCompetitonDays;
    private Date RecognitionDay;
    private Date RecognitionDay2;
    private Date RecognitionDay3;
    private String AsaOrganizer;
    private Date DatePcNeed1;
    private Date DatePcNeed2;
    private Date DatePcNeed3;
    private Date DateNeedForTheCommissioner1;
    private Date DateNeedForTheCommissioner2;
    private Date DateNeedForTheCommissioner3;
    private int id_0108asap_competiton;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfSteps() {
        return NumberOfSteps;
    }

    public void setNumberOfSteps(int numberOfSteps) {
        NumberOfSteps = numberOfSteps;
    }

    public int getNumberOfEs() {
        return NumberOfEs;
    }

    public void setNumberOfEs(int numberOfEs) {
        NumberOfEs = numberOfEs;
    }

    public int getNumberOfCompetitonDays() {
        return NumberOfCompetitonDays;
    }

    public void setNumberOfCompetitonDays(int numberOfCompetitonDays) {
        NumberOfCompetitonDays = numberOfCompetitonDays;
    }

    public Date getRecognitionDay() {
        return RecognitionDay;
    }

    public void setRecognitionDay(Date recognitionDay) {
        RecognitionDay = recognitionDay;
    }

    public Date getRecognitionDay2() {
        return RecognitionDay2;
    }

    public void setRecognitionDay2(Date recognitionDay2) {
        RecognitionDay2 = recognitionDay2;
    }

    public Date getRecognitionDay3() {
        return RecognitionDay3;
    }

    public void setRecognitionDay3(Date recognitionDay3) {
        RecognitionDay3 = recognitionDay3;
    }

    public String getAsaOrganizer() {
        return AsaOrganizer;
    }

    public void setAsaOrganizer(String asaOrganizer) {
        AsaOrganizer = asaOrganizer;
    }

    public Date getDatePcNeed1() {
        return DatePcNeed1;
    }

    public void setDatePcNeed1(Date datePcNeed1) {
        DatePcNeed1 = datePcNeed1;
    }

    public Date getDatePcNeed2() {
        return DatePcNeed2;
    }

    public void setDatePcNeed2(Date datePcNeed2) {
        DatePcNeed2 = datePcNeed2;
    }

    public Date getDatePcNeed3() {
        return DatePcNeed3;
    }

    public void setDatePcNeed3(Date datePcNeed3) {
        DatePcNeed3 = datePcNeed3;
    }

    public Date getDateNeedForTheCommissioner1() {
        return DateNeedForTheCommissioner1;
    }

    public void setDateNeedForTheCommissioner1(Date dateNeedForTheCommissioner1) {
        DateNeedForTheCommissioner1 = dateNeedForTheCommissioner1;
    }

    public Date getDateNeedForTheCommissioner2() {
        return DateNeedForTheCommissioner2;
    }

    public void setDateNeedForTheCommissioner2(Date dateNeedForTheCommissioner2) {
        DateNeedForTheCommissioner2 = dateNeedForTheCommissioner2;
    }

    public Date getDateNeedForTheCommissioner3() {
        return DateNeedForTheCommissioner3;
    }

    public void setDateNeedForTheCommissioner3(Date dateNeedForTheCommissioner3) {
        DateNeedForTheCommissioner3 = dateNeedForTheCommissioner3;
    }

    public int getId_0108asap_competiton() {
        return id_0108asap_competiton;
    }

    public void setId_0108asap_competiton(int id_0108asap_competiton) {
        this.id_0108asap_competiton = id_0108asap_competiton;
    }

    public Rally(int id, int numberOfSteps, int numberOfEs, int numberOfCompetitonDays, Date recognitionDay, Date recognitionDay2, Date recognitionDay3, String asaOrganizer, Date datePcNeed1, Date datePcNeed2, Date datePcNeed3, Date dateNeedForTheCommissioner1, Date dateNeedForTheCommissioner2, Date dateNeedForTheCommissioner3, int id_0108asap_competiton) {
        this.id = id;
        NumberOfSteps = numberOfSteps;
        NumberOfEs = numberOfEs;
        NumberOfCompetitonDays = numberOfCompetitonDays;
        RecognitionDay = recognitionDay;
        RecognitionDay2 = recognitionDay2;
        RecognitionDay3 = recognitionDay3;
        AsaOrganizer = asaOrganizer;
        DatePcNeed1 = datePcNeed1;
        DatePcNeed2 = datePcNeed2;
        DatePcNeed3 = datePcNeed3;
        DateNeedForTheCommissioner1 = dateNeedForTheCommissioner1;
        DateNeedForTheCommissioner2 = dateNeedForTheCommissioner2;
        DateNeedForTheCommissioner3 = dateNeedForTheCommissioner3;
        this.id_0108asap_competiton = id_0108asap_competiton;
    }
}
