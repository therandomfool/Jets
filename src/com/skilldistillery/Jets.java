package com.skilldistillery;

public abstract class Jets {
	private String capability;
	private String model;
	private Double speed;
	private Integer range;
	private Long price;
	private Double gsim;

//	public Jets(String model, Double speed, Integer range, Long price, Double gsim) {
//		this.model = model;
//		this.speed = speed;
//		this.range = range;
//		this.price = price;
//		this.gsim = gsim;
//	}

	public Jets(String capability, String model, Double speed, Long price, Integer range, Double gsim) {
		this.capability = capability;
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.gsim = gsim;
	}

	public String getCapability() {
		return capability;
	}

	public void setCapability(String capability) {
		this.capability = capability;
	}

	public Double getSpeedInMach() {
		return gsim = this.getSpeed() / 767.269;

	}

	public void setGsim(Double gsim) {
		this.gsim = gsim;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Double getSpeed() {
		return speed;
	}

	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	public Integer getRange() {
		return range;
	}

	public void setRange(Integer range) {
		this.range = range;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Jets [capability=" + capability + ", model=" + model + ", speed=" + speed + ", range=" + range
				+ ", price=" + price + ", gsim=" + gsim + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gsim == null) ? 0 : gsim.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((range == null) ? 0 : range.hashCode());
		result = prime * result + ((speed == null) ? 0 : speed.hashCode());
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
		Jets other = (Jets) obj;
		if (gsim == null) {
			if (other.gsim != null)
				return false;
		} else if (!gsim.equals(other.gsim))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (range == null) {
			if (other.range != null)
				return false;
		} else if (!range.equals(other.range))
			return false;
		if (speed == null) {
			if (other.speed != null)
				return false;
		} else if (!speed.equals(other.speed))
			return false;
		return true;
	}

	public void fly() {

	}

	public Double getGsim() {
		return gsim;
	}
}
