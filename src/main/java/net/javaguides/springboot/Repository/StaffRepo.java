package net.javaguides.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.Staff;

public interface StaffRepo extends JpaRepository<Staff, Integer> {

}
