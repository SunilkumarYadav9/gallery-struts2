package net.feminaexlux.gallery.struts2.model;

import org.hibernate.annotations.DiscriminatorOptions;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "resource")
@Inheritance
@DiscriminatorColumn(name = "resource_type")
@DiscriminatorOptions(insert = false)
public class Resource implements Serializable {
	@Id
	@Column(name = "resource_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;

	@Column(name = "resource_type", length = 50)
	protected String type;

	@Column(name = "resource_name", nullable = false, length = 50)
	protected String name;

	@Column(name = "resource_created")
	@Temporal(TemporalType.TIMESTAMP)
	protected Date created;

	@Column(name = "resource_updated")
	@Temporal(TemporalType.TIMESTAMP)
	protected Date updated;

	@Column(name = "resource_deleted")
	@Temporal(TemporalType.TIMESTAMP)
	protected Date deleted;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public Date getDeleted() {
		return deleted;
	}

	public void setDeleted(Date deleted) {
		this.deleted = deleted;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Resource resource = (Resource) o;

		if (id != resource.id) return false;
		if (created != null ? !created.equals(resource.created) : resource.created != null) return false;
		if (deleted != null ? !deleted.equals(resource.deleted) : resource.deleted != null) return false;
		if (name != null ? !name.equals(resource.name) : resource.name != null) return false;
		if (type != null ? !type.equals(resource.type) : resource.type != null) return false;
		if (updated != null ? !updated.equals(resource.updated) : resource.updated != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + (type != null ? type.hashCode() : 0);
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (created != null ? created.hashCode() : 0);
		result = 31 * result + (updated != null ? updated.hashCode() : 0);
		result = 31 * result + (deleted != null ? deleted.hashCode() : 0);
		return result;
	}
}
