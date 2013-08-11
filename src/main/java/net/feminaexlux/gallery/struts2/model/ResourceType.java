package net.feminaexlux.gallery.struts2.model;

import javax.persistence.*;

@Entity
@Table(name = "resource_type")
public class ResourceType {
	protected String type;

	@Id
	@Column(name = "type", nullable = false, length = 50)
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		ResourceType that = (ResourceType) o;

		if (type != null ? !type.equals(that.type) : that.type != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		return type != null ? type.hashCode() : 0;
	}
}