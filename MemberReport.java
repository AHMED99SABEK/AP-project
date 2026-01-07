public class MemberReport {
    private String member;
    private String reportDate;
    private String reportType;

    public MemberReport(String member, String reportDate, String reportType) {
        this.member = member;
        this.reportDate = reportDate;
        this.reportType = reportType;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
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
