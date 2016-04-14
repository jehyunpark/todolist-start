package com.mepark.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
@Entity
public class Item implements Serializable {

	private static final long serialVersionUID = 7759965729769693477L;

	@Id
	@GeneratedValue
	private Long id;

	@Getter
	@Setter
	private String name;

	@OneToMany
	private List<Item> subItems;
}
