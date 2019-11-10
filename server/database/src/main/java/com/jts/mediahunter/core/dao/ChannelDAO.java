package com.jts.mediahunter.core.dao;

import com.jts.mediahunter.domain.entities.Channel;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Tony
 */
public interface ChannelDAO extends MongoRepository<Channel, String> {
    
    public List<Channel> findByExternalId(String channelId);

    public List<Channel> findByTrustedIsTrue();
}