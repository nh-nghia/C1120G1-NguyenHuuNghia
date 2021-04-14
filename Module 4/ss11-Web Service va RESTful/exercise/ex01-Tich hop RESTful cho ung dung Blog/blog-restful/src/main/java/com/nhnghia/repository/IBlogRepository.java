package com.nhnghia.repository;

import com.nhnghia.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBlogRepository extends JpaRepository<Blog, Long> {

    Page<Blog> findAll(Pageable pageable);

    Page<Blog> findByTitleContaining(String txtSearch, Pageable pageable);

    Page<Blog> findByCategoryId(Long id, Pageable pageable);

//    Page<Blog> findAll(Pageable pageable, Sort sort);

    Page<Blog> findByOrderByCreateDateAsc(Pageable pageable);

    Page<Blog> findByOrderByCreateDateDesc(Pageable pageable);

}