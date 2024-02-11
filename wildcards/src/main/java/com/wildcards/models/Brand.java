package com.wildcards.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Brand {
	
				@Id
				@GeneratedValue(strategy = GenerationType.IDENTITY)
				@Column(name = "brand_id")
				private int brandId;
				
				@Column(name = "brand")
				private String Brand;

				public int getBrandId() {
					return brandId;
				}

				public void setBrandId(int brandId) {
					this.brandId = brandId;
				}

				public String getBrand() {
					return Brand;
				}

				public void setBrand(String brand) {
					Brand = brand;
				}

				@Override
				public int hashCode() {
					final int prime = 31;
					int result = 1;
					result = prime * result + ((Brand == null) ? 0 : Brand.hashCode());
					result = prime * result + brandId;
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
					Brand other = (Brand) obj;
					if (Brand == null) {
						if (other.Brand != null)
							return false;
					} else if (!Brand.equals(other.Brand))
						return false;
					if (brandId != other.brandId)
						return false;
					return true;
				}

				@Override
				public String toString() {
					return "Brand [brandId=" + brandId + ", Brand=" + Brand + "]";
				}

				public Brand(int brandId, String brand) {
					super();
					this.brandId = brandId;
					Brand = brand;
				}

				public Brand() {
					super();
					// TODO Auto-generated constructor stub
				}

			
				
		} 





