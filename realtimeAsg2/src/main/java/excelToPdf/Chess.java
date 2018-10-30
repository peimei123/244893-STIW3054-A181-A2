package excelToPdf;

public class Chess {
    String  name, fieldID, fed,club,no, rtg;

    public Chess(String no, String name, String fieldID,String fed,String rtg,String club) {
        this.no = no;
        this.name = name;
        this.fieldID = fieldID;
        this.fed= fed;
        this.rtg = rtg;
        this.club = club;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFieldID() {
        return fieldID;
    }

    public void setFieldID(String fieldID) {
        this.fieldID = fieldID;
    }

    public String getFed() {
        return fed;
    }

    public void setFed(String fed) {
        this.fed = fed;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getRtg() {
        return rtg;
    }

    public void setRtg(String rtg) {
        this.rtg = rtg;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }
}
