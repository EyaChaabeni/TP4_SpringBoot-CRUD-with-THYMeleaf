package net.javaguides.springboot.Service;

import java.util.List;

import net.javaguides.springboot.Staff;

public interface StaffService { void save(Staff staff);
    List<Staff> getAll(); Staff getById(Integer id); void delete(Staff staff);
}