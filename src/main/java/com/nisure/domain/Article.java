package com.nisure.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 卓小建
 * Date: 2019-04-08
 * Time: 11:22
 * 文章表
 */
@Entity
public class Article implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String text;
    private Integer browerCount;
    private Date createTime;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @OneToMany( fetch = FetchType.LAZY, mappedBy = "article", cascade = CascadeType.ALL)
    private List<Comment> comments;

    @OneToOne(fetch = FetchType.LAZY)
    private Label label;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getBrowerCount() {
        return browerCount;
    }

    public void setBrowerCount(Integer browerCount) {
        this.browerCount = browerCount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }
}
