
public class Boring {
	private String boring;
	
	public Boring() {
		boring = "Oh man, this is so boring...";
	}
	
	public Boring(String b) {
		boring = b;
	}

	public String getBoring() {
		return boring;
	}

	public void setBoring(String boring) {
		this.boring = boring;
	}

	@Override
	public String toString() {
		return "Boring [boring=" + boring + "]";
	}
}
