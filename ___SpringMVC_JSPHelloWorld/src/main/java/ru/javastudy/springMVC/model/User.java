package ru.javastudy.springMVC.model;

import javax.persistence.*;

/**
 * Created by Гагарин on 24.09.2017.
 */
@Entity
@Table(name = "user_data", schema = "user")
public class User {
    private int userId;
    private String name;
    private String Password;
    private String Email;
    private String Color;
    private String Url;
    private String Food;

    @Id
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "user_password")
    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    @Basic
    @Column(name = "user_email")
    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    @Basic
    @Column(name = "user_color")
    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    @Basic
    @Column(name = "user_url")
    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        this.Url = url;
    }

    @Basic
    @Column(name = "user_food")
    public String getFood() {
        return Food;
    }

    public void setFood(String food) {
        this.Food = food;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User that = (User) o;

        if (userId != that.userId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (Password != null ? !Password.equals(that.Password) : that.Password != null) return false;
        if (Email != null ? !Email.equals(that.Email) : that.Email != null) return false;
        if (Color != null ? !Color.equals(that.Color) : that.Color != null) return false;
        if (Url != null ? !Url.equals(that.Url) : that.Url != null) return false;
        if (Food != null ? !Food.equals(that.Food) : that.Food != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (Password != null ? Password.hashCode() : 0);
        result = 31 * result + (Email != null ? Email.hashCode() : 0);
        result = 31 * result + (Color != null ? Color.hashCode() : 0);
        result = 31 * result + (Url != null ? Url.hashCode() : 0);
        result = 31 * result + (Food != null ? Food.hashCode() : 0);
        return result;
    }
}
