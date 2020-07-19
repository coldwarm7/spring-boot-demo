package cn.coldwarm7.demo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Users {
    @Id
    private int id;
    private String name;
    private int age;
}
