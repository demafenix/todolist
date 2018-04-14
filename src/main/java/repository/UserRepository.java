package repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Todolist;

@Repository
public interface UserRepository extends JpaRepository<Todolist,String>{
	public List<Todolist> findAllByOrderByDateAsc();
	public List<Todolist> findByDate(Date date);
}
