package net.lxy520.validate.entity;

import javax.validation.constraints.NotNull;

/**
 * 标签
 * Created by YSTYLE on 2015-03-10 0010.
 */
public class Tag {

    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NotNull(message="标签名称不能为空！")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
