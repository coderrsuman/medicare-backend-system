
package com.project.medicare.Service;

import com.project.medicare.Entity.Medicine;
import com.project.medicare.Repository.MedicineRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicineService {

    private final MedicineRepository medicineRepository;

    public MedicineService(MedicineRepository medicineRepository) {
        this.medicineRepository = medicineRepository;
    }

    public Medicine addMedicine(Medicine medicine) {
        return medicineRepository.save(medicine);
    }

    public List<Medicine> getAllMedicines() {
        return medicineRepository.findAll();
    }

    public Optional<Medicine> getMedicineById(Long id) {
        return medicineRepository.findById(id);
    }

    public Medicine updateMedicine(Long id, Medicine updatedMedicine) {
        return medicineRepository.findById(id)
                .map(existingMedicine -> {
                    existingMedicine.setName(updatedMedicine.getName());
                    existingMedicine.setDescription(updatedMedicine.getDescription());
                    existingMedicine.setPrice(updatedMedicine.getPrice());
                    existingMedicine.setStockQuantity(updatedMedicine.getStockQuantity());
                    existingMedicine.setManufacturer(updatedMedicine.getManufacturer());
                    existingMedicine.setCategory(updatedMedicine.getCategory());

                    return medicineRepository.save(existingMedicine);
                })
                .orElse(null);
    }

    public boolean deleteMedicine(Long id) {
        if (!medicineRepository.existsById(id)) {
            return false;
        }

        medicineRepository.deleteById(id);
        return true;
    }
}
