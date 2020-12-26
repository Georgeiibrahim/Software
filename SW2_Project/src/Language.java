
public enum Language {
	Arabic,English;
	public String toString() {
		switch(this)
		{
		case Arabic:return "Arabic";
		case English: return "English";
		default:
			return "UNSPECIFIED";
		}
	};
}
