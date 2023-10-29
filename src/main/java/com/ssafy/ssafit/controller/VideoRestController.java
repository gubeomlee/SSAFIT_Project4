package com.ssafy.ssafit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.ssafit.model.dto.Video;
import com.ssafy.ssafit.model.service.VideoService;

@RestController
@RequestMapping("/api")
public class VideoRestController {

	@Autowired
	private VideoService videoService;

	@GetMapping("/video")
	public ResponseEntity<?> getList() {
		List<Video> list = videoService.getList();
		if (list == null || list.size() == 0) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<List<Video>>(list, HttpStatus.OK);
		}
	}

	@GetMapping("/video/{part}")
	public ResponseEntity<?> getByPart(@PathVariable String part) {
		List<Video> list = videoService.getByPart(part);
		if (list == null || list.size() == 0) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<List<Video>>(list, HttpStatus.OK);
		}
	}

	@GetMapping("/videoOne")
	public ResponseEntity<?> getVideo() {
		Video video = videoService.getVideo();
		if (video == null) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<Video>(video, HttpStatus.OK);
		}
	}
}
