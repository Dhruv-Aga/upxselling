package api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRespository extends JpaRepository<UserDetails, Long> {
    @Query(value = "select * from user_detail ORDER BY id LIMIT :start OFFSET :end", nativeQuery = true)
    List<UserDetails> findAllLimit(@Param("start") int start, @Param("end") int end);
}