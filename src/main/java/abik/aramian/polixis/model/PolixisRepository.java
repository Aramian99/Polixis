package abik.aramian.polixis.model;

import abik.aramian.polixis.model.data.Polixis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolixisRepository extends JpaRepository<Polixis, Integer> {

}
