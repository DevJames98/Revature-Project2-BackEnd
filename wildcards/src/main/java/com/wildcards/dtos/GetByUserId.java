package com.wildcards.dtos;

import javax.validation.constraints.NotNull;

public class GetByUserId {

  @NotNull
  private int userId;

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + userId;
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
    GetByUserId other = (GetByUserId) obj;
    if (userId != other.userId)
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "GetByUserId [userId=" + userId + "]";
  }

  public GetByUserId() {
  }

  public GetByUserId(@NotNull int userId) {
    this.userId = userId;
  }
}