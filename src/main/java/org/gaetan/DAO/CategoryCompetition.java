package org.gaetan.DAO;

public class CategoryCompetition {
    private int id;
    private String CategoryCompetition;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryCompetition() {
        return CategoryCompetition;
    }

    public void setCategoryCompetition(String categoryCompetition) {
        CategoryCompetition = categoryCompetition;
    }

    public CategoryCompetition(int id, String categoryCompetition) {
        this.id = id;
        CategoryCompetition = categoryCompetition;
    }
}
