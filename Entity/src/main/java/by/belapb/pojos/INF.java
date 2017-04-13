package by.belapb.pojos;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Sukora Stas.
 */

@Entity
@Table
public class INF implements Serializable {
    private static final long serialVersionUID = 4L;
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
    @Column(name = "Cash_in")
    private Boolean Cash_in;
    @Column(name = "Terminal_ID")
    private String Terminal_ID;
    @Column(name = "координаты")
    private String Coordinats;

    public INF() {

    }

    public INF(Integer BIK, String names_of_divisions, String region, String locality, String addres, String position, String workingTime, Boolean cash_in, String terminal_ID, String coordinats) {
        this.BIK = BIK;
        Names_of_divisions = names_of_divisions;
        Region = region;
        Locality = locality;
        Addres = addres;
        Position = position;
        WorkingTime = workingTime;
        Cash_in = cash_in;
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

    public Boolean getCash_in() {
        return Cash_in;
    }

    public void setCash_in(Boolean cash_in) {
        Cash_in = cash_in;
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

        INF inf = (INF) o;

        if (id != null ? !id.equals(inf.id) : inf.id != null) return false;
        if (BIK != null ? !BIK.equals(inf.BIK) : inf.BIK != null) return false;
        if (Names_of_divisions != null ? !Names_of_divisions.equals(inf.Names_of_divisions) : inf.Names_of_divisions != null)
            return false;
        if (Region != null ? !Region.equals(inf.Region) : inf.Region != null) return false;
        if (Locality != null ? !Locality.equals(inf.Locality) : inf.Locality != null) return false;
        if (Addres != null ? !Addres.equals(inf.Addres) : inf.Addres != null) return false;
        if (Position != null ? !Position.equals(inf.Position) : inf.Position != null) return false;
        if (WorkingTime != null ? !WorkingTime.equals(inf.WorkingTime) : inf.WorkingTime != null) return false;
        if (Cash_in != null ? !Cash_in.equals(inf.Cash_in) : inf.Cash_in != null) return false;
        if (Terminal_ID != null ? !Terminal_ID.equals(inf.Terminal_ID) : inf.Terminal_ID != null) return false;
        return Coordinats != null ? Coordinats.equals(inf.Coordinats) : inf.Coordinats == null;
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
        result = 31 * result + (Cash_in != null ? Cash_in.hashCode() : 0);
        result = 31 * result + (Terminal_ID != null ? Terminal_ID.hashCode() : 0);
        result = 31 * result + (Coordinats != null ? Coordinats.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "INF{" +
                "id=" + id +
                ", BIK=" + BIK +
                ", Names_of_divisions='" + Names_of_divisions + '\'' +
                ", Region='" + Region + '\'' +
                ", Locality='" + Locality + '\'' +
                ", Addres='" + Addres + '\'' +
                ", Position='" + Position + '\'' +
                ", WorkingTime='" + WorkingTime + '\'' +
                ", Cash_in=" + Cash_in +
                ", Terminal_ID='" + Terminal_ID + '\'' +
                ", Coordinats='" + Coordinats + '\'' +
                '}';
    }
}
