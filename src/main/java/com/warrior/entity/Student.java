package com.warrior.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lqh
 * @since 2018-05-05
 */
@TableName("tb_student")
public class Student extends Model<Student> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	@TableField("stu_name")
	private String stuName;
	@TableField("stu_number")
	private String stuNumber;
	private Integer age;


	public Integer getId() {
		return id;
	}

	public Student setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getStuName() {
		return stuName;
	}

	public Student setStuName(String stuName) {
		this.stuName = stuName;
		return this;
	}

	public String getStuNumber() {
		return stuNumber;
	}

	public Student setStuNumber(String stuNumber) {
		this.stuNumber = stuNumber;
		return this;
	}

	public Integer getAge() {
		return age;
	}

	public Student setAge(Integer age) {
		this.age = age;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
