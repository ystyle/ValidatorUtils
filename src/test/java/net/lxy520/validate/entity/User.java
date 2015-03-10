package net.lxy520.validate.entity;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.URL;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

/**
 * 用户
 * Created by YSTYLE on 2015-03-10 0010.
 */
public class User {
    private int id;
    @NotNull(message = "姓名不能为空！")
    private String name;

    @NotNull(message = "地址不能为空！")
    private String address;

    @Size(max = 11, min = 11, message = "长度只能为11位！")
    private String phoneNumber;

    @Email(message = "email地址无效！")
    @NotNull(message = "email地址不能为空！")
    private String email;

    @Min(value = 18, message = "必须年满18岁！")
    @Max(value = 30, message = "年龄不能大于30岁！")
    private int age;

    @NotNull
    @Valid
    private Set<Tag> tags = new HashSet<Tag>();

    @URL(message = "无效的URL地址")
    @NotNull(message = "URL不能为空！")
    private String url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
