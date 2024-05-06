public class Studies {
    private String programName;
    private String description;
    private int totalSemesters;
    private int maxITNs;

    public Studies(String programName, String description, int totalSemesters, int maxITNs) {
        this.programName = programName;
        this.description = description;
        this.totalSemesters = totalSemesters;
        this.maxITNs = maxITNs;
    }
    public String getProgramName() {
        return programName;
    }

}
