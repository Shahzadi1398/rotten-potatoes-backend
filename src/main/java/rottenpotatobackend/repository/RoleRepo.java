package rottenpotatobackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rottenpotatobackend.models.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {
}
