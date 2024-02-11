package com.wildcards.dtos;

import javax.validation.constraints.NotNull;

//dto
public class GetByTypeId {

	@NotNull
	private int typeId;

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + typeId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GetByTypeId other = (GetByTypeId) obj;
		if (typeId != other.typeId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GetByTypeId [typeId=" + typeId + "]";
	}

	public GetByTypeId(@NotNull int typeId) {
		super();
		this.typeId = typeId;
	}

	public GetByTypeId() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
