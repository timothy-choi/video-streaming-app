
package API.Community;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.org.List;


public interface CommunitiesRepository extends MongoRepository<Communities, String> {
    List<Communities> findAll();

    Communities findByCommunityId(Long communityId);

    void deleteCommunitiesBycommunityId(Long communityId);

    List<User> findMembersByCommunityId(Long communityId);

    Communities findCommunitiesByName(String communityName);

    List<VideoPost> findVideoPostsByCommunityId(Long communityId);
}
