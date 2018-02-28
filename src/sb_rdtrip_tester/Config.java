package sb_rdtrip_tester;

import java.net.URI;

public class Config {
	
	private String url; 
	private String prefix; 
	private String email; 
	private String pass; 
	private String user; 
	private String creator;
	private String id; 
	private String version; 
	private String name;
	private String desc; 
	private URI TP_collection; 
	private boolean complete; 
	private boolean create_defaults; 
	
	public Config(String _url, String _prefix, String _email, String _pass, String _user, String _creator, String _id, String _version, 
			String _name, String _desc, URI _TP_collection, boolean _complete, boolean _create_defaults)
	{
		url = _url; 
		prefix = _prefix; 
		email =_email; 
		pass = _pass; 
		user = _user; 
		creator = _creator; 
		id = _id; 
		version = _version; 
		name = _name; 
		desc = _desc;
		TP_collection = _TP_collection; 
		complete = _complete; 
		create_defaults = _create_defaults; 
		
	}
	
	public String get_url()
	{
		return this.url; 
	}
	
	public String get_prefix()
	{
		return this.prefix; 
	}
	
	public String get_email()
	{
		return this.email; 
	}
	
	public String get_pass()
	{
		return this.pass; 
	}
	public String get_user()
	{
		return this.user; 
	}
	public String get_creator()
	{
		return this.creator; 
	}
	public String get_id()
	{
		return this.id; 
	}
	public String get_version()
	{
		return this.version; 
	}
	public String get_name()
	{
		return this.name; 
	}
	public String get_desc()
	{
		return this.desc; 
	}
	public URI get_TP_col()
	{
		return this.TP_collection; 
	}
	public boolean get_complete()
	{
		return this.complete; 
	}
	public boolean get_defaults()
	{
		return this.create_defaults; 
	}
	

}
