package Array;

public class Subject {
    private String subjectId;
    private String subName;
    private int maxMarks;
    private int marksObtained;

    public int getMarksObtained() {
        return marksObtained;
    }

    public String getSubName() {
        return subName;
    }

    public void setMarksObtained(int marksObtained) {
        this.marksObtained = marksObtained;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }
    Subject(String sid,String sname){
        subjectId=sid;
        subName=sname;
    }
    Subject(String sid,String sname,int maxMarks,int marksObtained){
        subjectId=sid;
        subName=sname;
        this.maxMarks=maxMarks;
        this.marksObtained=marksObtained;
    }

    @Override
    public String toString() {
        return "SUBID\t"+subjectId+" SUBNAME\t"+subName+" MAX MARKS\t"+maxMarks+" MARKS OBTAINED\t"+marksObtained;
    }
}
