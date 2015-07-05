/**
 * 
 */
package com.jitworks.shareinfo.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

/**
 * @author j.paidimarla
 *
 */
@Entity
@Table(name = "shareinfo_fm_folder")
public class Folder {

	@Id
	@Column(name = "folder_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "folder_name")
	private String name;

	@JsonIgnore
	@Column(name = "folder_path")
	private String folderPath;

	@Column(name = "folder_parent_id")
	private Integer parentId;

	@JsonIgnore
	@Column(name = "description")
	private String description;

	@Column(name = "creation_time")
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime creationTime;

	@JsonIgnore
	@Column(name = "expiry_time")
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime expiryTime;
	
	@JsonIgnore
	@Column(name = "deleted")
	private boolean deleted;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "user_id_creator")
	private User user;
	
	@JsonIgnore
	@Column(name = "user_group_id")
	private int userGroupId;
	
	
}
