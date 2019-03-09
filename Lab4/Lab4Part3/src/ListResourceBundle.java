public class ListResourceBundle //extends ResourceBundle
{
	public static String handleGetObject(String key)
	{		
		switch(key.toLowerCase())
		{
			case "translate to french": key = "Traduire en Anglais"; break;
			case "one": key = "Un"; break;
			case "two": key = "Deux"; break;
			case "three": key = "Trois"; break;
			case "traduire en anglais": key = "Translate to French"; break;
			case "un": key = "One"; break;
			case "deux": key = "Two"; break;
			case "trois": key = "Three"; break;
		}
		return key;
	}
	/*
	@Override
	protected Object handleGetObject(String key)
	{
		switch(key.toLowerCase())
		{
			case "translate to french": key = "Traduire en Anglais"; break;
			case "one": key = "Un"; break;
			case "two": key = "Deux"; break;
			case "three": key = "Trois"; break;
			case "traduire en anglais": key = "Translate to French"; break;
			case "un": key = "One"; break;
			case "deux": key = "Two"; break;
			case "trois": key = "Three"; break;
		}
		return (Object)key;
	}

	@Override
	public Enumeration<String> getKeys()
	{
		return null;
	}
	*/
}