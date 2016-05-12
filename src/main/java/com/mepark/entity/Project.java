package com.mepark.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.util.Assert;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
@Entity
public class Project implements Serializable {

	private static final long serialVersionUID = 5977210882245085531L;

	@Id
	@GeneratedValue
	private Long id;

	@Getter
	private String name;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "project", orphanRemoval = true)
	private List<Item> items;

	public Project(String name) {
		setName(name);
	}

	private void setName(String name) {
		Assert.hasText(name, "project.require.name");
		this.name = name;
	}

	public void changeName(String name) {
		setName(name);
	}
}
