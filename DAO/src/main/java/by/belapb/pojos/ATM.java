package by.belapb.pojos;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Sukora Stas.
 */

@Entity
@Table
public class ATM implements Serializable {
    private static final long serialVersionUID = 3L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "БИК")
    private Integer BIK;
    @Column(name = "наименование_подразделения")
    private String Names_of_divisions;
    @Column(name = "регион")
    private String Region;
    @Column(name = "населённый_пункт")
    private String Locality;
    @Column(name = "адрес_установки")
    private String Addres;
    @Column(name = "место_установки")
    private String Position;
    @Column(name = "время_работы")
    private String WorkingTime;
    @Column(name = "выдача_валюты")
    private Boolean Issuance_of_currency;
    @Column(name = "Terminal_ID")
    private String Terminal_ID;
    @Column(name = "координаты")
    private String Coordinats;

    public ATM() {

    }

    public ATM(Integer BIK, String names_of_divisions, String region, String locality, String addres, String position, String workingTime, Boolean issuance_of_currency, String terminal_ID, String coordinats) {
        this.BIK = BIK;
        Names_of_divisions = names_of_divisions;
        Region = region;
        Locality = locality;
        Addres = addres;
        Position = position;
        WorkingTime = workingTime;
        Issuance_of_currency = issuance_of_currency;
        Terminal_ID = terminal_ID;
        Coordinats = coordinats;
    }


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBIK() {
        return BIK;
    }

    public void setBIK(Integer BIK) {
        this.BIK = BIK;
    }

    public String getNames_of_divisions() {
        return Names_of_divisions;
    }

    public void setNames_of_divisions(String names_of_divisions) {
        Names_of_divisions = names_of_divisions;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getLocality() {
        return Locality;
    }

    public void setLocality(String locality) {
        Locality = locality;
    }

    public String getAddres() {
        return Addres;
    }

    public void setAddres(String addres) {
        Addres = addres;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getWorkingTime() {
        return WorkingTime;
    }

    public void setWorkingTime(String workingTime) {
        WorkingTime = workingTime;
    }

    public Boolean getIssuance_of_currency() {
        return Issuance_of_currency;
    }

    public void setIssuance_of_currency(Boolean issuance_of_currency) {
        Issuance_of_currency = issuance_of_currency;
    }

    public String getTerminal_ID() {
        return Terminal_ID;
    }

    public void setTerminal_ID(String terminal_ID) {
        Terminal_ID = terminal_ID;
    }

    public String getCoordinats() {
        return Coordinats;
    }

    public void setCoordinats(String coordinats) {
        Coordinats = coordinats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ATM atm = (ATM) o;

        if (id != null ? !id.equals(atm.id) : atm.id != null) return false;
        if (BIK != null ? !BIK.equals(atm.BIK) : atm.BIK != null) return false;
        if (Names_of_divisions != null ? !Names_of_divisions.equals(atm.Names_of_divisions) : atm.Names_of_divisions != null)
            return false;
        if (Region != null ? !Region.equals(atm.Region) : atm.Region != null) return false;
        if (Locality != null ? !Locality.equals(atm.Locality) : atm.Locality != null) return false;
        if (Addres != null ? !Addres.equals(atm.Addres) : atm.Addres != null) return false;
        if (Position != null ? !Position.equals(atm.Position) : atm.Position != null) return false;
        if (WorkingTime != null ? !WorkingTime.equals(atm.WorkingTime) : atm.WorkingTime != null) return false;
        if (Issuance_of_currency != null ? !Issuance_of_currency.equals(atm.Issuance_of_currency) : atm.Issuance_of_currency != null)
            return false;
        if (Terminal_ID != null ? !Terminal_ID.equals(atm.Terminal_ID) : atm.Terminal_ID != null) return false;
        return Coordinats != null ? Coordinats.equals(atm.Coordinats) : atm.Coordinats == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (BIK != null ? BIK.hashCode() : 0);
        result = 31 * result + (Names_of_divisions != null ? Names_of_divisions.hashCode() : 0);
        result = 31 * result + (Region != null ? Region.hashCode() : 0);
        result = 31 * result + (Locality != null ? Locality.hashCode() : 0);
        result = 31 * result + (Addres != null ? Addres.hashCode() : 0);
        result = 31 * result + (Position != null ? Position.hashCode() : 0);
        result = 31 * result + (WorkingTime != null ? WorkingTime.hashCode() : 0);
        result = 31 * result + (Issuance_of_currency != null ? Issuance_of_currency.hashCode() : 0);
        result = 31 * result + (Terminal_ID != null ? Terminal_ID.hashCode() : 0);
        result = 31 * result + (Coordinats != null ? Coordinats.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ATM{" +
                "id=" + id +
                ", BIK=" + BIK +
                ", Names_of_divisions='" + Names_of_divisions + '\'' +
                ", Region='" + Region + '\'' +
                ", Locality='" + Locality + '\'' +
                ", Addres='" + Addres + '\'' +
                ", Position='" + Position + '\'' +
                ", WorkingTime='" + WorkingTime + '\'' +
                ", Issuance_of_currency=" + Issuance_of_currency +
                ", Terminal_ID='" + Terminal_ID + '\'' +
                ", Coordinats='" + Coordinats + '\'' +
                '}';
    }
}
