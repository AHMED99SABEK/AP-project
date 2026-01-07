public class Feedback {
private String feedbackId;
private String member;
private String gymClass;
private float rating;
private String comment;
private String date;

    public Feedback(String feedbackId, String member, String gymClass, float rating, String comment, String date) {
        this.feedbackId = feedbackId;
        this.member = member;
        this.gymClass = gymClass;
        this.rating = rating;
        this.comment = comment;
        this.date = date;
    }

    public String getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(String feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public String getGymClass() {
        return gymClass;
    }

    public void setGymClass(String gymClass) {
        this.gymClass = gymClass;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
