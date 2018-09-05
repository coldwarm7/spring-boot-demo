package cn.coldwarm7.demo.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Create by coldwarm on 2018/9/5.
 */
@Entity
@Data
public class Student implements Serializable {

    @Id
    private int id;
    private String studentNumber;
    private String studentName;
    private String birthday;
    private String zhuanye;
    private String likes;
}
