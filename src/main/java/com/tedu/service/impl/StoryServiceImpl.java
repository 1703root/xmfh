package com.tedu.service.impl;

import com.tedu.mapper.StoryMapper;
import com.tedu.pojo.Story;
import com.tedu.service.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/6/5.
 */
@Service
public class StoryServiceImpl implements StoryService{

    @Autowired
    private StoryMapper storyMapper;

    @Override
    public List<Story> findStoryByUserId(String userId) {
        return storyMapper.findStoryByUserId(userId);
    }

    @Override
    public List<Story> findAll() {
        return storyMapper.findAll();
    }

    @Override
    public Story findStoryByStoryId(String storyId) {
        return storyMapper.findStoryByStoryId(storyId);
    }
}
