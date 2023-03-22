package com.example.basecomon.repository;

import org.hibernate.criterion.CriteriaQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

@NoRepositoryBean
public interface BaseRepository<T> extends JpaSpecificationExecutor<T>, PagingAndSortingRepository<T, Long> {
}
