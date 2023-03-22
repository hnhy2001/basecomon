package com.example.basecomon.service.Impl;

import com.example.basecomon.query.CustomRsqlVisitor;
import com.example.basecomon.repository.BaseRepository;
import com.example.basecomon.service.BaseService;
import cz.jirutka.rsql.parser.RSQLParser;
import cz.jirutka.rsql.parser.ast.Node;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public abstract class BaseServiceImpl<T> implements BaseService<T> {
    protected abstract BaseRepository<T> getRepository();

    @Override
    public T getAll() {
        return null;
    }

    @Override
    public List<T> search(String filter){
        Node rootNode = new RSQLParser().parse(filter);
        Specification<T> spec = rootNode.accept(new CustomRsqlVisitor<T>());
        return this.getRepository().findAll(spec);
    }

    @Override
    public T create(T t) {
        return this.getRepository().save(t);
    }

    @Override
    public T update(T t){
        return null;
    }
    @Override
    public T getById(Long id) {
        return null;
    }

    @Override
    public String delete(Long id){
//        T t = this.getRepository().findAllById(id);
//        this.getRepository().delete(t);
        return "delete success";
    }


}
