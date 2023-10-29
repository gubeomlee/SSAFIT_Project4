package com.ssafy.ssafit.model.dto;

public class Video {
	private int video_id;
	private String title;
	private String creator;
	private String part;
	private int view_count;

	public Video() {
		// TODO Auto-generated constructor stub
	}

	public Video(String title, String creator, String part, int view_count) {
		this.title = title;
		this.creator = creator;
		this.part = part;
		this.view_count = view_count;
	}

	public Video(int video_id, String title, String creator, String part, int view_count) {
		this.video_id = video_id;
		this.title = title;
		this.creator = creator;
		this.part = part;
		this.view_count = view_count;
	}

	public int getVideo_id() {
		return video_id;
	}

	public void setVideo_id(int video_id) {
		this.video_id = video_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public int getView_count() {
		return view_count;
	}

	public void setView_count(int view_count) {
		this.view_count = view_count;
	}

	@Override
	public String toString() {
		return "Video [video_id=" + video_id + ", title=" + title + ", creator=" + creator + ", part=" + part
				+ ", view_count=" + view_count + "]";
	}
}
