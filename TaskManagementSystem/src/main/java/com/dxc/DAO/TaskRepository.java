package com.dxc.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.model.Task;
@Repository
public interface TaskRepository extends JpaRepository<Task,Integer>{

}
