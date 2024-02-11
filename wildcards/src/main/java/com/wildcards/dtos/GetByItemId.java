package com.wildcards.dtos;

import javax.validation.constraints.NotNull;

public class GetByItemId {
	
	@NotNull
	private int itemId;

	public GetByItemId() {
		
	}

	public GetByItemId(@NotNull int itemId) {
		super();
		this.itemId = itemId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + itemId;
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
		GetByItemId other = (GetByItemId) obj;
		if (itemId != other.itemId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GetByItemId [itemId=" + itemId + "]";
	}
	
}
