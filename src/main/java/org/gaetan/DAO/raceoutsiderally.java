package org.gaetan.DAO;

import java.util.Date;

public class raceoutsiderally {
    private int id;
    private Date CompetitionStarDay;
    private Date CompetitionEndDay;
    private  Date RequirementDate1;
    private  Date RequirementDate2;
    private  Date RequirementDate3;
    private int IdCompetition;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCompetitionStarDay() {
        return CompetitionStarDay;
    }

    public void setCompetitionStarDay(Date competitionStarDay) {
        CompetitionStarDay = competitionStarDay;
    }

    public Date getCompetitionEndDay() {
        return CompetitionEndDay;
    }

    public void setCompetitionEndDay(Date competitionEndDay) {
        CompetitionEndDay = competitionEndDay;
    }

    public Date getRequirementDate1() {
        return RequirementDate1;
    }

    public void setRequirementDate1(Date requirementDate1) {
        RequirementDate1 = requirementDate1;
    }

    public Date getRequirementDate2() {
        return RequirementDate2;
    }

    public void setRequirementDate2(Date requirementDate2) {
        RequirementDate2 = requirementDate2;
    }

    public Date getRequirementDate3() {
        return RequirementDate3;
    }

    public void setRequirementDate3(Date requirementDate3) {
        RequirementDate3 = requirementDate3;
    }

    public int getIdCompetition() {
        return IdCompetition;
    }

    public void setIdCompetition(int idCompetition) {
        IdCompetition = idCompetition;
    }

    public raceoutsiderally(int id, Date competitionStarDay, Date competitionEndDay, Date requirementDate1, Date requirementDate2, Date requirementDate3, int idCompetition) {
        this.id = id;
        CompetitionStarDay = competitionStarDay;
        CompetitionEndDay = competitionEndDay;
        RequirementDate1 = requirementDate1;
        RequirementDate2 = requirementDate2;
        RequirementDate3 = requirementDate3;
        IdCompetition = idCompetition;
    }
}
