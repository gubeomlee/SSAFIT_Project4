package com.ssafy.ssafit.model.dto;

public class Review {
	private int review_id;
	private int video_id;
	private int user_id;
	private String content;

	public Review() {
		// TODO Auto-generated constructor stub
	}

	public Review(int review_id, String content) {
		this.review_id = review_id;
		this.content = content;
	}

	public Review(int video_id, int user_id, String content) {
		this.video_id = video_id;
		this.user_id = user_id;
		this.content = content;
	}

	public Review(int review_id, int video_id, int user_id, String content) {
		this.review_id = review_id;
		this.video_id = video_id;
		this.user_id = user_id;
		this.content = content;
	}

	public int getReview_id() {
		return review_id;
	}

	public void setReview_id(int review_id) {
		this.review_id = review_id;
	}

	public int getVideo_id() {
		return video_id;
	}

	public void setVideo_id(int video_id) {
		this.video_id = video_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Review [review_id=" + review_id + ", video_id=" + video_id + ", user_id=" + user_id + ", content="
				+ content + "]";
	}
}
