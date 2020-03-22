package sheridan.gergess.assignment3.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PetDataRepository extends JpaRepository<Pet, Integer> {
}
