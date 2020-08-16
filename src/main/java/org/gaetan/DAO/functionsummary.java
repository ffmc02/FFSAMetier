package org.gaetan.DAO;

public class functionsummary {
    private int id;
    private String LicenceNumber;
    private int id_0108asap_member;
   private int id_0108asap_function;
   private int LicencePrimary;

    public functionsummary(int id, String licenceNumber, int id_0108asap_member, int id_0108asap_function, int licencePrimary) {
        this.id = id;
        LicenceNumber = licenceNumber;
        this.id_0108asap_member = id_0108asap_member;
        this.id_0108asap_function = id_0108asap_function;
        LicencePrimary = licencePrimary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLicenceNumber() {
        return LicenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        LicenceNumber = licenceNumber;
    }

    public int getId_0108asap_member() {
        return id_0108asap_member;
    }

    public void setId_0108asap_member(int id_0108asap_member) {
        this.id_0108asap_member = id_0108asap_member;
    }

    public int getId_0108asap_function() {
        return id_0108asap_function;
    }

    public void setId_0108asap_function(int id_0108asap_function) {
        this.id_0108asap_function = id_0108asap_function;
    }

    public int getLicencePrimary() {
        return LicencePrimary;
    }

    public void setLicencePrimary(int licencePrimary) {
        LicencePrimary = licencePrimary;
    }
}
