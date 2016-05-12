package com.mepark.entity;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ProjectTest {

	@Test
	public void 생성자() {
		String name = "testProject";
		Project project = new Project(name);
		assertThat(project.getName(), is(name));
	}

	@Test(expected = IllegalArgumentException.class)
	public void 프로젝트이름_Null인경우_예외발생() {
		String name = null;
		Project project = new Project(name);
		assertThat(project.getName(), is(name));
	}
	
	@Test
	public void 프로젝트이름변경() {
		String name = "testProject";
		Project project = new Project(name);
		
		String changedName = "changedTestProject";
		project.changeName(changedName);
		
		assertThat(project.getName(), is(changedName));
	}
}
