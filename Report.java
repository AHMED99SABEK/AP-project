public class Report {
private String reportID;
private String reportDate;
private String reportType;


    public Report(String reportID, String reportDate, String reportType) {
        this.reportID = reportID;
        this.reportDate = reportDate;
        this.reportType = reportType;
    }

    public String getReportID() {
        return reportID;
    }

    public void setReportID(String reportID) {
        this.reportID = reportID;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }
}
