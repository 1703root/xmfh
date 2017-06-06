package com.tedu.service;

import com.tedu.pojo.Story;

import java.util.List;

/**
 * Created by Administrator on 2017/6/5.
 */
public interface StoryService {

    List<Story> findStoryByUserId(String userId);

    List<Story> findAll();

    Story findStoryByStoryId(String storyId);
}
