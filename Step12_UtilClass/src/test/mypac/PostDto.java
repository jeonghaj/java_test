package test.mypac;

public class PostDto {
	private Integer postnum;
	private String postauthor;
	private String posttitle;
	
	public PostDto() {}
	
	public PostDto(Integer postnum, String postauthor, String posttitle) {
		super();
		this.postnum = postnum;
		this.postauthor = postauthor;
		this.posttitle = posttitle;
		
		
	}

	public Integer getPostnum() {
		return postnum;
	}

	public void setPostnum(Integer postnum) {
		this.postnum = postnum;
	}

	public String getPostauthor() {
		return postauthor;
	}

	public void setPostauthor(String postauthor) {
		this.postauthor = postauthor;
	}

	public String getPosttitle() {
		return posttitle;
	}

	public void setPosttitle(String posttitle) {
		this.posttitle = posttitle;
	}
	
	
}
