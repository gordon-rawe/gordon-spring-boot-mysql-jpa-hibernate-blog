package gordon.models;

import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by gordon on 2015/8/15.
 */
@Transactional
public interface AddressDAO extends CrudRepository<Address, Long> {
}