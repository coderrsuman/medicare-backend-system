
package com.project.medicare.Repository;

import com.project.medicare.Entity.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicineRepository extends JpaRepository<Medicine, Long> {

}
