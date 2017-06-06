package com.tedu.mapper;

import com.tedu.pojo.Story;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2017/6/5.
 */
@Component
public interface StoryMapper {
    public List<Story> findStoryByUserId(String userId);

    List<Story> findAll();

    Story findStoryByStoryId(String storyId);
}
