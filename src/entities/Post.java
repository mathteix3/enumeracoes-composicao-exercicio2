package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Post {
    private LocalDateTime moment;
    private String title;
    private String content;
    private Integer likes;

    private final ArrayList<Comment> comments = new ArrayList<>();

    public Post() {
    }

    public Post(LocalDateTime moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void addComment(String comment){
        comments.add(new Comment(comment));
    }

    public String getComment() {
        StringBuilder commentBuilder = new StringBuilder();
        for (Comment c : comments) {
            if (commentBuilder.length() > 0) {
                commentBuilder.append("\n");
            }
            commentBuilder.append(c.getText());
        }
        return commentBuilder.toString();
    }

    @Override
    public String toString() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        return "Title: " + getTitle() + "\n" +
                "Likes: " + getLikes() + "\n" +
                "Moment: " + getMoment().format(dateTimeFormatter) + "\n" +
                "Content: " + getContent() + "\n" +
                "Comments:\n" + getComment();
    }
}
