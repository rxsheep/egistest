package szolkiewicz.michal.egis;

public class Technology {
	private String name;
	private String use;
	private String reason;
	private String lifeCycle;
	
	public Technology(String name, String use, String reason, String lifeCycle) {
		this.name = name;
		this.use = use;
		this.reason = reason;
		this.lifeCycle = lifeCycle;
	}
	
	public Technology(String name, String use, String reason) {
		this.name = name;
		this.use = use;
		this.reason = reason;
	}


	public Technology(String name, String use) {
		this.name = name;
		this.use = use;
	}

	public String getName() {
		return name;
	}

	public String getUse() {
		return use;
	}

	public String getReason() {
		return reason;
	}

	public String getLifeCycle() {
		return lifeCycle;
	}

	
}
