package blazeskills.com.example.playforevents.Repository;

import blazeskills.com.example.playforevents.Entities.Events;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Events, Long> {

   Page<Events> findAllByOrganizer(String organizer, Pageable pageable);
}
