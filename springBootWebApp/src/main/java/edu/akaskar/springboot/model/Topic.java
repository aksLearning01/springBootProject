package edu.akaskar.springboot.model;

import java.io.Serializable;

public class Topic implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Topic() {}
	/**
	 * @param id
	 * @param name
	 * @param description
	 */
	public Topic(Long id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Topic [id=" + id + ", name=" + name + ", description=" + description + "]";
	}

	private Long id;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	private String name;
	private String description;

}
