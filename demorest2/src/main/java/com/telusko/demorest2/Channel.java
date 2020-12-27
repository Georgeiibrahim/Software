
public enum Channel {
	SMS,EMAIL;
	public String toString() {
		switch(this)
		{
		case SMS:return "SMS";
		case EMAIL: return "EMAIL";
		default:
			return "UNSPECIFIED";
		}
	};

}
