public class BuddyInfo {
	private String buddy;
	
	// Welcome your buddy
	public BuddyInfo(String name) {
		setBuddy(name);
		// System.out.println("Hello " + getBuddy() + "!");
	}
	
	public void SayHello(){
		System.out.println("Hello " + getBuddy() + "!");
	}
	
	/* "Remember" your buddy's name
	 * Returns - variable buddy
	 */
	protected String getBuddy() {
		return buddy;
	}
	
	/* Set a buddy's name
	 * Alters - variable buddy
	 */
	protected void setBuddy(String newName) {
		this.buddy = newName;
	}

}
