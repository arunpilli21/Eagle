/*               "Copyright 2020 Infosys Ltd.
               Use of this source code is governed by GPL v3 license that can be found in the LICENSE file or at https://opensource.org/licenses/GPL-3.0
               This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License version 3" */
/**
© 2017 - 2019 Infosys Limited, Bangalore, India. All Rights Reserved. 
Version: 1.10

Except for any free or open source software components embedded in this Infosys proprietary software program (“Program”),
this Program is protected by copyright laws, international treaties and other pending or existing intellectual property rights in India,
the United States and other countries. Except as expressly permitted, any unauthorized reproduction, storage, transmission in any form or
by any means (including without limitation electronic, mechanical, printing, photocopying, recording or otherwise), or any distribution of 
this Program, or any portion of it, may result in severe civil and criminal penalties, and will be prosecuted to the maximum extent possible
under the law.

Highly Confidential
 
*/
substitute url based on requirement

import java.util.Date;
import java.util.List;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("mv_user_goals_tracker")
public class UserGoalTracker {

	@PrimaryKey
	private UserGoalTrackerKey learningGoalsTrackerPrimaryKey;
	@Column("created_on")
	private Date createdOn;
	@Column("goal_content_id")
	private List<String> goalContentId;
	@Column("goal_desc")
	private String goalDescription;
	@Column("goal_duration")
	private Integer goalDuration;
	@Column("goal_start_date")
	private Date goalStartDate;
	@Column("goal_end_date")
	private Date goalEndDate;
	@Column("goal_title")
	private String goal_title;
	@Column("last_updated_on")
	private Date lastUpdatedOn;
	@Column("version")
	private Date version;
	@Column("org")
	private Date org;

	public Date getOrg() {
		return org;
	}

	public void setOrg(Date org) {
		this.org = org;
	}

	public Date getVersion() {
		return version;
	}

	public void setVersion(Date version) {
		this.version = version;
	}

	public UserGoalTrackerKey getLearningGoalsTrackerPrimaryKey() {
		return learningGoalsTrackerPrimaryKey;
	}

	public void setLearningGoalsTrackerPrimaryKey(UserGoalTrackerKey learningGoalsTrackerPrimaryKey) {
		this.learningGoalsTrackerPrimaryKey = learningGoalsTrackerPrimaryKey;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public List<String> getGoalContentId() {
		return goalContentId;
	}

	public void setGoalContentId(List<String> goalContentId) {
		this.goalContentId = goalContentId;
	}

	public String getGoalDescription() {
		return goalDescription;
	}

	public void setGoalDescription(String goalDescription) {
		this.goalDescription = goalDescription;
	}

	public Integer getGoalDuration() {
		return goalDuration;
	}

	public void setGoalDuration(Integer goalDuration) {
		this.goalDuration = goalDuration;
	}

	public Date getGoalStartDate() {
		return goalStartDate;
	}

	public void setGoalStartDate(Date goalStartDate) {
		this.goalStartDate = goalStartDate;
	}

	public Date getGoalEndDate() {
		return goalEndDate;
	}

	public void setGoalEndDate(Date goalEndDate) {
		this.goalEndDate = goalEndDate;
	}

//	public String getGoalTitle() {
//		return goalTitle;
//	}
//
//	public void setGoalTitle(String goalTitle) {
//		this.goalTitle = goalTitle;
//	}

	public Date getLastUpdatedOn() {
		return lastUpdatedOn;
	}

	public void setLastUpdatedOn(Date lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

}
