package org.torychros.objectReposi;

public enum TabName {
	CONTACTS("Contacts"),ORPPORTUNITIES("Opportunities"),ORGANIZATIONS("Organizations"),EMAIL("email"),DASHBORADI("Dashboard"),SINGNOUT("Sign Out"),COMPAIGNS("Campaigns"),MORE("More");
	
	private String tabName;
	private TabName(String tabname) {
		this.tabName=tabname;
	}
	public String getTabNames() {
		return tabName;
	}
	

}
