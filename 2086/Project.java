package com.htc.trainingexcerise.week1;
/* Week1 - Exercise question 2 */
public class Project {

	int projectId;
	String projectName;
	String projectHead;
	int noOfResources;
	
	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectHead() {
		return projectHead;
	}

	public void setProjectHead(String projectHead) {
		this.projectHead = projectHead;
	}

	public int getNoOfResources() {
		return noOfResources;
	}

	public void setNoOfResources(int noOfResources) {
		this.noOfResources = noOfResources;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Project projectObj=new Project();
		projectObj.setProjectId(1);
		projectObj.setProjectName("Java_Banking");
		projectObj.setProjectHead("XXX");
		projectObj.setNoOfResources(20);
		System.out.println(projectObj.getProjectId()+" "+projectObj.getProjectName()+" "+projectObj.getProjectHead()+" "+projectObj.getNoOfResources());
		
	}

}
