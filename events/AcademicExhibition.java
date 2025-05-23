package events;

import java.util.ArrayList;

public class AcademicExhibition extends Event  {
    private ArrayList<String> stands;
    private ArrayList<String> professor;

    public ArrayList<String> getStands() {
        return stands;
    }

    public void setStands(ArrayList<String> stands) {
        this.stands = stands;
    }

    public ArrayList<String> getProfessor() {
        return professor;
    }

    public void setProfessor(ArrayList<String> professor) {
        this.professor = professor;
    }
}
