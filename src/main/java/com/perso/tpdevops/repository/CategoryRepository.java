package com.perso.tpdevops.repository;

import com.perso.tpdevops.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    @NativeQuery(value = "SELECT * FROM categories")
    List<Category> findAllCategories();

    @NativeQuery(value = "SELECT * FROM categories WHERE id = ?1")
    Optional<Category> findCategoryById(Long id);
}
